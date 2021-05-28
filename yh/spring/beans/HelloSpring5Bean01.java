package yh.spring.beans;

public class HelloSpring5Bean01 {

	//어디서든 외부에서 사용할수있게 01class에 public으로 바꿔서씀
	public void sayHello(String msg) {
		System.out.println("안녕하세요, " + msg);	
	}
}
