package java64;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RutThamTrungThuong_HashSet {
	Set<String> thuongPhieuDuThuong = new TreeSet<String>();
	Queue<String> danhSachSV = new PriorityQueue<String>();
	
	
	/**
	 * @param thuongPhieuDuThuong
	 */
	public RutThamTrungThuong_HashSet() {		
	}

	public boolean themPhieu(String giaTri) {
		return this.thuongPhieuDuThuong.add(giaTri);
	}
	public boolean xoaPhieu(String giaTri) {
		return this.thuongPhieuDuThuong.remove(giaTri);
	}
	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.thuongPhieuDuThuong.contains(giaTri);
	}
	public void xoaAllPhieuDuThuong() {
		 this.thuongPhieuDuThuong.clear();
	}
	public int laySoLuongPhieu() {
		return this.thuongPhieuDuThuong.size();
	}
	
	public String rutMotPhieu() {
		String ketqua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.thuongPhieuDuThuong.size());
		ketqua =(String) this.thuongPhieuDuThuong.toArray()[viTri];
		return ketqua;
	}
	public void intTatCa() {
		System.out.println(Arrays.toString(this.thuongPhieuDuThuong.toArray()));
	}
	public static void main(String[] args) {
		
		int luachon = 0;
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
		do {
			System.out.println("----------------------------------------");
			System.out.println("MENU: ");
			System.out.println("1. Thêm mã số dự thưởng.");
			System.out.println("2. Xóa mã số dự thưởng.");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
			System.out.println("4. Xóa tất cả cá phiếu dự thưởng.");
			System.out.println("5. Số lượng phiếu dự thưởng.");
			System.out.println("6. Rút thăm trúng thưởng.");
			System.out.println("7. In ra tất cả các phiếu");
			System.out.println("0. Thoát khỏi chương trình");
			luachon = sc.nextInt();
			sc.nextLine();
			
			String giaTri = ""; 
			switch (luachon) {
			case 1:
				System.out.println("Nhập vào mã số phiếu dự thưởng: ");
				giaTri=sc.nextLine();
				rt.themPhieu(giaTri);
				break;
			case 2: 
				rt.xoaPhieu(giaTri);
				break;
			case 3: 
				System.out.println("Kết quả  kiểm tra: "+ rt.kiemTraPhieuTonTai(giaTri));
				break;
			case 4: 
				rt.xoaAllPhieuDuThuong();
				System.out.println("Tất cả phiếu đã được xóa");
				break;
			case 5:
				System.out.println("Số lượng số phiếu dự thưởng là: "+rt.laySoLuongPhieu());
				break;
			case 6:
				System.out.println("Mã số trúng thưởng là: "+rt.rutMotPhieu());
				break;
			case 7:
				System.out.println("Các mã phiếu dữ thưởng: ");
				rt.intTatCa();
				break;
			case 0:
				System.out.println("Bye");
			default:
				System.out.println("Lỗi");
			}
			
		}while(luachon !=0);
	}
	
}
