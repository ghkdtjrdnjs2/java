package day2_2;

import lombok.*;

@Getter
@Setter
public class MyDate {
	private Long year;
	private Long month;
	private Long day;
	
	public MyDate() {
	}
	
	public MyDate(Long year, Long month, Long day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
}