package day1_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class GuestBookServiceTest {
	private GuestBookService service = new GuestBookService();

	// @Test
	public void saveAndFindAllTest() {
		assertEquals(0L, service.findAll().size());
		service.save(new GuestBook(1L, "안녕하세요", "spring", LocalDate.now()));
		assertEquals(1L, service.findAll().size());
	}

	// @Test
	public void findByIdTest() {
		service.save(new GuestBook(1L, "안녕하세요", "spring", LocalDate.now()));
		// 읽기 성공
		assertNotNull(service.findById(1L));
		// 읽기 실패
		assertNull(service.findById(111L));
	}

	@Test
	public void deleteTest() {
		service.save(new GuestBook(1L, "안녕하세요", "spring", LocalDate.now()));
		// 삭제 실패
		assertEquals(1L, service.delete(111L));
		// 삭제 성공
		assertEquals(1L, service.delete(1L));
	}
}