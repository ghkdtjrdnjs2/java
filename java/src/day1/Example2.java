package day1;

//wapper class
//자바의 기본타입과 1:1인 클래스
public class Example2 {
	public static void main(String[] args) {
		// a는 10이라는 값만 저장
		int a = 10;

		// b는 값외에 여러 메소드를 가진 객체
		// 숫자는 null을 가질 수 없다. 그래서 Integer을 사용한다.
		Integer b = new Integer(10);

		System.out.println(a);
		System.out.println(b.MAX_VALUE);

		// 웹에서 사용자가 값을 입력하지 않으면 서버는 null을 가지게 된다.
		// 예) 나이를 입력받는다면
		// int x = null;
		Integer y = null;
		// 자바에서 null의 정의는 참조변수가 아직 가리키는 객체가 없다.

		// 서버를 만들 때는 Integer같은 것을 사용해야한다.
	}
}
