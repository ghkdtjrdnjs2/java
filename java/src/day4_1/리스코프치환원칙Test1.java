package day4_1;

class 부모 {
	int 부모변수 = 20;
}

class 자식 extends 부모 {
	int 자식변수 = 10;
}

public class 리스코프치환원칙Test1 {
	public static void main(String[] args) {
		// 부모의 참조변수로 자식을 가리킬 수 있다
		// 하지만 자식의 고유멤버에는 접근할 수 없다
		// ob는 자식안에 들어있는 부모를 가리키는 것이다
		부모 ob = new 자식();

		// 하지만 ob의 타입은 어디까지나 부모
		// 따라서 참조변수 ob로는 부모의 멤버에만 접근할 수 있다
		System.out.println(ob.부모변수);
		System.out.println(ob.자식변수);
	}
}