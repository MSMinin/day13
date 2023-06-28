package overriding;
/*
  오버라이딩
   - 상속받은 자식 메소드의 내용을 변경하는 것
   - 부모 메소드와 다르게 자신에게 맞게 변경하여 사용한다.
   
  오버라이딩 조건
   - 부모메소드의 이름과 동일하게 만들어야한다.
   - 자식의 접근제한자는 부모의 접근제한자보다 작으면 안된다.
    private < package < protected < public 
*/

class Ferrari {
	private int ye;
	public Ferrari(int ye) {this.ye = ye;}
	public int getYe() {return ye;}
	public void speed() {
		System.out.println(ye + "년식 페라리 속도 : 300km");
	}
}

class NewFerrari extends Ferrari{
	public void speed() { 
		// 부모에 있는 speed가 아닌 자식에 있는 speed를 이용 
		System.out.println(getYe() + "년식 페라리 속도 : 5000km");
	}
	public NewFerrari(int ye) {
		super(ye);
	}
	public void autoSystem() {
		System.out.println("자동운전모드로 전환합니다.");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
//		Ferrari fe = new Ferrari(2023);
//		fe.speed();
		NewFerrari nFe = new NewFerrari(2024);
		nFe.speed();
		nFe.autoSystem();
	}
}
