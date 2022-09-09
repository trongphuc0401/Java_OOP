package java62;

import java.util.Scanner;
import java.util.Stack;

public class Doi_so_nhi_phan {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
	;
//		stackChuoi.push("Giatri"); = > đưa giá trị vào stack
// 		stackChoui.pop() => lấy giá trị ra
//		stackChuoi.peek() => lấy giá trị ra nhưng không xóa khỏi stack
//		stackChuoi.clear(); = > xóa tất cả giá trị
//		stackChuoi.contains("giatri") => xác định giá trị có tồn tại trong stack hay không
		
		
		// Ví dụ đảo ngược chuỗi 
	
			
		// Ví dụ chuyển từ hệ thập phân sang hệ nhị phân 
			Stack<String> stackSoDu = new Stack<String>();
			System.out.println("Nhập 1 số nguyên dương từ bàn phím");
			int x = sc.nextInt();
			while (x>0) {
				int soDu = x%2;
				stackSoDu.push(soDu+"");
				x = x/2;
				
			}
			int n = stackSoDu.size();
			for(int i =0;i<n; i++) {
				System.out.print(stackSoDu.pop());
			}
		}
	}


