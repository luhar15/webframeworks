package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;
	
	@GetMapping("/getEmployee")
	public List<Employee> getDetails()
	{
		return empservice.getAllDetails();
	}
	@PostMapping("/addEmployee")
	public Employee postDetails(@RequestBody Employee e)
	{
		return empservice.addDetails(e);
	}
}