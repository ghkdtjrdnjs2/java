package day2_3;

import day2_2.MyDate2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 도시락 : 제품명, 가격, 날짜
// 도시락 클래스는 String, Long, MyDate2 객체를 사용한다
// -> 도시락은 String, Long, MyDate2에 "의존한다" or "dependency가 있다"

// 객체와 객체의 관계
// A가 B를 사용한다 -> 의존관계
// A가 B를 상속한다

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Dosirak2 {
	String name;
	@Setter
	Long price;
	MyDate2 productDay;
}