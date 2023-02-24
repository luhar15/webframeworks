package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="employeeName")
	private String empName;
	@Column(name="employeeAge")
	private int empAge;
	@Column(name="salary")
	private long salary;
	public Employee() {};
	public Employee (int id,String empName,int empAge,long salary)
	{
		super();
		this.id=id;
		this.empName=empName;
		this.empAge=empAge;
		this.salary=salary;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getempName()
	{
		return empName;
	}
	public void setempName(String empName)
	{
		this.empName=empName;
	}
	public int getempAge()
	{
		return empAge;
	}
	public void setempAge(int empAge)
	{
		this.empAge=empAge;
	}
	public long getsalary()
	{
		return salary;
	}
	public void setsalary(long salary)
	{
		this.salary=salary;
	}
}
