package com.challenge.gateway.dto;

/**
 * The AuthRequestDTO class represents a Data Transfer Object used for user authentication requests.
 * It encapsulates the information required to authenticate a user, typically a username and password.
 */
public class AuthRequestDTO {
    private String userName;
    private String password;

    public AuthRequestDTO() {}

    public AuthRequestDTO(String username, String password) {
        this.userName = username;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
