package com.ict.ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain_DI {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("com/ict/ex05/config.xml");
		
		/*
		 * MyProcess myProcess = (MyProcess) context.getBean("mp1"); myProcess.prn(); //
		 * 기본생성자를 호출 = 홍길동, 13
		 * 
		 * MyProcess myProcess2 = (MyProcess) context.getBean("mp2"); myProcess2.prn();
		 * // 일지매 , 52
		 * 
		 * MyProcess myProcess3 = (MyProcess) context.getBean("mp3"); myProcess3.prn();
		 * // 장길산, 32
		 */
		
		// 어노테이션을 이용하여 객체 생성, 이름을 따로 부여하지 않아서 클래스명이 이름이 됨, 이때 이름은 클래스이름과 동일하지만 첫글자가 소문자
		// MyProcess myProcess = (MyProcess) context.getBean(myProcess");
		
		// component에 이름을 부여하면 부여한 이름을 사용하면 됨
		MyProcess myProcess = (MyProcess) context.getBean("mp");
		myProcess.prn();		// 기본 생성자 이용하여 홍길동, 13이 나옴
		
	}
}
