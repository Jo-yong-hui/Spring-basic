package yh.spring.annotation;

import yh.spring.beans.HelloSpring5Bean03;

public class HelloSpring5Bean07Jpn implements HelloSpring5Bean03 {

	@Override
	public void sayHello(String msg) {
		System.out.println("スプリング 5!!, " + msg);	
	}
	
	
}
