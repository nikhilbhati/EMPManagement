package com.example.EmpManagmentBack.SERVICE;

import java.util.List;
import java.util.Optional;

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
	// fetching Pushnotification by id
			public Optional<Pushnotification> getPN_No(String id){
				return pushRepo.findById(id);
			}
			
 // inserting Pushnotification
			public void addPushnotification(Pushnotification e) {
				pushRepo.save(e);
			}
			
			
// updating Pushnotification by id
			public Pushnotification updatePushnotification( Pushnotification pus){
			
				pushRepo.save(pus);
				return pus;
			}
							
			
			// deleting all Pushnotification
			public void deleteAllPushnotification(){
				pushRepo.deleteAll();
			}
			
	
	

}
