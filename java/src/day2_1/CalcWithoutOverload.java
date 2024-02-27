package day2_1;

//이름은 중복 불가능하다(식별기능)

//함수의 이름도 중복불가능 -> C언어는 아래처럼 작성해야 한다

public class CalcWithoutOverload {
	public int sumii(int a, int b) {
		return a + b;
	}

	public double sumdi(double a, int b) {
		return a + b;
	}

	public double sumid(int a, double b) {
		return a + b;
	}

	public double sumdd(double a, double b) {
		return a + b;
	}
}