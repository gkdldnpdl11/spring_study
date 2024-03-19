package com.ict.ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain_DI {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("com/ict/ex03/config.xml");
		
		MyProcess myProcess = (MyProcess) context.getBean("mp1");
		myProcess.prn();		// 기본생성자를 호출 = 홍길동, 13
		
		MyProcess myProcess2 = (MyProcess) context.getBean("mp2");
		myProcess2.prn();		// 일지매 , 52
		
		MyProcess myProcess3 = (MyProcess) context.getBean("mp3");
		myProcess3.prn();		// 장길산, 32
	}
}
