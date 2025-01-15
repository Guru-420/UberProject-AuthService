package com.example.UberProject_AuthService.dto;

import com.example.UberProject_AuthService.models.Passenger;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {
    private String id;
    private String email;
    private String password;
    private String phoneNumber;
    private String name;
    private Date createdAt;

    public static PassengerDto from(Passenger passenger){
        PassengerDto result = PassengerDto.builder()
                                    .id(passenger.getId().toString())
                                    .email(passenger.getEmail())
                                    .createdAt(passenger.getCreatedAt())
                                    .name(passenger.getName())
                                    .password(passenger.getPassword())
                                    .phoneNumber(passenger.getPhoneNumber())
                                    .build();
        return result;
    }
}
