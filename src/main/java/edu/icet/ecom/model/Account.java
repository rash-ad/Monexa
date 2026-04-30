package edu.icet.ecom.model;

public class Account {
    private long id;
    private  String accountNumber;
    private String accountType;
    private  Double balance;
    private String currency;        // "LKR", "USD"
    private String status;          // "ACTIVE", "CLOSED", "FROZEN"
    private String userId;
}
