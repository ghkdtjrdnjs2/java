package day1_2;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class GuestBook {
	private Long gno;
	private String content;
	private String writer;
	private LocalDate writeday;

	public GuestBook(Long gno, String content, String writer, LocalDate writeday) {
		this.gno = gno;
		this.content = content;
		this.writer = writer;
		this.writeday = writeday;
	}

	public GuestBook() {
	}
}
