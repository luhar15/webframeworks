package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Donor;
import com.example.demo.Repository.DonorRepo;

@Service
public class DonorService {
	@Autowired
	private DonorRepo emp;
	public Donor addDetails(Donor e)
	{
		return emp.save(e);
	}
	public List<Donor>getAllDetails(int pno, int psize)
	{
		Pageable pg=PageRequest.of(pno, psize);
		Page<Donor> p=emp.findAll(pg);
		return p.toList();
	}
	public List<Donor>getAllDetails()
	{
		return emp.findAll();
	}
	public Donor update(Donor e)
	{
		return 	emp.saveAndFlush(e);
	}	
	public String delete(int id) {
		try {
			if(!emp.findById(id).isEmpty())
			{
				emp.deleteById(id);
				return "id Removed";
			}
			else 
				throw new Exception("Error");
		}
		catch(Exception e) {
			return "Id "+id+" not found";
		}
	}
	public List<Donor> sort(String name) {
		// TODO Auto-generated method stub
		return emp.findAll(Sort.by(name));
	}
	public List<Donor> getAllId(int id) {
		return emp.getAllId(id);
	}
	public String deleteDetails(int id) {
		try {
			if(!emp.findById(id).isEmpty())
			{
				emp.deleteById(id);
				return "Removed";
			}
			else
				throw new Exception("Error");
		}
		catch(Exception e) {
			e.printStackTrace();
			return "No value Found for Id "+id;
		}
	}
}