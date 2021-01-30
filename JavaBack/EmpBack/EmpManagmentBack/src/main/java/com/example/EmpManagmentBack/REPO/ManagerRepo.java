package com.example.EmpManagmentBack.REPO;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.EmpManagmentBack.Model.Manager;
import com.example.EmpManagmentBack.Model.Team;


@Repository
public interface ManagerRepo extends CrudRepository<Manager,String>{
	
	@Modifying
	@Query("delete from Manager b where b.M_Emp_Id=:title")
	void deleteman(@Param("title") String title);
	
	 @Query("from Manager where  M_Emp_Id = :x")
		Manager getManagerbyEid(@Param("x") String x);

}
