package overriding;

final class Test03{ 
	// 만약 final이라는 키워드가 class앞에 붙는다면 이 클래스는 상속하면 안된다는 뜻이다.
	// Test03 t = new Test03(); 을 만들어서 이 안의 내용을 사용하라는 것인데
	// 왜 이렇게 하는거냐면, 해당 클래스의 메소드를 건들지말라는 뜻으로 
	// 메소드 오버라이딩을 사용하지말라는 것이다.
	public void test() {
		System.out.println("부모의 기능");
	}
}

class TestClass03{
	public void test() {
		Test03 t = new Test03();
		System.out.println("자식의 기능 실행");
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test();
	}
}
