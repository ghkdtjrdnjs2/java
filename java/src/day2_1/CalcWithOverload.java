package day2_1;

public class CalcWithOverload {
	public int sum(int a, int b) {
		return a + b;
	}

	public double sum(double a, int b) {
		return a + b;
	}

	public double sum(int a, double b) {
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}
}
