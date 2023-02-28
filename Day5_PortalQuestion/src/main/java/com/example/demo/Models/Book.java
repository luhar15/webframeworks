package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BookDetails")
public class Book {
    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;
    
    @Column(name="bookname")
    @GeneratedValue
    private String bookname;
    
    @Column(name="Authorname")
    @GeneratedValue
    private String aname;
    @Column(name="price")
    @GeneratedValue
    private float price;
    @Column(name="qty")
    @GeneratedValue
    private int qty;
    
    public Book() {}
    Book(int id,String bookname,String aname,float price,int qty){
    	super();
    	this.id=id;
    	this.bookname=bookname;
    	this.aname=aname;
    	this.price=price;
    	this.qty=qty;
    }
    //Getters,setters
  public int getId() {			
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getbookname() {
    return bookname;
  }
  public void setName(String bookname) {
    this.bookname = bookname;
  }
  public String getaname() {
    return aname;
  }
  public void setAuthorname(String aname) {
    this.aname = aname;
   }
  public float getprice() {
	return price;
   }
  public void setprice(float price) {
	this.price = price;
   }
  public int getqty() {			
    return id;
   }
  public void setqty(int qty) {
    this.qty= qty;
   }
}