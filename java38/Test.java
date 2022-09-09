package java38;


import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int a,b,tong,hieu,tich;
		double thuong = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập vào a: ");
			a = sc.nextInt();
			System.out.println("Nhập vào b: ");
			b = sc.nextInt(); 
		
			tong = a + b; hieu = a - b; tich = a * b; 
		
			System.out.println("Tổng 2 số a và b là :"+tong);
			System.out.println("Hiệu 2 số a và b là :" + hieu);
			System.out.println("Tích 2 số a và b là :" + tich);
			if (b != 0)
			{
				thuong = (double)a / b;
				System.out.println("Thương 2 số a và b là :" + thuong);
			}
			else
				System.out.println("Không chia được cho số 0 !");
		
	}
	
}
