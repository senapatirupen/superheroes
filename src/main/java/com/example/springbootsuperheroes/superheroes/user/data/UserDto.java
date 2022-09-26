package com.example.springbootsuperheroes.superheroes.user.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

  private Long id;

  private String email;
  private String mobileNumber;
  private String password;
}
