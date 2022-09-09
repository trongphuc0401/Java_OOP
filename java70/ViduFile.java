package java70;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViduFile {
	public static void copyAll(File f1, File f2) {
		try {
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(f1.isDirectory()) {
			// Copy cac tap tin va thuc muc
			File[] mangCon = f1.listFiles();
			for (File file : mangCon) {
				File file_new  = new File(f2.getAbsoluteFile()+"\\"+file.getName());
				copyAll(file,file_new);
			}
		}
	}
	public static void main(String[] args) {
		File f0 = new File("E:\\Java\\Java_Youtube\\src\\java70\\File_1.txt");
		File f1 = new File("E:\\Java\\Java_Youtube\\src\\java70\\File_2.txt");
		File f2 = new File("E:\\Java\\Java_Youtube\\src\\java70\\File_2xyz.txt");
		//1. đổi tên file		
//		f0.renameTo(f1);
		
//		try {
//			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		// 2.Di chuyển File
//		File f2_0 = new File("E:\\Java\\Java_Youtube\\src\\java70\\F0\\File_2xyz.txt");
//		try {
//			Files.move(f2.toPath(), f2_0.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			
//		}
		//3.Copy File
		File f0_1 = new File("E:\\Java\\Java_Youtube\\src\\java70\\F0");
		File f0_1copy = new File("E:\\Java\\Java_Youtube\\src\\java70\\F0_copy");
		
		copyAll(f0_1, f0_1copy);
				
				
		
	}

}
