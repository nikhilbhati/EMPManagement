package com.example.EmpManagmentBack.SERVICE;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EmpManagmentBack.Model.Project;
import com.example.EmpManagmentBack.REPO.ProjectRepo;


@Service
public class ProjectService {
	@Autowired
	private ProjectRepo projectRepo;
	
	// fetching all project
	public List<Project> getAllProject(){
		List<Project> proj = (List<Project>)projectRepo.findAll(); 
		return proj;
	}
	// fetching Project by id
			public Optional<Project> getProject_Id(String id){
				return projectRepo.findById(id);
			}
			
	// get By Manger id
			public Project getByMAnagerID(String id){
				return projectRepo.getbyMid(id);
			}
			
	 // inserting Project
			public void addProject(Project e) {
				projectRepo.save(e);
			}
			
			
// updating Project by id
			public Project updateProject( Project pp){
		
				projectRepo.save(pp);
				return pp;
				
			}		
			
		
			
			
			
			
			
			
}
