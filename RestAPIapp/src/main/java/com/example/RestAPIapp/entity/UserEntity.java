package com.example.RestAPIapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
@ToString
public class UserEntity extends BasicEntity{

    private String username;
    private String password;

}
