package de.hnee.vpn.service;

import de.hnee.vpn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(String username, String password) {
        return "user".equals(username) && "password".equals(password);
    }
}
