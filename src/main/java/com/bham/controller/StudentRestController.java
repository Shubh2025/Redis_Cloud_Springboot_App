package com.bham.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bham.entity.Student;
import com.bham.repo.StudentRepo;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
		
		studentRepo.save(student);	
		 return "Student is added";
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent(){
		
		return (List<Student>) studentRepo.findAll();
	}

}
