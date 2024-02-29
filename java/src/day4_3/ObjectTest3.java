package day4_3;

import lombok.*;

// 객체를 비교할 때는 equals
@Getter
@AllArgsConstructor
@ToString
class 제품 {
	private String name;
	private int price;
	
	@Override
	public boolean equals(Object obj) {
		// 핸드폰 ob = new 갤럭시();
		// 참조변수 ob가 가리키는 대상이 갤럭시인지 확인하는 연산자
		// ob instanceof 갤럭시
		
		// 제품과 제품이 아닌것을 비교하면 무조건 false
		if((obj instanceof 제품)==false) {
			return false;
		}
		
		// 이제 obj가 가리키는 대상은 제품인 걸 확인했다
		// obj를 제품으로 형변환을 한다 : 업캐스트, 다운캐스트
		제품 target = (제품)obj;
		return this.name.equals(target.getName()) && 
				this.price==target.getPrice();
	}
}

public class ObjectTest3 {
	public static void main(String[] args) {
		제품 p1 = new 제품("컵누들", 1500);
		제품 p2 = new 제품("신라면", 1500);
		제품 p3 = new 제품("컵누들", 1500);
		
		// ==로 비교하면 무조건 false
		// ==로 비교하면 hashCode를 비교한다
		// 자바는 두 객체를 비교하는 방법을 모른다
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
		
		// ==로 비교하면 무조건 false
		// Object의 equals는 hashCode를 비교한다
		// 오버라이드 해야 한다
		System.out.println(p1.equals(p3));
		System.out.println(p1==p3);
	}
}