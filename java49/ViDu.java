package java49;

import java.util.Scanner;

public class ViDu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = "Hello world";
	System.out.println("Nhập vào chuỗi: ");
	s = sc.nextLine();
	System.out.println("------------");
	// lay ra do dai cua chuoi
	System.out.println(s.length());
	int doDai = s.length();
	
	for(int i=0;i<doDai;i++) {
		System.out.println("Vị trí"+i+" là: "+s.charAt(i));
	}
	char[] arrayChar = new char[100];
	s.getChars(2, 4, arrayChar, 0);
	for(int i=0;i<arrayChar.length;i++) {
		System.out.println("Mang gia tr Char: "+i+" la: "+arrayChar[i]);
		
	}
	byte[] arrayBytes = s.getBytes();
	for(byte b: arrayBytes) {
		System.out.println(b);
	}
}
}
