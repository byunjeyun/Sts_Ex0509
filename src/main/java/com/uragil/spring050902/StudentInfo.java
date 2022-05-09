package com.uragil.spring050902;

import com.uragil.spring050902.Student;

public class StudentInfo {

	private Student student;//의존		

	public StudentInfo(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}	
	
	public void getStudentInfo() {
		
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		System.out.println("학년 : " + student.getGradeNum());
		System.out.println("반 : " + student.getClassNum());
		
	}
	
}
