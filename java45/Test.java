package java45;

public class Test {
	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Hang 1","VietNam");
		HangSanXuat h2 = new HangSanXuat("Hang 2","USA");
		HangSanXuat h3 = new HangSanXuat("Hang 3","NhatBan");
		
		PhuongTienDiChuyen p1 = new XeOto(h1,"Xang");
		PhuongTienDiChuyen p2 = new MayBay(h2,"Xang");
		PhuongTienDiChuyen p3 = new XeDap(h3);
		
		System.out.println("Lay hang san xuat");
		System.out.println("p1: "+p1.layTenHangSanXuat());
		
		System.out.println("Bat dau: ");
		p2.batDau();
		
		System.out.println("Lay van toc: ");
		System.out.println(p1.layVanToc());
		System.out.println(p2.layVanToc());
		System.out.println(p3.layVanToc());
		
		
		
		
		
	}
	
	
	
}
