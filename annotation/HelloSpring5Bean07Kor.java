package yh.spring.annotation;

import org.springframework.stereotype.Component;

import yh.spring.beans.HelloSpring5Bean03;


@Component("Kor")
public class HelloSpring5Bean07Kor implements HelloSpring5Bean03 {

	@Override
	public void sayHello(String msg) {
		System.out.println("안녕하세요 5!!, " + msg);	
	}
	
	
}
