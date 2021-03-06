package yh.spring.basic;

import yh.spring.beans.HelloSpring5Bean03Eng;
import yh.spring.beans.HelloSpring5Bean03Jpn;
import yh.spring.beans.HelloSpring5Bean03Kor; 
import yh.spring.beans.HelloSpring5Bean01;
import yh.spring.beans.HelloSpring5Bean02;
import yh.spring.beans.HelloSpring5Bean03;

public class HelloSpring5App03 {

	
		
	// 네번째 사례
	// 인삿말을 한국어,영어,일본어로 출력하도록 기능 추가
			
		
	// 인터페이스를 도입하면
    // 확장성이 높고 유연한 코드를 작성할 수 있음
    // 또한, 객체간의 tightly coupled를 피할 수 있고
    // 객체간의 의존성을 낮출수도 있음

	// 하지만, new 연산자로 객체를 생성하는 코드가 노출됨
    // 다시 말해, 인터페이스 HelloSpringBean03은
    // HelloSpring5Bean03Kor, HelloSpring5Bean03Eng,
    // HelloSpring5Bean03Jpn 클레스에 의존적이라는 의미

	// 해결 : factory 패턴을 이용해서
    // 객체생성을 전담하는 클래스를 만들어
    // 객체생성 과정을 캡슐화 함

	
    // 인터페이스 프로그래밍의 장점은
    // 객체간의 의존성을 낮출수 있는 것 이외에도
    // 특정 기능 호출시 통일된 방식을 사용할 수 있다는 것임
	
		public static void main(String[] args) {
			
			//인터페이스를 사용하지 않은경우
			//HelloSpring5Bean03Kor bean = new HelloSpring5Bean03Kor();
			//bean.sayHello("스프링 5!!");
			
			//HelloSpring5Bean03Eng bean2 = new HelloSpring5Bean03Eng();
			//bean2.sayHello("Spring 5!!");
			
			//HelloSpring5Bean03Jpn bean3 = new HelloSpring5Bean03Jpn();
			//bean3.sayHello("スプリング 5!!");
			
		
			//인터페이스를 사용한 경우
			//(인퍼페이스한)왼쪽부모와 (인터페이스 구현한)오른쪽 자식
			// 인터페이스의 변수하나를 통해 자식클래스를 몽땅 출력할수 있음
			HelloSpring5Bean03 bean = new HelloSpring5Bean03Kor();
			bean.sayHello("스프링 5!!");
			
			bean  = new HelloSpring5Bean03Eng();
			bean.sayHello("Spring 5!!");
			
			bean  = new HelloSpring5Bean03Jpn();
			bean.sayHello("スプリング 5!!");
		}	
		
		
	}


