package com.challenge.gateway.dto;

import java.math.BigDecimal;

/**
 * A Data Transfer Object representing the response of an operation.
 * This class encapsulates the outcome of an operation,
 * providing both the result and any error message that may have occurred.
 */
public class OperationResponseDTO {

    private BigDecimal result;
    private String error;

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
