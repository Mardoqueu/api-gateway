package com.challenge.gateway.dto;

import java.math.BigDecimal;

/**
 * Represents an operation with an associated cost.
 * The Operation class is used to encapsulate details about a particular operation
 * including its unique identifier, type, and cost.
 */
public class Operation {
    private Long id;
    private String type;
    private BigDecimal cost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
