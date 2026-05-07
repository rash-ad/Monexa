package edu.icet.ecom.dto.Account;

import lombok.Data;

@Data
public class AccountResponseDTO {
    private Long id;
    private String accountNumber;
    private String accountType;
    private String balance;
    private String currency;
    private String status;
    private String createdAt;
}