package yh.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import yh.spring.beans.HelloSpring5Bean03;

public class HelloSpring5App06 {
	
	
		// BeanFactory가 아닌 ApplicationContext로
		// DI를 실행해봄
		
		// 추가 라이브러리
		// spring-context
		// spring-expression
	
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/bean05.xml");
		
		HelloSpring5Bean03 bean =
			(HelloSpring5Bean03) ctx.getBean("Kor");
		bean.sayHello("스프링5!!");
		
		bean = (HelloSpring5Bean03) ctx.getBean("Eng");
		bean.sayHello("Spring 5!!");
		
		bean = (HelloSpring5Bean03) ctx.getBean("Jpn");
		bean.sayHello("スプリング 5!!");
	}

}
