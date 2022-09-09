package java67;

import java.io.File;
import java.io.IOException;

public class Vidu {

	public static void main(String[] args) throws IOException {
//		Lưu ý
//		Ms Window: \ => \\ vidu : C:\\thumuc 1\\ thucmuc 2 \\ tentaptin.doc
//		Linux, MaOS: / |Vidu/thumuc/taptin.xxx
		
		File folder1 = new File("E:\\Java\\Java_Youtube\\src\\java68");	
		System.out.println(folder1.exists());
		System.out.println(folder1.createNewFile());
		
//		Tạo thư mục 
//		Phương thức mkdir
		File d1 = new File("E:\\Java\\Java_Youtube\\src\\java63\\Main");
		d1.mkdir();
		
		
//		Phương thức mkdirs() => tạo nhiều thư mục cùng lúc
		File d2 = new File("E:\\Java\\Java_Youtube\\src\\java63\\Main\\1\\1\\2\\1");
		d2.mkdirs();
		
//		Tạo tập tin (Có phần mở rộng .exe .txt.doc
		
		File file1 = new File("E:\\Java\\Java_Youtube\\src\\java63\\Main\\Vidu1.txt");
		try {
			file1.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
//			Không có quyền tạo tập tin
//			ổ cứng bị đầy 
//			Đường dẫn bị sai
			e.printStackTrace();
		}
	
	
	}	
}
