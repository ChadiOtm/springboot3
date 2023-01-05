package com.sid.TestApp.Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String First_Name;
    private String Last_Name;
    private String Phone ;
    private String E_mail;
    private String Password;
    private Date BirthDay ;
    private String Address ;
    private String Username;
    private String Role ;

}
