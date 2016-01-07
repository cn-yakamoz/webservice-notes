package com.ws.test;


import com.ws.StudentImpl;
import com.ws.StudentImplService;

public class CxfTest {
	public static void main(String[] args) {
		//必须导入cxf和jetty的相关包
		StudentImplService factory=new StudentImplService();
		StudentImpl studentImpl = factory.getStudentImplPort();
		String name = studentImpl.getName("436532");
		System.out.println(name);
	}

}
