package com.example.finance.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Positive
    private BigDecimal amount;
    private TransactionType type;
    private String category;
    private String description;
    @NotBlank
    private LocalDateTime transactionDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
