package com.ict.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// DI는 Spring Container 에서 객체(Bean)를 생성하고 관리한다
		// Spring Container 에게 필요한 정보를 제공해야 한다 => Configuration Metadata에게 정보 제공
		// 설정정보(Configuration Metadata) => 기본적으로 XML 파일 형태이다
		// 추가적으로 Annotation을 이용한다 (Spring boot 에서는 무조건 Annotation 사용함)
		
		// Spring Container => BeanFactory => ApplicationContext (일반적일때 사용)
		//														=> WebApplicationContext (Web에서 사용)
		
		// ApplicationContext context = new GenericXmlApplicationContext("설정정보 위치");
		// 		Spring Container																Configuration Metadata
		
		ApplicationContext context = new GenericXmlApplicationContext("com/ict/ex02/config.xml");
		
		// getBean() => 만들어놓은 환경설정 정보에서 생성한 객체를 호출하기 위한 메소드
		Service service = (Service) context.getBean("service");
		service.biz();
	}
}
