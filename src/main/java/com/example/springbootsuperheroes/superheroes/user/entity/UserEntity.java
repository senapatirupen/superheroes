package com.example.springbootsuperheroes.superheroes.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(nullable = false, updatable = false)
  private Long id;

  @Column(unique = true)
  private String email;

  private String mobileNumber;
  private byte[] storedHash;
  private byte[] storedSalt;

  public UserEntity(String email, String mobileNumber) {
    this.email = email;
    this.mobileNumber = mobileNumber;
  }
}
