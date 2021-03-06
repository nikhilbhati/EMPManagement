package com.example.EmpManagmentBack.Model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;







@Entity(name="employee")
@Table(name="employee")

public class Employee {
	
	@Column(name=" Emp_Id")
	@Id
	private String  Emp_Id;
	

	

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval=true)
    @JoinColumn( name = "Emp_Dept_Id", referencedColumnName = "Dept_Id",insertable = false, updatable = false)

    private Department department;  
	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
		
	}

	
	@OneToOne(cascade = CascadeType.ALL,  orphanRemoval=true)
    @JoinColumn(name = "Emp_Payroll", referencedColumnName = "Payroll_Id",insertable = false, updatable = false)
    private Payrolls payrolls;  
	
	
	
	public Payrolls getPayrolls() {
		return payrolls;
	}


	public void setPayrolls(Payrolls payrolls) {
		this.payrolls = payrolls;
	}


	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private String Emp_Firstname, Emp_Lastname,Emp_Email,Emp_Address,emp_mobile_no, Emp_City, Emp_State,Emp_Dept_Id,Emp_Designation,Emp_Qualification,Emp_Skills,Emp_Pass,Emp_Photo;
	private  enum Emp_Gender{M,F,T};
	
	public enum Emp_Payroll{A,B,C,D};
	private enum Emp_Access{A,M,E};
	private Date Emp_Dob;
	
	

	public Employee() {
		super();
	}
     

	public String getEmp_Id() {
		return Emp_Id;
	}


	public void setEmp_Id(String emp_Id) {
		Emp_Id = emp_Id;
	}


	public String getEmp_Firstname() {
		return Emp_Firstname;
	}


	public void setEmp_Firstname(String emp_Firstname) {
		Emp_Firstname = emp_Firstname;
	}


	public String getEmp_Lastname() {
		return Emp_Lastname;
	}


	public void setEmp_Lastname(String emp_Lastname) {
		Emp_Lastname = emp_Lastname;
	}


	public String getEmp_Email() {
		return Emp_Email;
	}


	public void setEmp_Email(String emp_Email) { 
		Emp_Email = emp_Email;
	}


	public String getEmp_Address() {
		return Emp_Address;
	}


	public void setEmp_Address(String emp_Address) {
		Emp_Address = emp_Address;
	}



	public String getEmp_mobile_no() {
		return emp_mobile_no;
	}


	public void setEmp_mobile_no(String emp_mobile_no) {
		this.emp_mobile_no = emp_mobile_no;
	}


	public String getEmp_City() {
		return Emp_City;
	}


	public void setEmp_City(String emp_City) {
		Emp_City = emp_City;
	}


	public String getEmp_State() {
		return Emp_State;
	}


	public void setEmp_State(String emp_State) {
		Emp_State = emp_State;
	}


	public String getEmp_Dept_Id() {
		return Emp_Dept_Id;
	}


	public void setEmp_Dept_Id(String emp_Dept_Id) {
		Emp_Dept_Id = emp_Dept_Id;
	}


	public String getEmp_Designation() {
		return Emp_Designation;
	}


	public void setEmp_Designation(String emp_Designation) {
		Emp_Designation = emp_Designation;
	}


	public String getEmp_Qualification() {
		return Emp_Qualification;
	}


	public void setEmp_Qualification(String emp_Qualification) {
		Emp_Qualification = emp_Qualification;
	}


	public String getEmp_Skills() {
		return Emp_Skills;
	}


	public void setEmp_Skills(String emp_Skills) {
		Emp_Skills = emp_Skills;
	}


	public String getEmp_Pass() {
		return Emp_Pass;
	}


	public void setEmp_Pass(String emp_Pass) {
		Emp_Pass = emp_Pass;
	}


	public String getEmp_Photo() {
		return Emp_Photo;
	}


	public void setEmp_Photo(String emp_Photo) {
		Emp_Photo = emp_Photo;
	}


	public Date getEmp_Dob() {
		return Emp_Dob;
	}


	public void setEmp_Dob(Date emp_Dob) {
		Emp_Dob = emp_Dob;
	}

	
	@Enumerated( EnumType.STRING)
	private  Emp_Payroll emp_payroll;

	public Emp_Payroll getEmp_payroll() {
		return emp_payroll;
	}


	public void setEmp_payroll(Emp_Payroll emp_payroll) {
		this.emp_payroll = emp_payroll;
	}


	
	
	
	
	
	@Enumerated( EnumType.STRING)
	private  Emp_Gender emp_gender;
	
	public Emp_Gender getEmp_gender() {
		return emp_gender;
	}


	public void setEmp_gender(Emp_Gender emp_gender) {
		this.emp_gender = emp_gender;
	}

	
	
	
	
	
	
	@Enumerated( EnumType.STRING)
	private  Emp_Access emp_access;

	public Emp_Access getEmp_access() {
		return emp_access;
	}


	public void setEmp_access(Emp_Access emp_access) {
		this.emp_access = emp_access;
	}



	
	
	
	

	
	
	
}
