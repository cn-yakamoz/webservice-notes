package com.ws.test;


import com.ws.StudentImpl;
import com.ws.StudentImplService;

public class WSTest {
	public static void main(String[] args) {
		StudentImplService factory=new StudentImplService();
		StudentImpl studentImpl = factory.getStudentImplPort();
		String name = studentImpl.getName("436532");
		System.out.println(name);
	}

}
