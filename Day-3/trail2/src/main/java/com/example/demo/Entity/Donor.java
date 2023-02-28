package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BloodBank")
public class Donor 
{
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Age")
	private int Age;
	
	@Column(name="Blood Group")
	private String bloodgroup;
	
	@Column(name="Mobile_no")
	private long mobileNo;
	
	@Column(name="Place")
	private String place;
	
	public Donor() {};
	public Donor (int id,String name,int Age,String BloodGroup,long Mobile_no,String Place)
	{
		super();
		this.id=id;
		this.name=name;
		this.Age=Age;
		this.bloodgroup=BloodGroup;
		this.mobileNo=Mobile_no;
		this.place=Place;
	}
	public long getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return Age;
	}
	public void setAge(int Age)
	{
		this.Age=Age;
	}
	public String getBloodGroup()
	{
		return bloodgroup;
	}
	public void setBloodGroup(String BloodGroup)
	{
		this.bloodgroup=BloodGroup;
	}
	public long getMobile_no()
	{
		return mobileNo;
	}
	public void setMobile_no(long Mobile_no)
	{
		this.mobileNo=Mobile_no;
	}
	public String getPlace()
	{
		return place;
	}
	public void setPlace(String Place)
	{
		this.place=Place;
	}
}
