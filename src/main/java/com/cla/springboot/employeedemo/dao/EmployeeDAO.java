package com.cla.springboot.employeedemo.dao;

import java.util.List;

import com.cla.springboot.employeedemo.entity.Department;
import com.cla.springboot.employeedemo.entity.Employee;

public interface EmployeeDAO {
   public List<Department> findAll();
   public Employee findById(int e_id);
   public Employee findByName(String emp_name);
   
}
