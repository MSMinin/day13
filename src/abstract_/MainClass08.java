package abstract_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

interface Test08 {
	// 인터페이스에 변수를 생성할 수 있는데
	// 바로 값을 선언해야한다.
	public int num = 0;
	public static final String name1 = "홍길동";
	public static String name2 = "홍길동";
	public final String name3 = "홍길동";
	// 원래는 위와 같이 static final이 붙어있다.
	// final이 있기때문에 변수의 값을 변경할 수 없다.
}

public class MainClass08 implements Test08{
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		System.out.println(num);
		System.out.println(name1);
	}
}
