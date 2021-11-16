package com.cla.springboot.employeedemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cla.springboot.employeedemo.dao.EmployeeDAO;
import com.cla.springboot.employeedemo.entity.Department;
import com.cla.springboot.employeedemo.entity.Employee;
import com.cla.springboot.employeedemo.exception.EmpIDNotFoundException;
import com.cla.springboot.employeedemo.service.EmployeeService;

@RestController
@RequestMapping(value ="/api")
public class EmployeeRestController {

	// autowire the CustomerService
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		this.employeeService=employeeService;
		
	}
	
	@GetMapping("/employee")
	public List<Department> getEmployee() {
		
		return employeeService.findAll();
		
	}
	
	@GetMapping("employee/{e_id}")
	public Employee getEmployeeId(@PathVariable int e_id) {
		Employee employee=employeeService.findById(e_id);
		if(employee==null) {
			throw new EmpIDNotFoundException("Employee id not found  "+ e_id);
		}
		return employee;
		
	}
	
	@GetMapping("employee/name/{emp_name}")
	public Employee getEmployeeName(@PathVariable String emp_name) {
		Employee employee=employeeService.findByName(emp_name);
		return employee;		
	}	
}


















