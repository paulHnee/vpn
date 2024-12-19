package de.hnee.vpn.handler;

public class AuthResponse {
    private String jwt;

    // Constructor with parameter
    public AuthResponse(String jwt) {
        this.jwt = jwt;
    }

    // Getter and Setter
    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
