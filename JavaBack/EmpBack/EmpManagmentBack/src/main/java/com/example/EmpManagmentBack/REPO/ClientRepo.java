package com.example.EmpManagmentBack.REPO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.EmpManagmentBack.Model.Client;

@Repository
 public interface ClientRepo extends CrudRepository<Client,String>{

}
