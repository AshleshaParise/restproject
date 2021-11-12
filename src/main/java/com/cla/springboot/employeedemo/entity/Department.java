package com.cla.springboot.employeedemo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="DEPARTMENT")
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DEPT_ID",columnDefinition="INT(50)")
	private int dept_id;
	
	@Column(name="DEPT_NAME",columnDefinition="varchar(100)")
	private String dept_name;
	
	@Column(name="id",columnDefinition="INT(40)")
	private int e_id;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)  
	@JoinColumn (name = "id")
	@JsonIgnore
	private List<Employee> employee;
	
	

	

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}



	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Department() {
		
	}

	public Department(int dept_id, String dept_name, int e_id, List<Employee> employee) {
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.e_id = e_id;
		this.employee = employee;
	}

    
	
}
