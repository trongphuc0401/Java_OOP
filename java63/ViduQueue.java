package java63;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


public class ViduQueue {

	public static void main(String[] args) {
		Deque<String> danhSachSV = new ArrayDeque<String>();
		danhSachSV.offer("TITV");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("TITV");
		danhSachSV.offerLast("TITV 4");
		danhSachSV.offerFirst("TITV A");
		
		
		while(true) {
			//poll lay ra va xoa
			String ten = danhSachSV.poll();
			if(ten ==null) {
				break;
			}
			//peek lay ra nhung khong xoa
			System.out.println(ten);
		}
		
	}
}
