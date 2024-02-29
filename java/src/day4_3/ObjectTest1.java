package day4_3;

import lombok.*;

// Object : 자바의 모든 클래스의 부모 클래스
// - 부모 클래스를 지정하지 않은 경우 자바가 자동으로 extends Object를 추가
// - Object는 모든 클래스의 부모지만 실제로 사용하기는 곤란(너무 추상적이다)
// - 부모의 역할이 뭐지?
//		구현해야할 메소드를 정해주는 역할
//		자바의 모든 클래스가 구현해야 할 필수 메소드를 정해주는 역할이다
// Object 클래스의 역할 -> 자식이 override할 메소드의 이름을 정해준다

@AllArgsConstructor
class Product {
	private String name;
	private int price;

	// 이 메소드는 override되었다
	@Override
	public String toString() {

		return "name:" + name + ", price:" + price;

	}

	@Override
	public int hashCode() {
		// 객체를 구별하는 번호
		// 해시코드를 생성하는 자바 알고리즘이 충분히 강력하지 않네
		// 겹칠수도 있다네? 불만이면 너가 만들어
		return super.hashCode();
	}

	/*
	 * // toString 메소드는 Object 클래스에 정의되어 있다 public String toString() { return
	 * "제품명:"+ name+", 가격:"+price; }
	 */
}

public class ObjectTest1 {
	public static void main(String[] args) {
		Product product = new Product("컵누들", 1500);
		// 자바의 모든 객체는 자신을 출력하는 toString()메소드를 가진다
		// 객체를 print해 -> toString() 메소드가 자동 호출
		System.out.println(product);
		// ( p.toString())
	}
}