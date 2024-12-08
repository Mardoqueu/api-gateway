package com.challenge.gateway.infrastructure.clients;

import com.challenge.gateway.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * UserClient is a Feign client interface that communicates with a remote user service API.
 * It provides methods to interact with user-related operations.
 */
@FeignClient(name="userClient", url="https://api-operations-d91ca211c6ab.herokuapp.com/api/users",  configuration = FeignConfig.class)
public interface UserClient {

    @PostMapping("/add-balance")
    public String addBalance(@RequestParam Long userId, @RequestParam BigDecimal amount);

    @GetMapping("/balance")
    public BigDecimal getBalance(@RequestParam Long userId);

}
