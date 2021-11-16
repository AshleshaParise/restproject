package com.cla.springboot.employeedemo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cla.springboot.employeedemo.dao.EmployeeDAO;
import com.cla.springboot.employeedemo.entity.Employee;
import com.cla.springboot.employeedemo.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeedemoApplicationTests {
	@Autowired
	private EmployeeService employeeService;
	
	@MockBean
	private EmployeeDAO employeeDAO;
	
	@Test
	public void findByNameTest() {
		Mockito.when(employeeDAO.findByName("JOHN")).thenReturn(new Employee(102,"JOHN",74639,"PUNE","PROFESSOR"));
		
        
        Employee emp = employeeService.findByName("JOHN");
        
        assertEquals(102, emp.getEmp_id());
        assertEquals("JOHN", emp.getEmp_name());
        assertEquals(74639, emp.getEmp_phone_no());
        assertEquals("PUNE", emp.getEmp_address());
        assertEquals("PROFESSOR", emp.getEmp_designation());
		
	}


	
}
