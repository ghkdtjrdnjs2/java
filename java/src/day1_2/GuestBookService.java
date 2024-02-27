package day1_2;

import java.util.ArrayList;

public class GuestBookService {
	private ArrayList<GuestBook> list = new ArrayList<>();
	
	public ArrayList<GuestBook> findAll() {
		return list;
	}
	
	public Long findById(Long gno) {
		for(GuestBook g:list) {
			if(g.getGno()==gno) {
				return gno;
			}
		}
		return null;
	}
	
	public void save(GuestBook guestbook) {
		list.add(guestbook);
	}
	
	public Long delete(Long gno) {
		for(GuestBook g:list) {
			if(g.getGno()==gno) {
				list.remove(g);
				return 1L;
			}
		}
		return 0L;
	}
}
