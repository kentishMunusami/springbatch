package com.opencodez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opencodez.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
