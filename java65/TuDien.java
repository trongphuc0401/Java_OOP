package java65;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {

	private Map<String, String> duLieu = new TreeMap<String, String>();
	
	public String themTu(String tuKhoa , String yNghia) {
		return this.duLieu.put(tuKhoa, yNghia);
	}
	
	public String xoaTu(String tuKhoa) {
		return this.duLieu.remove(tuKhoa);
	}
	
	public String traTu(String tuKhoa) {
		String yNghia = this.duLieu.get(tuKhoa);
		return yNghia;
	}
	
	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.duLieu.keySet();
		
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
		
	}
	
	public int laySoLuong() {
		return this.duLieu.size();
	}
	
	public void xoaToanBo() {
		 this.duLieu.clear();
	}
	
	public static void main(String[] args) {
		TuDien tuDien = new TuDien();
		int luachon = 0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("----------------------");
		System.out.println("Menu");
		System.out.println("Tra từ điển Anh - Việt:\n"
				+ "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
				+ "2. Xóa từ\n"
				+ "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
				+ "4. In ra danh sách từ khóa\n"
				+ "5. Lấy số lượng từ\n"
				+ "6. Xóa tất cả các từ khóa\n"
				+ "0. Thoát khỏi chương trình\n"
				+ "");
		luachon  = sc.nextInt();
		sc.nextLine();
		
		String tukhoa = "";
		String yNghia = "";
		switch(luachon) {
			case 1:
				System.out.println("Nhập vào từ khóa:  ");
				tukhoa =sc.nextLine();
				System.out.println("Nhập vào ý nghĩa: ");
				yNghia =sc.nextLine();
				tuDien.themTu(tukhoa, yNghia);
				break;
			case 2:
				System.out.println("Nhập từ khóa");
				tukhoa = sc.nextLine();
				tuDien.xoaTu(tukhoa);
				break;
			case 3: 
				System.out.println("Nhập vào 1 từ khóa");
				tukhoa = sc.nextLine();
				System.out.println("Ý nghĩa là "+ tuDien.traTu(tukhoa));
				break;
			case 4: 
				tuDien.inTuKhoa();
				break;
			case 5: 
				System.out.println("Số lượng còn lại là: "+tuDien.laySoLuong());
				break;
			case 6: 
				tuDien.xoaToanBo();
				break;
				
			case 0:
				System.out.println("Bye");
			default:
				System.out.println("Lỗi");	
		}
		}while(luachon != 0);
	}
	
}
