package com.cla.springboot.employeedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cla.springboot.employeedemo.dao.EmployeeDAO;
import com.cla.springboot.employeedemo.entity.Department;
import com.cla.springboot.employeedemo.entity.Employee;



@Service
public class EmployeeServiceImplementation implements EmployeeService {

	// need to inject employee dao
	//Constructor injection 
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImplementation(EmployeeDAO employeeDAO) {
		this.employeeDAO=employeeDAO;
	}

	

	@Override
	@Transactional
	public List<Department> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int e_id) {
		return employeeDAO.findById(e_id);
	}



	@Override
	@Transactional
	public Employee findByName(String emp_name) {
		return employeeDAO.findByName(emp_name);
	}

	
}





