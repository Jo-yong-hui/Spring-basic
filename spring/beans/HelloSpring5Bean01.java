package yh.spring.beans;

public class HelloSpring5Bean01 {

	//HelloSpring5Bean01이라는 외부 클래스를 따로 만들어
	// 여기다가 sayHello 메서드 생성 및 호출코드작성
	//스프링 컨테이너에 의해서 자바객체(java objects)가 만들어 지면
	// 이 객체를 스피링에서 빈(Bean)이라고 부른다.
	public void sayHello(String msg) {
		System.out.println("안녕하세요, " + msg);	
	}
}
