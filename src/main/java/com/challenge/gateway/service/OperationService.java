package com.challenge.gateway.service;

import com.challenge.gateway.dto.Operation;
import com.challenge.gateway.dto.OperationDTO;
import com.challenge.gateway.dto.RecordDTO;
import com.challenge.gateway.infrastructure.clients.OperationClient;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Service class responsible for handling operations through the OperationClient.
 * This class provides methods to generate random strings, execute operations,
 * list all operations for a given user, and delete an operation by its ID.
 */
@Service
public class OperationService {

    private final OperationClient operationClient;

    public OperationService(OperationClient operationClient) {
        this.operationClient = operationClient;
    }

    public String randomString(Long userId) {
        return operationClient.randomString(userId);
    }

    public BigDecimal executeOperation(OperationDTO operationDTO) {
        return operationClient.executeOperation(operationDTO);
    }

    public List<RecordDTO> listAllOperations(Long userId){
        return operationClient.getAllOperations(userId);
    }

    public String deleteOperation(Long id){
        return operationClient.deleteOperation(id);
    }
}
