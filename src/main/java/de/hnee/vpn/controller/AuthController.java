package de.hnee.vpn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
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
