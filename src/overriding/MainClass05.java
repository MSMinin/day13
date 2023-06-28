package overriding;

class TestClass05{
	//현재 아무것도 없지만 기본적으로 Object라는 클래스를 상속받고 있다.
	
}

public class MainClass05 {
	public static void main(String[] args) {
		TestClass05 t = new TestClass05();
		System.out.println("aaa".getClass());
		System.out.println(t.getClass());
		// 현재 해당하는 객체가 어떤 자료형인지에 대해서 알려주는 메소드이다.
		System.out.println(t.toString());
		// 현재 객체에 대한 정보를 알려준다. 
		System.out.println(t);
		// 그냥 객체만 작성해도 같은 결과가 나온다.
	}
}
