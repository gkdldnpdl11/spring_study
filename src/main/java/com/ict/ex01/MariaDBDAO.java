package com.ict.ex01;

public class MariaDBDAO implements DAO{
	
	public MariaDBDAO() {
		System.out.println("MariaDBDAO 생성자");
	}
	
	@Override
	public void prn() {
		System.out.println("MariaDBDAO prn() 실행");
	}
	
}
