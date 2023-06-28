package abstract_;

class A지상군05 implements Army{
	public void 총알장전() {
		System.out.println("총알을 장전한다.");
	}
	public void 방패설치() {
		System.out.println("방패를 설치한다.");
	}
	public void attack() {
		총알장전();
		System.out.println("지상군 공격");
	}
	public void defence() {
		방패설치();
		System.out.println("지상군 방어");
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		Army a = new A지상군05();
		// 인터페이스로 업캐스팅하면 Army에서 작성한
		// 메소드만 보이게 된다.
		a.attack();
		a.defence();
		
	}
}
