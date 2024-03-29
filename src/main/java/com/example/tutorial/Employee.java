package com.example.tutorial;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
 
    private @Id @GeneratedValue Long id;
    private String name;
    private int age;
    private int idEmployee;
 
    private Employee(){}
    
    public Employee(String name, int age, int idEmployee) {
        this.name = name;
        this.age = age;
        this.idEmployee= idEmployee;
    }
}