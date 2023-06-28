package overriding;

import java.util.ArrayList;

class TestClass02 extends ArrayList<String> {
	// 1. ArrayList를 상속받아 ArrayList에 있는 기능을 사용할 수 있다.
	// 3. 추가적인 기능을 원하면 여기서 만들면 된다.
	public void test() {
		System.out.println("추가 기능");
	}
	// 4. 오버라이딩을 할 때 반환타입, 메소드이름, 매개변수가 변경되어서는 안된다.
	public boolean add(String e) {
		System.out.println("내용을 추가해주는 기능 실행");
		System.out.println("잘 동작되는지 확인");
		return true;
	}
	// 5.현재 반환되어 저장되는 값이 없어서 get()을 실행할 때 오류가 나온다. 
}

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		// 2. 그러므로 add(),get()을 사용할 수 있다. 
		t.add("안녕하세요.");
		System.out.println(t.get(0));
		t.test();
	}
}
