package QLSV;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViduGhiObject {
	public static void main(String[] args) {
		try {
			File file = new File("E:\\Java\\Java_Youtube\\src\\QLSV\\file.data");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			SinhVien st  =new SinhVien("001","TITV",2000,10.0f);
			oos.writeObject(st);
			
			oos.flush();
			oos.close();
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
