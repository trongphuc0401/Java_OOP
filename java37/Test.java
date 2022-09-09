package java37;

public class Test {

	public static void main(String[] args) {
		Lop lop1 = new Lop("1A","CNTT");
		Lop lop2 = new Lop("2A","Maketing");
		Lop lop3 = new Lop("3A","OTO");
		
		Ngay ngay1 = new Ngay(22,3,2001);
		Ngay ngay2 = new Ngay(12,3,2251);
		Ngay ngay3 = new Ngay(22,3,2001);
		
		SinhVien sv1 = new SinhVien("9026","Phuc",ngay1,9.5,lop1);
		SinhVien sv2 = new SinhVien("9426","Tai",ngay2,6.5,lop2);
		SinhVien sv3 = new SinhVien("9076","Pluc",ngay3,8.5,lop3);
		
		
		System.out.println("Ten khoa: ");
		System.out.println("Sv1: "+sv1.layTenKhoa());
		System.out.println("Sv2: "+sv2.layTenKhoa());
		System.out.println("Sv3: "+sv3.layTenKhoa());
		
		System.out.println("Sv1: "+sv1.kiemTraThiDat());
		System.out.println("Sv2: "+sv2.kiemTraThiDat());
		System.out.println("Sv3: "+sv3.kiemTraThiDat());
		System.out.println("Kiem tra cung ngay sinh: ");
		System.out.println("sv1 va sv3: "+sv1.kiemTraCungNgaySinh(sv3));
		System.out.println("sv2 va sv3: "+sv2                                                                                                        .kiemTraCungNgaySinh(sv3));
		
	}

}
