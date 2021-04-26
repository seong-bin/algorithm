package com.seongbin.solution.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seongbin.solution.domain.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
