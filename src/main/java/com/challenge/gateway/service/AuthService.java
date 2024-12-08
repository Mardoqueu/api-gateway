package com.challenge.gateway.service;

import com.challenge.gateway.dto.AuthRequestDTO;
import com.challenge.gateway.dto.AuthResponseDTO;
import com.challenge.gateway.dto.UserDTO;
import com.challenge.gateway.infrastructure.clients.AuthenticationClient;
import org.springframework.stereotype.Service;

/**
 * AuthService class provides user authentication services by interacting with the
 * AuthenticationClient. It facilitates user registration and login operations via
 * the corresponding methods, delegating functionality to the client interface.
 */
@Service
public class AuthService {

    private final AuthenticationClient authenticationClient;

    public AuthService(AuthenticationClient authenticationClient) {
        this.authenticationClient = authenticationClient;
    }

    public UserDTO registerUser(UserDTO userDTO) {
        return authenticationClient.registerUser(userDTO);
    }

    public AuthResponseDTO loginUser(AuthRequestDTO requestDTO) {
        return authenticationClient.loginUser(requestDTO);
    }
}
