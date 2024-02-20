package com.example.redis.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.redis.demo.model.Student;
import com.example.redis.demo.service.ServiceStudent;

@RestController
public class RestConstroller {
	
	@Autowired
	ServiceStudent service;
	
	@PostMapping("/customer")
    public Student addCustomer(@RequestBody Student student){ 
  
        return service.addCustomer(student); 
    } 
	
	@GetMapping("/customer")
    public List<Student> getListOfCustomers(){ 
   
      return service.getAllStudents(); 
  } 
	

}
