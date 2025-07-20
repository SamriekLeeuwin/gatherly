// Jpa entity for user
package com.gatherly.api;

import jakarta.persistence.Entity;


@Entity
public class User{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Enumerated(EnumType.STRING)
private Role role;

@Column(unique = true, nullable = false, length = 25,  max = 25)
private String email;


@Column(nullable = false, length = 50)
private String password;

@Column(nullable = false)
private Boolean isActive;



public User(String email, String password, Role role){
    this.email = email;
    this.password = password;
    this.role = role;
    this.isActive = true;
}






}