package yh.spring.beans;

public class HelloSpring5Bean03Jpn implements HelloSpring5Bean03 {

	@Override
	public void sayHello(String msg) {
		System.out.println("スプリング 5!!, " + msg);	
	}
	
	
}
