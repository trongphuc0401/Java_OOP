package java35;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15,5,2021);
		Ngay ngay2 = new Ngay(15,7,2030);
		Ngay ngay3 = new Ngay(15,5,2030);
		
		TacGia tacGia1 = new TacGia("Trong Phuc",ngay1);
		TacGia tacGia2 = new TacGia("Tai Bui",ngay2);
		TacGia tacGia3 = new TacGia("Kim Cuong",ngay3);
		
		Sach sach1 = new Sach("Thuy Kieu",1000,2014,tacGia1);
		Sach sach2 = new Sach("Doraemon",2000,1014,tacGia2);
		Sach sach3 = new Sach("Pokemon",5000,1014,tacGia3);
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println("So sanh NXB sach 1 va sach 2: "+ sach1.kiemTraCungNam(sach2));
		System.out.println("So sanh NXB sach 1 va sach 3: "+ sach1.kiemTraCungNam(sach3));
		System.out.println("So sanh NXB sach 3 va sach 2: "+ sach3.kiemTraCungNam(sach2));
		
		System.out.println("Sach 1 giam gia 10%:  "+sach1.giaSauKhiGiam(10));
		System.out.println("Sach 2 giam gia 20%:  "+sach2.giaSauKhiGiam(20));
		System.out.println("Sach 3 giam gia 30%:  "+sach3.giaSauKhiGiam(30));
		
	}
	
	
	

}
