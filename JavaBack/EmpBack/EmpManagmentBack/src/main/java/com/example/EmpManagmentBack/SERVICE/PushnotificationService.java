package com.example.EmpManagmentBack.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.EmpManagmentBack.Model.Pushnotification;

import com.example.EmpManagmentBack.REPO.PushRepo;

@Service
public class PushnotificationService {
	
	
	@Autowired
	private PushRepo pushRepo;
	
	
	public List<Pushnotification> getAllPushnotification(){
		List<Pushnotification> push = (List<Pushnotification>)pushRepo.findAll(); 
		return push;
	}
	
	
	
	
	

}