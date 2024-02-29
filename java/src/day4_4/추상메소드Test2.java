package day4_4;

abstract class Vehicle2 {
	public abstract void drive();
}

class Truck2 extends Vehicle2 {
	public void run() {
		System.out.println("트럭이 달려갑니다.");
	}
}

class Bus2 extends Vehicle2 {
	public void go() {
		System.out.println("버스가 달려갑니다.");
	}
}

class Airplane2 extends Vehicle2 {
	public void fly() {
		System.out.println("비행기가 활주하면서 날아오릅니다");
	}
}

public class 추상메소드Test2 {
	public static void main(String[] args) {
		Vehicle2 v = new Airplane2();
		Vehicle2 v2 = new Truck2();
		
		v.drive();
		v2.drive();
	}
}
