package day2_5;

import java.util.ArrayList;

import day1_2.GuestBook;

// 처리하는 클래스 -> 객체 생성 X

public class GuestBookService {
	
	private static ArrayList<GuestBook> list = new ArrayList<>();
	
	public static void save(GuestBook gb) {
		list.add(gb);
	}
	public static ArrayList<GuestBook> findAll(){
		return list;
	}
	// 객체를 비교할 때는 ==아니라 equals메소드를 사용한다
	// 객체를 리턴하는 경우 실패하면 null을 리턴한다
	public static GuestBook findById(Long gno) {
		for(GuestBook gb:list) {
			if(gb.getGno().equals(gno)) {
				return gb;
			}
		}
		return null; // null의 뜻 가리키는 객체가 없다
		// 참거짓은 Boolean으로 true/false를 쓰면되는데
		// 참거짓이 아니고 가지고와서 읽거나 그런것이면 null을 쓰면 된다
	}
	public static Boolean delete(Long gno) {
		return false;
	}
}
