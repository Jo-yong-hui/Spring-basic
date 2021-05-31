package yh.spring.annotation;

import yh.spring.beans.HelloSpring5Bean03;

public class HelloSpring5Bean07Eng implements HelloSpring5Bean03 {

	@Override
	public void sayHello(String msg) {
		System.out.println("Spring 5!!, " + msg);	
	}
	
	
}
//상속과, 인터페이스는 어떤 방식으로 다형성을 가능하게 할까? 정답은 오버라이딩 이다.
//상속을 받은 하위 클래스에서는 부모클래스의 메서드를 오버라이딩시켜서 다형성을 가능하게 한다.
//인터페이스는 구현체클래스에서 인터페이스의 메서드들을 재정의하면서 다형성을 가능하게 한다.