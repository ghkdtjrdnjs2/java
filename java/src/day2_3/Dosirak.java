package day2_3;


import day2_2.MyDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dosirak {
	private String name;
	private Long price;
	private MyDate productDay;
	
	public Dosirak() {
	}
	
	public Dosirak(String name, Long price, MyDate productDay) {
		this.name = name;
		this.price = price;
		this.productDay = productDay;
	}
}