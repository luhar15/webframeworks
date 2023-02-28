package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Student;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
   @Autowired
   private ApiService stuservice;
   @PostMapping("/addStudent")
   public String postDetails(@RequestBody Student s) {
	   stuservice.saveDetails(s);
	   return "Value Successfully Added";
   }
   @GetMapping("/getStudent")
   public List<Student>getDetails(){
	   return stuservice.getAllDetails();
   }
  @RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
   public Student updateStudentById(@PathVariable int id, @RequestBody Student s) {
       return stuservice.updateStudentById(id, s);
   }
   @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
   public boolean deleteStudentById(@PathVariable int id) {
       return stuservice.deleteStudentById(id);
   }
 
}
