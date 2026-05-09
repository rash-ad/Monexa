package edu.icet.ecom.dto.auth;

import lombok.Data;

@Data
public class AuthResponseDTO {
    private String token;
    private String fullName;
    private String email;
}