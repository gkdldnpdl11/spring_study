package com.ict.ex01;

public class TestMain {
	public static void main(String[] args) {
		// 1. 일반적인 방법
		// Service service = new Service();
		// service.biz();

		// 2. 만들어놓은 생성자를 이용한 방법
		// Service service = new Service(new OracleDAO());
		// service.biz();
		
		// 3. setter를 이용한 방법
		Service service = new Service();
		service.setDao(new MariaDBDAO());
		service.biz();
	}
}
