package com.ws.test;

import java.util.List;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws22.EndpointImpl;
import org.apache.cxf.message.Message;

import com.ws.StudentImpl;

public class LogInterceptor {

	public static void main(String[] args) {
		/**
		 * 对服务端添加日志拦截器
		 */
		StudentImpl s=new StudentImpl();
		String url="http://127.0.0.1:8889/studentws";
		Endpoint endpoint=Endpoint.publish(url, s);
		EndpointImpl endpointImpl =(EndpointImpl)endpoint;
		//设置服务器端入拦截器
		List<Interceptor<? extends Message>> logInterceptor = endpointImpl.getInInterceptors();
		logInterceptor.add(new LoggingInInterceptor());
		//设置服务器端出拦截器
		List<Interceptor<? extends Message>> outInterceptor = endpointImpl.getOutInterceptors();
		outInterceptor.add(new LoggingOutInterceptor());
		
		System.out.println("server 发布成功");

	}

}
