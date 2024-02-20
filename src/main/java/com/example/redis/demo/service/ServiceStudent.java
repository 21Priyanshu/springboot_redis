package com.example.redis.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.redis.demo.model.Student;
import com.example.redis.demo.repo.RedisRepo;

@Service
public class ServiceStudent {

	 @Autowired 
     private RedisRepo repo; 
 
     // to insert new customer data into the Redis database 
   public Student addCustomer(Student student){ 
 
       return repo.save(student); 
   } 
   
   public List<Student> getAllStudents(){ 
		  
       List<Student> allStudent = new ArrayList<>(); 
       repo.findAll().forEach(allStudent::add); 
       return allStudent; 
   } 
}
