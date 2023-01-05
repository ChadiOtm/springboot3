package com.sid.TestApp.Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Exam;
    private Long id_Qst;
    private String Question;

    private String Response;
    private Long Points;
    private String Duration;
}
