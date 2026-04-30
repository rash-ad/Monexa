package edu.icet.ecom.model;

public class Transaction {
    private Long id;
    private String transactionType;  // "DEPOSIT", "WITHDRAWAL", "TRANSFER"
    private Double amount;
    private String description;
    private String status;           // "PENDING", "COMPLETED", "FAILED"
    private String fromAccountNumber;
    private String toAccountNumber;
    private String referenceNumber;
    private String createdAt;
}
