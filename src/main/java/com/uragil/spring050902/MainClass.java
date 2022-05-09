package com.uragil.spring050902;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
				
		StudentInfo studentInfo1 = ctx.getBean("studentInfo", StudentInfo.class);
		
		studentInfo1.getStudentInfo();
		
		Student stu2 = ctx.getBean("student2", Student.class);
		
		studentInfo1.setStudent(stu2);
		
		studentInfo1.getStudentInfo();
		
		ctx.close();	 
	}

}
