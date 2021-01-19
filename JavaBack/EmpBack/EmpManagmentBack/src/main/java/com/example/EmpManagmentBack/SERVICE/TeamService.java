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
}
