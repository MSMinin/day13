package abstract_;
/*
  interface
   - 추상화 메소드만 포함할 수 있다.
   - 변수는 static final 형식으로만 만들어진다.
   - 다중 상속이 가능하다. 
*/

interface A02 {}

interface B02 {
	// 추상화 메소드만 존재해야한다.
	// 실체가 있는 메소드를 생성하면 오류가 발생한다.
	public void test(); 
}

class C02{
	public void test1() {
		
	}
}

class Test02 extends C02 implements A02, B02 {
// implements를 통해서 interface를 다중상속을 할 수 있다.
// 상속을 받은 자식클래스는 추상화 메소드들을 모두 오버라이딩해주어야한다.
	public void test() {
		
	}
	
	
}

public class MainClass02 {

}
