package java36;

public class Test {
	public static void main(String[] args) {
		
	
	Ngay ngay1 = new Ngay(22,3,2022);
	Ngay ngay2 = new Ngay(15,6,2023);
	Ngay ngay3 = new Ngay(8,7,2025);
	
	HangSanXuat hangSanXuat1 = new HangSanXuat("Mavel","America");
	HangSanXuat hangSanXuat2 = new HangSanXuat("Mappa","Jappan");
	HangSanXuat hangSanXuat3 = new HangSanXuat("Entertaiment","VietNam");
	
	BoPhim boPhim1 = new BoPhim("Ironman 3",2013,hangSanXuat1,75000,ngay1);
	BoPhim boPhim2 = new BoPhim("Attack on Titan",2022,hangSanXuat2,85000,ngay2);
	BoPhim boPhim3 = new BoPhim("Bo gia",2023,hangSanXuat3,45000,ngay3);
	
	System.out.println("So sanh gia 1 re hon 2: " + boPhim1.kiemTraGiaVeReHon(boPhim2));
	System.out.println("So sanh gia 2 re hon 3: " + boPhim2.kiemTraGiaVeReHon(boPhim3));
	System.out.println("So sanh gia 1 re hon 3: " + boPhim1.kiemTraGiaVeReHon(boPhim3));
	
	
	
	System.out.println("Ten hang san xuat BP 3: "+ boPhim3.layTenHangSanXuatPhim());
	System.out.println("Ten hang san xuat BP 2: "+ boPhim2.layTenHangSanXuatPhim());
	
	System.out.println("BP1 Giam 10%: " + boPhim1.giaSauKhuyenMai(10));
	System.out.println("BP2 Giam 20%: " + boPhim2.giaSauKhuyenMai(20));
	System.out.println("BP3 Giam 50%: " + boPhim3.giaSauKhuyenMai(50));
	
	
	}
}
