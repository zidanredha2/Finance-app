package com.example.finance.dto;

import com.example.finance.model.TransactionType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TransactionResponseDTO {
    private Long id;
    private BigDecimal amount;
    private TransactionType type;
    private String category;
    private String description;
    private String transactionDate;
}
