package yh.spring.sungjuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import yh.spring.service.SungJukService;


public class SpringSunJukApp01 {

	public static void main(String[] args) {
		// 스프링으로 구현하는 성적처리프로그램
		// 각 모듈간의 의존성을 낮추기 위해
		// Service, DAO 클래스는 인터페이스를 기반으로 작성함
		// Serivce : SungJukSerivice -> SungJukServiceImpl
		// DAO : SungJukDAO -> SungJukDAOImpl
		// bean 설정파일에 등록해 둠
		//SpringSunJukApp01 -> SungJukServiceImpl -> 	 SungJukDAOImpl
		
		
	ApplicationContext ctx =
	new FileSystemXmlApplicationContext("src/sungjuk01.xml");
	
	//sungjuk.xml에 의해 스프링 컨테이너가
	// 미리 생성해둔 sjsrv객체를 가져다 sjsrv변수에 초기화함
	SungJukService sjsrv = (SungJukService) ctx.getBean("sjsrv");
	
	// sjsrv변수의 new SungJuk메서드 호출
	sjsrv.newSungJuk();
	}

}
