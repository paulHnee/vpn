package de.hnee.vpn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/vpn")
    public String vpn() {
        return "vpn";
    }
}
