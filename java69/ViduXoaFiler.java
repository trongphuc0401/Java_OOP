package java69;

import java.io.File;

public class ViduXoaFiler {
	
	public static void xoaFile(File fx) {
		if(fx.isFile()) {
			//Xóa nếu là tập tin
			System.out.print("Đã xóa: "+fx.getAbsolutePath());
			fx.delete();
		}else if(fx.isDirectory()) {
			// Lấy các file con
			File[] mangCon = fx.listFiles();
			for(File f: mangCon) {
				//Xóa các file con
				xoaFile(f);
			}
			// xóa bản thân thư mục trong khi xóa các file con
			fx.delete();
		}
	}
	public static void main(String[] args) {
		File f0  = new File("E:\\Java\\Java_Youtube\\src\\java69\\F0");
		File f0_1 = new File("E:\\Java\\Java_Youtube\\src\\java69\\F0_1");
		File f_vidu = new File("E:\\Java\\Java_Youtube\\src\\java69\\ViDU.txt");
		
		
	}

}
