package day2_5;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 번호, 제목, 작성자, 작성시간
// 객체를 만들때 사용자가 주는 값 : 내용, 작성자

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeustBook {
	private Long gno;
	@Setter
	private	String content;
	private String writer;
	// LocalDate, LocalDateTime
	private LocalDateTime writeTime;
}
