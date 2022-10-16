package com.example.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.api.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

	public Student findById(int id);
}
