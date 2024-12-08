package com.challenge.gateway.dto;

/**
 * Data Transfer Object representing an operation to be executed, typically used for
 * sending data between different application layers or services.
 *
 * This class contains information related to an operation, specifically the ID of the
 * user initiating the operation and the expression that describes the operation.
 */
public class OperationDTO {

    private Long userId;
    private String expression;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
