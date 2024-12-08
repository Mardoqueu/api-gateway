package com.challenge.gateway.dto;


/**
 * The AuthResponseDTO class represents a Data Transfer Object that encapsulates the response
 * received after a successful authentication request. It typically contains a token, used for
 * authenticating subsequent requests, and the ID of the authenticated user.
 */
public class AuthResponseDTO {
    private String token;
    private Long userId;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}