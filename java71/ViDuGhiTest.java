package java71;

import java.io.PrintWriter;

public class ViDuGhiTest {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("E:\\Java\\Java_Youtube\\src\\java71\\file.txt","UTF-8");
			pw.println("Xin chào mình là Phúc");
			pw.println("Dữ liệu: ");
			pw.print(3.14);
			pw.print(' ');
			
			Student st = new Student(100, "Nguyễn Văn A");
			pw.println(st);
			pw.println();
			pw.flush();
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception\
			e.printStackTrace();
		}
	}

}
