package com.seongbin.solution.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seongbin.solution.domain.entity.Employee;
import com.seongbin.solution.service.EmployeeService;

@Controller
public class HomeClass {
	private EmployeeService employeeService;
	
	public HomeClass(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping(value="/")
	public String index() {
		
		return "index";
	}
	
	@GetMapping(value="/main")
	public String subPage01() {
		return "main/main";
	}

	@GetMapping(value="/list")
	public String subPage02() {
		return "board/list";
	}
	

	@GetMapping(value="/emp")
	public String datagetEmp(Model model) {
		List<Employee> empList = employeeService.getEmpList();
		System.out.println("emp는"+empList);

		for(Employee emp : empList) {
			System.out.println("empList = "+emp.getName());
		}
		empList.stream().forEach(x -> System.out.println(x.getName()));
		model.addAttribute("empList", empList);
		return "board/list";
	}
}
