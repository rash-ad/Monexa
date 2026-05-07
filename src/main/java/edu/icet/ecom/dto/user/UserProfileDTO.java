package edu.icet.ecom.dto.user;

import lombok.Data;

@Data
public class UserProfileDTO {
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String profilePicture;
    private String address;
    private String gender;
    private String nationality;
    private String dateOfBirth;
    private String createdAt;
}