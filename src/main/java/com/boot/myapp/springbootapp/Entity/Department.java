package com.boot.myapp.springbootapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int deptId;
    private String deptName;
    private String deptCode;
}
