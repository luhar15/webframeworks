package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Book;
import com.example.demo.Repositories.BookRepo;

@Service
public class ApiService {
	
	@Autowired
	private BookRepo stu;
	
	public Book saveDetails(Book b) {
		return stu.save(b);
	}
	public List<Book> getAllDetails()
	{
		return stu.findAll();
	}
	public boolean deleteStudentById(int id) {
		try {
			stu.deleteById(id);
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public Book updateStudentById(int id,Book b) {
		Book bb=stu.findById(id).orElse(null);
		
		bb.setName(b.getbookname());
		bb.setAuthorname(b.getaname());
		bb.setprice(b.getprice());
		bb.setqty(b.getqty());
		return stu.save(bb);
		
		
	}
	
}