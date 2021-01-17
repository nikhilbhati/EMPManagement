package com.example.EmpManagmentBack.SERVICE;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmpManagmentBack.Model.Department;
import com.example.EmpManagmentBack.REPO.DepRepo;



@Service
public class DepartmentServices {
	@Autowired
	private DepRepo departmentRepository;
	
	// fetching all employees
	public List<Department> getAllDepartment(){
		List<Department> dept = (List<Department>)departmentRepository.findAll(); 
		return dept;
	}
	
	// fetching employee by id
			public Optional<Department> getDept_Id(String id){
				return departmentRepository.findById(id);
			}
	
	
}
