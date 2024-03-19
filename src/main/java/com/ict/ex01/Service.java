package com.ict.ex01;

public class Service {
	// 1. OracleDAO oracleDAO = new OracleDAO();
	// 2. MariaDBDAO mariaDBDAO = new MariaDBDAO();
	
	// 인터페이스 또는 클래스를 자료형으로 사용
	private DAO dao;
	
	public Service() {}
	public Service(DAO dao) {
		// 전역변수로 만들어줌
		this.dao = dao;
	}
		
	public DAO getDao() {
		return dao;
	}
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	// 사용하고 싶은 메소드
	public void biz() {
		// OracleDAO, MariaDBDAO => prn 메소드 실행
		// 1. oracleDAO.prn();
		// 2. mariaDBDAO.prn();
		dao.prn();
	}
}
