package com.example.finance.dto;

import com.example.finance.model.TransactionType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class TransactionRequestDTO {
    private BigDecimal amount;
    private TransactionType type;
    private String category;
    private LocalDateTime transactionDate;
}
