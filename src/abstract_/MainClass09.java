package abstract_;

interface Test09{
	public void test();
}

class TestClass09 implements Test09{
	public void test() {
		System.out.println("test 실행");
	}
}

public class MainClass09 {
	public static void main(String[] args) {
		Test09 t01 = new TestClass09();
		t01.test();
		System.out.println("==================");
		
		// 다음엔 Test09 자체를 new연산자로 만들어볼것이다.
		Test09 t02 = new Test09() {
			public void test() {
				//자동완성하면 이런식으로 만들어진다.
				System.out.println("인터페이스");
			}
		};
		t02.test();
		
		// 람다를 사용해서 작성할 수 있다.
		// 아래와 같이 화살표를 이용하여 간결하게 작성할 수 잇는데
		// 대신 이 방법은 인터페이스 내의 메소드가 1개여야만 한다.
		System.out.println("==================");
		Test09 t03 = () -> System.out.println("람다가 실행됩니다.");
		t03.test();
		
	}
}
