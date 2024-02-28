package day3_5;
// 개방폐쇄원칙

//=== Cat, Dog는 Animal로 대표된다
class Animal {
}

class Cat extends Animal {
}

class Dog extends Animal {

}

// === 수의사
//  === 동물의 외부 패키지에는 동물을 대표하는 Animal로 작업한다
class Hospital {
	public void 예방접종(Animal animal) {
	}
}

public class 부모를사용하는이유2 {
	public static void main(String[] args) {
		Hospital h = new Hospital();
		h.예방접종(new Cat());
		h.예방접종(new Dog());
	}

}
