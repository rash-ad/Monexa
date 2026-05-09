package edu.icet.ecom.dto.auth;

import lombok.Data;

@Data
public class RegisterDTO {
    private String fullName;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String gender;
    private String nationality;
    private String dateOfBirth;
}