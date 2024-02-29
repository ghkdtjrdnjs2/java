package day4_2;

import java.util.*;

/*
 	!!! Override !!! 
	부모는 메소드를 선언한다
		Unit 클래스가 이동할 때는 move() 메소드를 사용해라라고 정해줬다

	자식은 메소드를 정의한다
		구체적인 이동 방법은 자식들이, 각자 메소드를 정의(구현)한다
	super.move 부모꺼 	부모에 메소드 이름을 정해주고
	this.move 자식꺼	 	자식꺼 메소드를 찾아서 자식메소드를 실행한다
*/

class Marine extends Unit {
	public void move() {
		System.out.println("두발로 뛰어다녀요");
	}
}

class Ghost extends Unit{
	public void move() {
		System.out.println("은신해서 이동합니다");	
	}
}

class Battlecruiser extends Unit {
	public void move() {
		System.out.println("느릿느릿 날아갑니다");	
	}
}

public class 리스코프치환원칙Test5 {
	public static void main(String[] args) {
		List<Unit> list = new ArrayList<>();
		
		list.add(new Marine());
		list.add(new Ghost());
		list.add(new Battlecruiser());
		
		for(Unit unit:list) {
			unit.move();
		}
	}
}