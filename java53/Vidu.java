package java53;

import java.util.Arrays;

public class Vidu {
	public static void main(String[] args) {
		int[] mang1= {1,2,3};
		
		int[] mang1_a = mang1;
		mang1_a[0]=100;
		System.out.println(Arrays.toString(mang1));
		System.out.println(Arrays.toString(mang1_a));
		
		 
		
	}

}
