package com.example.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.Service.StudentService;
import com.example.api.entities.Student;

@RestController
public class Controller {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/Select")
	public List<Student> getStudent() {
		return this.studentService.getAllStudents();
	}
	
	@GetMapping("/Select/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/Insert")
	public Student addStudent(@RequestBody Student student) {
	  Student s = this.studentService.addStudent(student);
	     return s;
	}
	
	@DeleteMapping("/Delete/{Id}")
	public void deleteStudent(@PathVariable("Id") int id) {
		this.studentService.deleteStudent(id);
	}
	
	@PutMapping("/Update/{Id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable("Id")int id) {
		this.studentService.updateStudent(student,id);
		return student;
		
	}

}

















