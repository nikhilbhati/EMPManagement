package com.example.EmpManagmentBack.REPO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.EmpManagmentBack.Model.Payrolls;

@Repository
public interface PayrollRepo extends CrudRepository<Payrolls,String>{

}
