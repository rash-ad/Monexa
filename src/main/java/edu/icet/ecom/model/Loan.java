package edu.icet.ecom.model;

public class Loan {
    private Long id;
    private String loanType;         // "PERSONAL", "HOME", "VEHICLE"
    private Double loanAmount;
    private Double interestRate;
    private Integer termMonths;
    private Double monthlyPayment;
    private String status;           // "PENDING", "APPROVED", "REJECTED", "ACTIVE"
    private String userId;           // FK reference
    private String startDate;
    private String endDate;
}
