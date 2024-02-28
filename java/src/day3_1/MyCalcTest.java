package day3_1;

/*
		객체지향의 궁극적인 코드 재사용 
		자식 - sub class, derlved class(파생 클래스)
		부모 - super class, base class
	자식은 부모를 포함한다
*/

class MyCalc extends Calc {
	public int mul(int a, int b) {
		return a*b;
	}
}

public class MyCalcTest extends Calc {
	public static void main(String[] args) {
		MyCalc myCalc = new MyCalc();
		System.out.println(myCalc.sum(10, 20));
		System.out.println(myCalc.mul(20, 20));
	} 
}