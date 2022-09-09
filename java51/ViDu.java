package java51;

public class ViDu {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "tITV";
		String s2 = ".vn";
		String s3 = s1+s2;
		String s4 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		
		
		
		String s5 = "Tung.vn";
		String s6 = s5.replaceAll( "Tung","TITV");
		System.out.println(s6);
		
		
		//toLoweCase 
		//toUpperCase
		
		
		
		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();
	
		
		
		//trim()
		String s9 = "Xin chào các bạn mình là  TITV.vn       ";
		System.out.println(s9.trim());
		
		String s10 = "Xin chào các bạn mình là TITV.vn";
		String s11 = s10.substring(10);
		String s12 = s10.substring(10,15);
		System.out.println(s11);
		System.out.println(s12);
		
		
		
		
	}
}
