package day3_3;

import lombok.*;
@ToString
class 렌트카 {
	// 1. 인스턴스 초기화
	String 제조사="현대";
	Long 배기량 = 1300L;
	
	// 2. 생성자는 인스턴스 초기화 다음에 실행된다
	public 렌트카(String 제조사, Long 배기량) {
		this.제조사 = 제조사;
		this.배기량 = 배기량;
	}
	
	public 렌트카(String 제조사) {
		this.제조사 = 제조사;
	}
	
	public 렌트카(Long 배기량) {
		this.배기량 = 배기량;
	}
	
	public 렌트카() {
	}
}

public class Test1 {
	public static void main(String[] args) {
		렌트카 r1 = new 렌트카();
		렌트카 r2 = new 렌트카(2000L);
		렌트카 r3 = new 렌트카("기아", 2000L);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
}