package com.seongbin.solution.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seongbin.solution.domain.entity.Employee;
import com.seongbin.solution.domain.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	@Transactional
	public List<Employee> getEmpList() {
		
		List<Employee> empList = employeeRepository.findAll();
		return empList;
	}
}
