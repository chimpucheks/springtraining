package com.zensar.springbootdemo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zensar.springbootdemo.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	private List<Student> students = new ArrayList<Student>();

	public StudentRepositoryImpl() {
		students.add(new Student(1001, "Ram", 30));
		students.add(new Student(1002, "Seeta", 28));
		students.add(new Student(1003, "Laxman", 26));

	}

	@Override
	public Student getStudent(int studentId) {
		// System.out.println("studentId" +studentId);
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return student;
			}

		}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		return students;

	}

	@Override
	public void insertStudent(Student student) {
		students.add(student);

	}

	@Override
	public void updateStudent(int studentId, Student student) {
		Student student2 = getStudent(studentId);
		student2.setStudentId(student.getStudentId());
		student2.setStudentName(student.getStudentName());
		student2.setStudentAge(student.getStudentAge());

		//students.add(student2);

	}

	@Override
	public void deleteStudent(int studentId) {
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if (student.getStudentId() == studentId) {
				students.remove(student);
			}

		}

	}
}
