package abstract_;

interface Test11{
	// 자바에서 제공해주는 기능으로 가정한다.
	public void test();
}

class TestClass11 {
	// 자바에서 제공해주는 기능으로 가정한다.
	public void testClass(Test11 t) {
		System.out.println("기능 실행");
		t.test();
	}
}

public class MainClass11 {
	public static void main(String[] args) {
		TestClass11 t = new TestClass11();
		
		System.out.println("=======================");
		Test11 tt = new Test11() {
			public void test() {
				System.out.println("test");
			}
		};
		
		t.testClass(tt);
		
		System.out.println("=======================");
		// 위 내용을 아래와 같이 줄여서 작성할 수 있다.
		
		t.testClass(() -> {System.out.println("aaaa");} );
	}
}
