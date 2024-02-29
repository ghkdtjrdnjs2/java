package day4_2;

import java.util.*;

// 메소드는 부모에 만들어야 한다
// 하지만 부모가 자식들의 동작을 정해줄 수는 없다

// 비유하자면 부모가 자식들에게 "행복하게 살아라"라고 방향은 제시할 수 있지
// 하지만 "행복하게 사는 구체적인 방법"은 부모가 정해줄 수 없다 -> 자식이 각자 찾아야지

class Unit {
	public void move() {
		System.out.println("여기 뭐라고 코딩해야 마린, 고스트, 배틀크루저가 이동할까요");
	}
}
class 마린 extends Unit {
}

class 고스트 extends Unit{
}

class 배틀크루저 extends Unit {
}

public class 리스코프치환원칙Test4 {
	public static void main(String[] args) {
		List<Unit> list = new ArrayList<>();
		
		list.add(new 마린());
		list.add(new 배틀크루저());
		list.add(new 고스트());
		
		for(Unit unit:list) {
			unit.move();
		}
	}
}