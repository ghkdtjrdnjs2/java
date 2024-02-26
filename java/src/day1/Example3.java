package day1;

public class Example3 {
	private static void main(String[] arges) {
		int nai = 35;
		if (nai >= 65) {
			System.out.println("무료");
		} else if (nai >= 25) {
			System.out.println("대인(3000원)");
		} else {
			// else는 조건을 적지 않는다. (don't care)
			// else 조건이 쉽게 보일 때 사용
			System.out.println("무료");
		}
	}

//	int 고과 = 70, 매출액 = 8000, 수금액 =7000;
//	if(고과>=70)
//	{
//
//	}else if(매출액>=8000)
//	{
//
//	}else if(수금액>=1000)
//	{
//
//	} 죽어도 이렇게 사용하만 안된다.
}
