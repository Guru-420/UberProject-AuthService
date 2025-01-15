package com.example.UberProject_AuthService.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {

    private String email;
    private String password;
    private String phoneNumber;
    private String name;
}
