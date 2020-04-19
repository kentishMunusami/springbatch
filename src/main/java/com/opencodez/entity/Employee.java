package com.opencodez.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_employee")
	private int idEmployee;
	
    private String firstname;
    private String lastname;
    private int age;
    private float salary;

}
