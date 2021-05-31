package yh.spring.beans;

import yh.spring.beans.HelloSpring5Bean03Eng;
import yh.spring.beans.HelloSpring5Bean03Jpn;
import yh.spring.beans.HelloSpring5Bean03Kor;

public class HelloSpring5Bean04Factory {

	//HelloSpring5Bean03 타입의 객체를 만드는 공장이라는 의미
	//인삿말을 출력하는 객체를 생성하는 create 메서드 정의
	
	//equals() 메소드는 대소문자를 구분하여 비교함
	//equalsIgnoreCase() 메소드는 대소문자를 구분하지 않고 비교하므로
	//원하는 비교 형태를 확인하고 선택/사용하면 유용하다.
	//Factory method는 부모(상위) 클래스에 알려지지 않은 구체 클래스를 생성하는 패턴이며. 자식(하위) 클래스가 어떤 객체를 생성할지를 결정하도록 하는 패턴이기도 하다.
	//부모(상위) 클래스 코드에 구체 클래스 이름을 감추기 위한 방법으로도 사용한다
	//팩토리 메소드 패턴을 이용하면 인터페이스의 구현클래스를 매번 선언해서 가져올 필요없이
	//가져오려는 인터페이스의 구현체의 타입을 이용해서 가져올 수 있다.
	
	public static HelloSpring5Bean03 create(String type) {
		HelloSpring5Bean03 obj= null;
		
		if (type.equalsIgnoreCase("kor"))
			obj = new HelloSpring5Bean03Kor();
		else if (type.equalsIgnoreCase("eng"))
			obj = new HelloSpring5Bean03Eng();
		else if (type.equalsIgnoreCase("Jpn"))
			obj = new HelloSpring5Bean03Jpn();
		
		return obj;
	}
}
