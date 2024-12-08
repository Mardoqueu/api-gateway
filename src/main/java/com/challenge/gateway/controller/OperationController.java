package com.challenge.gateway.controller;

import com.challenge.gateway.dto.Operation;
import com.challenge.gateway.dto.OperationDTO;
import com.challenge.gateway.dto.RecordDTO;
import com.challenge.gateway.service.OperationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * Controller class that handles HTTP requests related to operations.
 * It provides endpoints for executing operations, generating random strings,
 * retrieving all operations for a user, and deleting specific operations.
 */
@RestController
@RequestMapping("/operations")
public class OperationController {

    private final OperationService operationService;

    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    @PostMapping("/execute")
    public ResponseEntity<BigDecimal> executeOperation(@RequestBody OperationDTO operationDTO) {
        return ResponseEntity.ok(operationService.executeOperation(operationDTO));
    }

    @PostMapping("/random-string")
    public ResponseEntity<String> randomString(@RequestParam Long userId) {
        String randomString = operationService.randomString(userId);
        return ResponseEntity.ok(randomString);
    }

    @GetMapping
    public ResponseEntity<List<RecordDTO>> getAllOperations(@RequestParam Long userId) {
        List<RecordDTO> operations = operationService.listAllOperations(userId);
        return ResponseEntity.ok(operations);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOperation(@PathVariable Long id) {
        return ResponseEntity.ok(operationService.deleteOperation(id));
    }

}
