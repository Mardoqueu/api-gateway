package com.challenge.gateway.infrastructure.clients;

import com.challenge.gateway.config.FeignConfig;
import com.challenge.gateway.dto.Operation;
import com.challenge.gateway.dto.OperationDTO;
import com.challenge.gateway.dto.RecordDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * Interface for interacting with the Operations API using Feign Client.
 * Provides methods to perform various operations such as generating random strings,
 * executing operations, retrieving all operations for a user, and deleting an operation.
 */
@FeignClient(value="operationsClient", url = "https://api-operations-d91ca211c6ab.herokuapp.com/api/operations",  configuration = FeignConfig.class)
public interface OperationClient {

    @PostMapping("/random-string")
     String randomString(@RequestParam Long userId);

    @PostMapping("/execute")
    BigDecimal executeOperation(@RequestBody OperationDTO operationDTO);

    @GetMapping
    public List<RecordDTO> getAllOperations(@RequestParam Long userId);

    @DeleteMapping("/{id}")
    public String deleteOperation(@PathVariable Long id);
}
