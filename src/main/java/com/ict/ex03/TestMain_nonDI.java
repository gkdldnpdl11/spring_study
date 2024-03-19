package com.ict.ex03;

public class TestMain_nonDI {
	public static void main(String[] args) {
		MyProcess process = new MyProcess();
		process.prn();	// 홍길동, 13
		System.out.println("--------------------");
		
		// 클래스의 상태값 변경
		MyProcess process2 = new MyProcess("둘리", 372);
		process2.prn();		// 둘리, 372
		System.out.println("--------------------");
		
		MyProcess process3=new MyProcess();
		process3.setName("희동이");
		process3.setAge(3);
		process3.prn();		// 희동이, 3
		System.out.println("--------------------");
	}
}
