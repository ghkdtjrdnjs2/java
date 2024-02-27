package day2_6;

import java.util.ArrayList;

import org.apache.commons.lang3.RandomStringUtils;

public class MemberService2 {
	public static ArrayList<Member2> list = new ArrayList<>();
	
	// 아이디사용가능2
	public static Boolean 아이디사용가능2(String username2) {
		for(Member2 m:list) {
			if(m.getUsername2().equals(username2)) {
				return false;
			}
		}
		return true;
	}
	// 회원가입2
	public static void 회원가입2(Member2 member2) {
		list.add(member2);
	}
	
	// 아이디 찾기2
	public static String 아이디찾기2(String email2) {
		for(Member2 m:list) {
			if(m.getEmail2().equals(email2)) {
				return m.getUsername2();
			}
		}
		return null;
	}
	// 비밀번호 찾기2
	public static String 비밀번호찾기2(String username2) {
		for(Member2 m:list) {
			if(m.getUsername2().equals(username2)) {
				return RandomStringUtils.randomAlphanumeric(20);
			}
		}
		return null;
	}
	// 로그인2
	public static Boolean 로그인2(String username2, String password2) {
		for(Member2 m:list) {
			if(m.getUsername2().equals(username2)&& m.getPassword2().equals(password2)) {
				return true;
			}
		}
		return false;
	}
	// 내정보2
	public static Member 내정보2()
	// 비밀번호 변경2
}
