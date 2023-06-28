package abstract_;

interface Test10{
	public void test(int num, String msg);
}

public class MainClass10 {
	public static void main(String[] args) {
		System.out.println("======================");
		
		Test10 t01 = new Test10() {
			public void test(int num, String msg) {
				System.out.println("num : " + num );
				System.out.println("name : " + msg );
			}
		};
		t01.test(100, "test");
		
		System.out.println("위 코드가 아래로 줄어든 것이다.");
		
		Test10 t02 = (n, s) -> {
			System.out.println("num : " + n );
			System.out.println("name : " + s );
		};
		
		t02.test(100, "test");
		
		System.out.println("======================");
	}
}
