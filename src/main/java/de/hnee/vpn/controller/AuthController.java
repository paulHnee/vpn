package de.hnee.vpn.controller;


import de.hnee.vpn.handler.AuthRequest;
import de.hnee.vpn.handler.AuthResponse;
import de.hnee.vpn.service.AuthService;
import de.hnee.vpn.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthService authservice;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public AuthResponse authenticate(@RequestBody AuthRequest request) {
        if (authservice.authenticate(request.getUsername(), request.getPassword())) {
            String jwt = jwtUtil.generateToken(request.getUsername());
            return new AuthResponse(jwt);
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
