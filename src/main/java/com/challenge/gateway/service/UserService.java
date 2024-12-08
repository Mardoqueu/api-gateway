package com.challenge.gateway.service;


import com.challenge.gateway.dto.OperationDTO;
import com.challenge.gateway.infrastructure.clients.UserClient;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

/**
 * UserService is responsible for managing user balance operations.
 * This service interfaces with the remote user client to perform balance updates and retrievals.
 */
@Service
public class UserService {

    private final UserClient userClient;

    public UserService(UserClient userClient) {
        this.userClient = userClient;
    }

    public String addBalance(Long userId,BigDecimal amount) {
        return userClient.addBalance(userId, amount);
    }

    public BigDecimal getBalance(Long userId) {
        return userClient.getBalance(userId);
    }
}
