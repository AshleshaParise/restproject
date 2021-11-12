package com.cla.springboot.employeedemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cla.springboot.employeedemo.entity.Department;
import com.cla.springboot.employeedemo.entity.Employee;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOImplementation(EntityManager entityManager) {		
		this.entityManager=entityManager;
	}
	
	@Override
	public List<Department> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query=currentSession.createQuery("from Department d inner join Employee e on d.e_id=e.emp_id ");
		List<Department> employee=query.getResultList();
		
		return employee;
	}

	@Override
	public Employee findById(int e_id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employee=currentSession.get(Employee.class, e_id);
		return employee;
	}

	
	

}
