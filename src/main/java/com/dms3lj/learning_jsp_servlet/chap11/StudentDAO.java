package com.dms3lj.learning_jsp_servlet.chap11;

import java.util.List;

public interface StudentDAO {
	Student getStudentById(int id);
	List<Student> getAllStudnets();
	void createStudnet(Student student);
	void updateStudent(Student student);
	void deleteStudent(int id);
}
