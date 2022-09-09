package QLSV;

import java.io.File;
import java.util.Scanner;
public class Test {


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		DanhSachSinhVien dssv  =  new DanhSachSinhVien();
		int luachon = 0;
		do {
			System.out.println("------Menu-----");
			System.out.println("Vui lĂ²ng chá»�n chá»©c nÄƒng: ");
			System.out.println(
					  "1.	ThĂªm sinh viĂªn vĂ o danh sĂ¡ch.\n"
					+ "2.	In danh sĂ¡ch sinh viĂªn ra mĂ n hĂ¬nh.\n"
					+ "3.	Kiá»ƒm tra danh sĂ¡ch cĂ³ rá»—ng hay khĂ´ng.\n"
					+ "4.	Láº¥y ra sá»‘ lÆ°á»£ng sinh viĂªn trong danh sĂ¡ch.\n"
					+ "5.	LĂ m rá»—ng danh sĂ¡ch sinh viĂªn.\n"
					+ "6.	Kiá»ƒm tra sinh viĂªn cĂ³ tá»“n táº¡i trong danh sĂ¡ch hay khĂ´ng, dá»±a trĂªn mĂ£ sinh viĂªn.\n"
					+ "7.	XĂ³a má»™t sinh viĂªn ra khá»�i danh sĂ¡ch dá»±a trĂªn mĂ£ sinh viĂªn.\n"
					+ "8.	TĂ¬m kiáº¿m táº¥t cáº£ sinh viĂªn dá»±a trĂªn TĂªn Ä‘Æ°á»£c nháº­p tá»« bĂ n phĂ­m.\n"
					+ "9.	Xuáº¥t ra danh sĂ¡ch sinh viĂªn cĂ³ Ä‘iá»ƒm tá»« cao Ä‘áº¿n tháº¥p.\n"
					+ "10.	Luu Danh Sach Sinh Vien Xuong Tap Tin\n"
					+ "0.   ThoĂ¡t khá»�i chÆ°Æ¡ng trĂ¬nh");
					luachon = sc.nextInt();
					sc.nextLine();
					//1.	ThĂªm sinh viĂªn vĂ o danh sĂ¡ch
					if(luachon==1) {
						System.out.println("Nháº­p mĂ£ sinh viĂªn: ");String maSinhVien  = sc.nextLine();
						System.out.println("Nháº­p há»� vĂ  tĂªn: ");String hoVaTen  = sc.nextLine();
						System.out.println("Nháº­p nÄƒm sinh: ");int namSinh  = sc.nextInt();
						System.out.println("Nháº­p Ä‘iá»ƒm trung bĂ¬nh: ");float diemTrungBinh  = sc.nextFloat();
						SinhVien sv = new SinhVien(maSinhVien,hoVaTen,namSinh,diemTrungBinh);
						dssv.themSinhVien(sv);
					//2.	In danh sĂ¡ch sinh viĂªn ra mĂ n hĂ¬nh
					}else if(luachon==2) {
						dssv.inDanhSachSinhVien();
					//3.	Kiá»ƒm tra danh sĂ¡ch cĂ³ rá»—ng hay khĂ´ng	
					}else if(luachon==3) {
						System.out.println("Danh sĂ¡ch rá»—ng: "+dssv.kiemTraDanhSachRong());
					//4.	Láº¥y ra sá»‘ lÆ°á»£ng sinh viĂªn trong danh sĂ¡ch.	
					}else if(luachon==4) {
						System.out.println("Sá»‘ lÆ°á»£ng hiá»‡n táº¡i: "+dssv.laySoLuongSinhVien());
					//5.LĂ m rá»—ng danh sĂ¡ch sinh viĂªn.	
					}else if(luachon==5) {
						dssv.lamRongDanhSach();
					}else if(luachon==6) {
						//6.Kiá»ƒm tra sinh viĂªn cĂ³ tá»“n táº¡i trong danh sĂ¡ch hay khĂ´ng, dá»±a 
						System.out.println("Nháº­p mĂ£ sinh viĂªn: ");String maSinhVien  = sc.nextLine();
						SinhVien sv = new SinhVien(maSinhVien);
						System.out.println("Kiá»ƒm tra sinh viĂªn cĂ³ trong danh sĂ¡ch :"+dssv.kiemTraTonTai(sv));
					
					}else if(luachon==7) {
						//7.	XĂ³a má»™t sinh viĂªn ra khá»�i danh sĂ¡ch dá»±a trĂªn mĂ£ sinh viĂªn.
						System.out.println("Nháº­p mĂ£ sinh viĂªn: ");String maSinhVien  = sc.nextLine();
						SinhVien sv = new SinhVien(maSinhVien);
						System.out.println("XĂ³a sinh viĂªn trong danh sĂ¡ch: "+dssv.xoaSinhVien(sv));
					}else if(luachon==8) {
						//8.	TĂ¬m kiáº¿m táº¥t cáº£ sinh viĂªn dá»±a trĂªn TĂªn Ä‘Æ°á»£c nháº­p tá»« bĂ n phĂ­m.
						System.out.println("Nháº­p mĂ£ sinh viĂªn: ");String maSinhVien  = sc.nextLine();
						System.out.println("Káº¿t quáº£ tĂ¬m kiáº¿m: ");
						dssv.timSinhVien(maSinhVien);
						
					}else if(luachon==9) {
						//9.	Xuáº¥t ra danh sĂ¡ch sinh viĂªn cĂ³ Ä‘iá»ƒm tá»« cao Ä‘áº¿n tháº¥p.
						dssv.sapXepSinhVienGiamDanTheoDiem();
						dssv.inDanhSachSinhVien();
					}else if(luachon==10) {
						System.out.println("Nhập tên file: ");
						String tenFile = sc.nextLine();
						File f = new File(tenFile);
						dssv.gh
					}
		
		
		}while(luachon!=0);
}
}
