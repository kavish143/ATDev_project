package com.example.api.Service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.api.dao.StudentRepository;
import com.example.api.entities.Student;
@Service
@Component
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		List<Student> list =(List<Student>)this.studentRepository.findAll();
		return list;
	}
	public Student getStudentById(int id) {
		Student student = null;
		try {
			this.studentRepository.findById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
	    
		return student;
	}
	public Student addStudent(Student s) {
		Student result = studentRepository.save(s);
		return result;
	}
	public void deleteStudent(int s) {
		
		studentRepository.deleteById(s);
		
	}
	public void updateStudent(Student student, int id) {
		student.setId(id);
		studentRepository.save(student);
		
	}
	
}
