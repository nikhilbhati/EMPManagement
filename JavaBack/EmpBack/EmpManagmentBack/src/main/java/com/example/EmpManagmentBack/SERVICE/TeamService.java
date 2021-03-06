package com.example.EmpManagmentBack.SERVICE;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EmpManagmentBack.Model.Team;
import com.example.EmpManagmentBack.REPO.TeamRepo;

@Service
public class TeamService {

	@Autowired
	private TeamRepo TeamRepository;
	
	// fetching all team
	public List<Team> getAllTeam(){
		List<Team> tms = (List<Team>)TeamRepository.findAll(); 
		return tms;
	}
	
	// fetching Team by id
		public Optional<Team> getTeam_Id(int id){
			return TeamRepository.findById(id);
		}
	
		
		
//		// fetching count by employee id		
//				public Long getT_Emp_Id(String id){
//					return TeamRepository.aMethodNameOrSomething(id);
//				}	
//		
		
		
		
		
		
		
		
	//fetching Team by manager id
		public List<Team> getTeam_MId(String id){
			return TeamRepository.findM(id);
		}
		
	// get all team by Employee id
		public List<Team> getAllTeamByEid(String id){
			return TeamRepository.getAllbyEid(id);
		}
		
		
		
		
		
    // inserting Team
			public void addTeam(Team e) {
				TeamRepository.save(e);
			}
				
	// updating Team by id
			public Team updateTeam(Team id){
			 
				TeamRepository.save(id);
				return id;
				
			}

			public Team getTeam_MId_EId(String m_Id, String eeid) {
				// TODO Auto-generated method stub
				return TeamRepository.findByMidnEid(m_Id, eeid);
			}

			public int getcountbyid(String t_Emp_Id) {
				// TODO Auto-generated method stub
				return TeamRepository.getcount(t_Emp_Id);
			}
					
		
		
		
		
		
		
		
		
		
		
		
		
}
