package java63;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriorityQueue {

	public static void main(String[] args) {
		Queue<String> danhSachSV = new PriorityQueue<String>();
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("Nguyen Van A");
		
		danhSachSV.offer("TITV 2");
		danhSachSV.offer("%%%");
		danhSachSV.offer("1"); 
		danhSachSV.offer("5");
		
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
