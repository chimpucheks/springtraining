package com.zensar.springbootdemo.service;

import java.util.List;

import com.zensar.springbootdemo.dto.StudentDto;
import com.zensar.springbootdemo.entity.Student;

public interface StudentService {

	public StudentDto getStudent(int studentId);

	public List<StudentDto> getAllStudents();

	public StudentDto insertStudent(StudentDto studentDto);

	public void updateStudent(int studentId, StudentDto student);

	public void deleteStudent(int studentId);

}
