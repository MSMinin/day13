package abstract_;

abstract class TestClass01{
	public abstract void function();
	// 1. 자식 클래스에서 오버라이딩을 하려고 할때 추상화(abstract)를 사용한다.
	//    실체가 없기때문에 추상화메소드라고 한다.
	// 메소드 이름만 생성하고 코드를 넣지 않는다.
	public void test() {
		System.out.println("test 기능");
	}
}

class Test01 extends TestClass01 {
	// 2. 부모를 상속받았는데 위에 있는 추상화 메소드를 
	//  오버라이딩을 하지 않으면 오류가 발생한다.
	public void test01() {
		System.out.println("새로운 기능");
	}
	
	public void function() {
		// 오버라이딩을 함으로써 오류가 없어졌다.
		System.out.println("aaaa");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		
	}
}
