package day1_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TodoServiceTest {
	private TodoService service = new TodoService();

	// junit으로 테스트 반드시 public void 형식이어야한다
	@Test
	public void saveAndfindAlltest() {
		// Todo가 없는 상태에서 0인지 테스트
		ArrayList<Todo> list = service.findAll();
		assertEquals(0, list.size());

		service.save(new Todo(1L, "자바공부", LocalDate.now(), false));
		ArrayList<Todo> list2 = service.findAll();

		// assert 매소드 검증하는 메소드
		// assetEquals(내가 원하는 값, 실제로 값)
		assertEquals(1, list2.size());
	}

	// @Test
	public void deleteAndUpdateTest() {
		service.save(new Todo(1L, "자바공부", LocalDate.now(), false));
		service.save(new Todo(2L, "자바공부", LocalDate.now(), false));

		// 삭제 성공 테스트
		assertEquals(1L, service.delete(2L));
		// 삭제 실패 테스트
		assertEquals(0L, service.delete(222L));
	}

	// @Test
	public void UpdateTest() {
		service.save(new Todo(1L, "자바공부", LocalDate.now(), false));
		service.save(new Todo(2L, "자바공부", LocalDate.now(), false));
		assertEquals(1L, service.change(1L));
		}
	}
}
