package day4_4;

abstract class Parent {
	// 중괄호대신 ;을 찍으면 추상 메소드 -> 미구현 메소드
	// 추상 메쇼드 많이 사용하나요? 물 마시듯이
	// 왜 사용하느냐? 오버라이드와 함께
	// 오버라이드와 추상 메소드는 항상 함께 다닌다
	public abstract void insa();
}


// 추상클래스 Parent를 상속하면 자식도 추상클래스가 된다
class 첫째딸 extends Parent {

	@Override
	public void insa() {
		System.out.println("안녕하세요");
	}
	
}
class 둘째아들 extends Parent {

	@Override
	public void insa() {
		System.out.println("하이~~");
	}

}
public class 추상메소드Test1 {
	public static void main(String[] args) {
		// 추상 메소드를 가지는 클래스는 추상 클래스
		// 추상 클래스는 객체를 생성할 수 없다
		Parnet ob = new Parent();
		
		// 추상 클래스를 상속받으면 자식 클래스에 추상 메소드가 전달된다
		// 따라서 자식도 추상 클래스가 된다
	}
}