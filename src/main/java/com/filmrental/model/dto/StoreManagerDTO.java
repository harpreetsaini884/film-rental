package com.filmrental.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoreManagerDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
}