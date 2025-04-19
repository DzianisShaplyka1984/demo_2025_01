package com.academy.demo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
    @Id
    private Integer id;
    private String name;
    private String job;
    private String dob;
    private Integer salary;
}
