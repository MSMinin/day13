package abstract_;

import java.util.Scanner;

class A지상군07 implements Army {
	public void attack() { System.out.println("지상군 공격"); }
	public void defence() { System.out.println("지상군 방어"); }
}

class B공군07 implements Army {
	public void attack() { System.out.println("비행기 공격"); }
	public void defence() { System.out.println("비행기 방어"); }
}

public class MainClass07 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Army a = null;
		
		System.out.println("적이 쳐들어왔습니다.");
		System.out.println("(1). 지상군   (2). 공군");
		int cho = sc.nextInt();
		
		if(cho == 1) {
			System.out.println("지상군이 선택되었습니다.");
			a = new A지상군07();
		}else if(cho == 2) {
			System.out.println("공군이 선택되었습니다.");
			a = new B공군07();
		}
		
		System.out.println("(1). 공격   (2). 방어");
		int num = sc.nextInt();
		
		if(num == 1) {
			a.attack();
		}else if(num == 2) {
			a.defence();
		}
			
	}
}
