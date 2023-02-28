package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Donor;
import com.example.demo.Service.DonorService;

@RestController
public class DonorController {
	@Autowired
	private DonorService empservice;
	
	@GetMapping("/getdetail/{pgno}/{pgsize}")
	public List<Donor> getDetails(@PathVariable("pgno")int pgno,@PathVariable("pgsize")int pgsize)
	{
		return empservice.getAllDetails(pgno,pgsize);
	}
	@GetMapping("/getdetail")
	public List<Donor> getDetails()
	{
		return empservice.getAllDetails();
	}
	@GetMapping("/{name}")
	public List<Donor> getDetailSort(@PathVariable String name){
		   return empservice.sort(name);
	}
	@PostMapping("/addgroup")
	public Donor postDetails(@RequestBody Donor e)
	{
		return empservice.addDetails(e);
	}
	@PutMapping("/updategroup")
	public String update(@RequestBody Donor e)
	{
		empservice.update(e);
		return "updated";
	}
	@DeleteMapping("/deletegroup/{e}")
	public String delete(@PathVariable int e)
	{
		return empservice.delete(e);
//		return "record delete";
	}
	@GetMapping("/getid/{id}")
	public List<Donor> getbyid(@PathVariable int id) 
	{
		 return empservice.getAllId(id);
    }
	@DeleteMapping("/deletequery/{id}")
	public String deletevalue(@PathVariable int id) 
	{
		   return empservice.deleteDetails(id);
	}
}