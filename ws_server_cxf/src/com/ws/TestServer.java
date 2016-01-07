package com.ws;

import javax.xml.ws.Endpoint;

public class TestServer {
	public static void main(String[] args) {
		//必须要导入cxf和jetty的相关包才能运行
		StudentImpl s=new StudentImpl();
		String url="http://127.0.0.1:8889/studentws";
		Endpoint.publish(url, s);
		System.out.println("server 发布成功");
		
	}

}
