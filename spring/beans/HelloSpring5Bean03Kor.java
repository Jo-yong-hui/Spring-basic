package yh.spring.beans;

import org.springframework.stereotype.Component;

import yh.spring.beans.HelloSpring5Bean03;

public class HelloSpring5Bean03Kor implements HelloSpring5Bean03 {

	@Override
	public void sayHello(String msg) {
		System.out.println("안녕하세요, " + msg);		
	}
	
}
