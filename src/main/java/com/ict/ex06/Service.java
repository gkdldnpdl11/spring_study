package com.ict.ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Service {
	// 1. OracleDAO oracleDAO = new OracleDAO();
	// 2. MariaDBDAO mariaDBDAO = new MariaDBDAO();
	
	// 인터페이스 또는 클래스를 자료형으로 사용
	// @Autowired : 변수 이름과 참조하는 클래스의 ID가 동일할 때 사용
	@Autowired
	
	// @Qualifier("참조클래스명") : 같은 이름이 없을 때는 참조하는 클래스의 ID를 입력한다 (첫글자는 소문자)
	@Qualifier("oracleDAO")
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
		dao.prn();
	}
}
