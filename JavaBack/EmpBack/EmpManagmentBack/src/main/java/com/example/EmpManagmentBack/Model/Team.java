package com.example.EmpManagmentBack.Model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Team")
public class Team {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name=" Team_Id")
	
	 private int Team_Id;
	
	
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Team_M_Id", referencedColumnName = "M_Id",insertable = false, updatable = false)
    private Manager manager;  
	
	

	public Manager getManager() {
		return manager;
	}


	public void setManager(Manager manager) {
		this.manager = manager;
	}


	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "T_Emp_Id", referencedColumnName = "Emp_Id",insertable = false, updatable = false)
    private Employee employee;  
	
	
	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	
	
	
	
	
	
	
	
	
   
	private String  Team_M_Id, T_Emp_Id;

	
	public Team() {
		super();
	}


	public int getTeam_Id() {
		return Team_Id;
	}


	public void setTeam_Id(int team_Id) {
		Team_Id = team_Id;
	}


	public String getTeam_M_Id() {
		return Team_M_Id;
	}


	public void setTeam_M_Id(String team_M_Id) {
		Team_M_Id = team_M_Id;
	}


	public String getT_Emp_Id() {
		return T_Emp_Id;
	}


	public void setT_Emp_Id(String t_Emp_Id) {
		T_Emp_Id = t_Emp_Id;
	}

	
	
	
	
	
	
	
	
	
	
	
	

}