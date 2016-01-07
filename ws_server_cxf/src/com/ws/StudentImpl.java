package com.ws;

import javax.jws.WebService;

@WebService
public class StudentImpl implements Student {

	@Override
	public String getName(String id) {
		
		return "stu"+id;
	}

}
