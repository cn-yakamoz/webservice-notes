package com.ws;

import javax.xml.ws.Endpoint;

public class TestServer {
	public static void main(String[] args) {
		StudentImpl s=new StudentImpl();
		String url="http://127.0.0.1:8889/studentws";
		Endpoint.publish(url, s);
		System.out.println("server 发布成功");
		
	}

}
