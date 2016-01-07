package com.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Student {
	@WebMethod
	public String getName(String id);

}
