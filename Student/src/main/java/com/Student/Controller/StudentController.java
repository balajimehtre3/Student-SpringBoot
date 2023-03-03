package com.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Student.Entity.Student;
import com.Student.Repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository sr;
	
	@PostMapping("/insertStudent")
	public String insertStudent(@RequestBody Student s) {
		sr.save(s);
		return "Data Saved";
	}
	
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student s) {
		sr.save(s);
		return "Data Updated";
	}
	
	@DeleteMapping("/deleteStudent")
	public String deleteStudent(@RequestBody Student s) {
		sr.delete(s);
		return "Data Deleted";
	}
	
	@GetMapping("/fetchStudent")
	public List<Student> fetchStudent() {
		return sr.findAll();
	}
}
