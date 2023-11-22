package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public long addStudent(Student student) {
		log.info("adding student");
		// TODO Auto-generated method stub
		Student student2=new Student();
		student2.setAge(student.getAge());
		student2.setName(student.getName());
		student2.setSalary(student.getSalary());
		
		studentRepository.save(student2);
		return student2.getStudentId();
	}
	

}
