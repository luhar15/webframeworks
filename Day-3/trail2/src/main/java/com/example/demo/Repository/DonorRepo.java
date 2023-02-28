package com.example.demo.Repository;

import java.util.List;

//import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entity.Donor;

public interface DonorRepo extends JpaRepository<Donor, Integer> 
{	
	@Query(value="select * from blood_bank g where g.id = :id",nativeQuery=true)
	List<Donor> getAllId(@Param("id") int id);
	
	@Modifying
	@Query(value="delete from Donor g where g.id=:id")
	int deleteDetails(@Param("id")int id);
}