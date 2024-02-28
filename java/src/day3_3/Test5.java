package day3_3;

// access modifier : public private protected

class Emp {
	protected String name;
	protected Long nai;

}

// 부모의 private에는 자식은 접근 불가
class Regular extends Emp {
	private String position;
	private Long salary;

	public Regular(String name, Long nai, String position, Long salary) {
		super.name = name;
		super.nai = nai;
		this.position = position;
		this.salary = salary;
	}
}

public class Test5 {
	public static void main(String[] args) {
		Regular s1 = new Regular("홍길동", 30L, "대리", 4000000L);
	}
}