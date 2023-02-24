package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo emp;
	public Employee addDetails(Employee e)
	{
		return emp.save(e);
	}
	public List<Employee>getAllDetails()
	{
		return emp.findAll();
	}
}