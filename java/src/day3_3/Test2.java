package day3_3;

import lombok.*;


// 렌트카는 따로 지정하지 않으면 제조사 : 현대, 배기량 : 1300cc 차량이 기본이라고 하자

// 객체를 생성하는 순서
// 1. 인스턴스 초기화
//			장점 - 간단하다
//			단점 - 모든 객체가 같은 앖을 가진다
// 2. static 필드를 초기화 하는 영역
// 		static{}
// 3. 생성자

// 객체를 출력하면 hashCode를 찍는데 ... 객체가 가진 필드값을 바꾸도로 롬복
@ToString
class Car {
	// 인스턴스 초기화 : 필드에 값을 직접 입력한다
	String 제조사;
	Long 배기량;
	
	public Car(String 제조사, Long 배기량) {
		this.제조사 = 제조사;
		this.배기량 = 배기량;
	}
	
	public Car(String 제조사) {
		// this() : 자기자신의 생성자
		this(제조사, 1300L);
	}
	
	public Car(Long 배기량) {
		this("현대", 배기량);
	}
	
	public Car() {
		this("현대", 1300L);
	}
}

public class Test2 {
	public static void main(String[] args) {
		Car r1 = new Car();
		Car r2 = new Car(2000L);
		Car r3 = new Car("기아", 2000L);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
}