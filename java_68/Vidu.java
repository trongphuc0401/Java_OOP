package java_68;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class Vidu {
		File file;
		
		public  Vidu(String tenFile) {
			this.file = new File(tenFile);
		}
		public boolean kiemTraThuThi() {
			return this.file.canExecute();
		}
		public boolean kiemTrDoc() {
			return this.file.canRead();
			
		}
		public boolean kiemTraGhi() {
			return this.file.canWrite();
		}
		public void inDuongDan() {
			System.out.println(this.file.getAbsolutePath());
		}
		public void inTen() {
			System.out.println(this.file.getName());
		}
		public void kiemTraLaThuMucHoacTapTin() {
			if(this.file.isDirectory()) {
				System.out.println("Đây là thưc mục");
			}else if(this.file.isFile()) {
				System.out.println("Đây là tập tin");
			}
			}
		
		public void InCayThucMuc() {
			this.inChiTietCayThuMuc(this.file , 1);
		}
		public void inChiTietCayThuMuc(File f,int bac) {
			
			for (int i = 0 ; i <bac; i++) {
				System.out.print("\t");
			
				}
			System.out.print("|__");
			System.out.println(f.getName());
			if(f.canRead()&&f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for(File fx : mangCon) {
				inChiTietCayThuMuc(fx, bac+1);
				}
			}
		}
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int luachon = 0;
			System.out.println("Nhập tên file: ");
			String tenFile = sc.nextLine();
			Vidu vdf = new Vidu(tenFile);
			do {
				System.out.println("MeNu ----------------");
				System.out.println("1. Kiểm tra file có thể thực thi");
				System.out.println("2. Kiểm tra file có thể đọc");
				System.out.println("3. Kiểm tra file có thể ghi");
				System.out.println("4. In đường dẫn");
				System.out.println("5. In tên file");
				System.out.println("6. Kiểm tra file là tập tin");
				System.out.println("7. In ra sách các tập tin con");
				System.out.println("8. In ra sách sách các cây thư mục");
				System.out.println("0. Thoát ra khỏi chương trình");
				luachon  = sc.nextInt();
				
				
				switch (luachon) {
				case 1 : 
					System.out.println(vdf.kiemTraThuThi());
					break;
				case 2:
					System.out.println(vdf.kiemTrDoc());
					break;
				case 3: 
					System.out.println(vdf.kiemTraGhi());
					break;
				case 4: 
					vdf.inDuongDan();
					break;
				case 5:
					vdf.inTen();
					break;
				case 6:
					vdf.kiemTraLaThuMucHoacTapTin();
					break;
				case 7:
					vdf.InCayThucMuc();
				default:
					System.out.println("Lỗi");
				}
		
		
			} while (luachon != 0);
			 
		}
}
