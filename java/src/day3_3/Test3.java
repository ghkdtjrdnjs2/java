package day3_3;

// 부모클래스의 생성자 super() 
// 객체지향 구성요소
// 1. 캡슐화 : 클래스를 만들어라
// 2. 정보은닉 : 가능한 private(케이스를 쓰워라)
// 3. 상속
// 4. 다형성

// 객체지향 원칙(SOLID)
// S : 단일책임원칙 - 객체는 자기일만 알아서하면 된다
// O : 
// L :
// I :
// D :

class 사원 {
	private String name;
	private Long nai;

	public 사원(String name, Long nai) {
		this.name = name;
		this.nai = nai;
	}
}

class 정규직 extends 사원 {
	private String position;
	private Long salary;

	public 정규직(String name, Long nai, String position, Long salary) {
		super(name, nai); // 생성자 호출은 무조건 첫줄에서만 가능 
		this.position = position;
		this.salary = salary;

	}
}

public class Test3 {
	public static void main(String[] args) {
		정규직 s1 = new 정규직("홍길동", 30L, "대리", 4000000L);
	}
}