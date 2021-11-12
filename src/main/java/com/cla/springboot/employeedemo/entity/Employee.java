package com.cla.springboot.employeedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EMP_ID",columnDefinition="INT(40)")
	private int emp_id;
	
	@Column(name="EMP_NAME",columnDefinition="varchar(100)")
	private String emp_name;
	
	@Column(name="EMP_PHONE",columnDefinition="INT(20)")
	private int emp_phone_no;
	
	@Column(name="EMP_ADDRESS",columnDefinition="varchar(100)")
	private String emp_address;
	
	@Column(name="EMP_DESIGNATION",columnDefinition="varchar(100)")
	private String emp_designation;

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_phone_no=" + emp_phone_no
				+ ", emp_address=" + emp_address + ", emp_designation=" + emp_designation + "]";
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_phone_no() {
		return emp_phone_no;
	}

	public void setEmp_phone_no(int emp_phone_no) {
		this.emp_phone_no = emp_phone_no;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public String getEmp_designation() {
		return emp_designation;
	}

	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}

	public Employee() {
	
	}

	public Employee(int emp_id, String emp_name, int emp_phone_no, String emp_address, String emp_designation) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_phone_no = emp_phone_no;
		this.emp_address = emp_address;
		this.emp_designation = emp_designation;
	}
	
	
	
	
}





