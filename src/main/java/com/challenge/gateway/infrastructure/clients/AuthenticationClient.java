package com.challenge.gateway.infrastructure.clients;

import com.challenge.gateway.dto.AuthRequestDTO;
import com.challenge.gateway.dto.UserDTO;
import com.challenge.gateway.dto.AuthResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * The AuthenticationClient interface defines the contract for user authentication operations
 * with a remote authentication API. It allows clients to register a new user and to log in
 * an existing user using their credentials.
 */
@FeignClient(value="authClient", url = "https://api-authentication-25c897d6c23f.herokuapp.com/api/auth")
public interface AuthenticationClient {

    @PostMapping("/register")
    UserDTO registerUser(@RequestBody UserDTO userDTO);

    @PostMapping("/login")
    AuthResponseDTO loginUser(@RequestBody AuthRequestDTO requestDTO);
}
