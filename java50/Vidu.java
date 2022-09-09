package java50;

public class Vidu {
public static void main(String[] args) {
	String s1 = "TITV.vn";
	String s2= "titvl.VN";
	String s3= "titv.VN";
	System.out.println("s1 equalsIgnoreCase s2: "+s1.equalsIgnoreCase(s3));
	System.out.println("s1 equalsIgnoreCase s2: "+s2.equalsIgnoreCase(s3));
	
	// Ham compareTo so sanh <>+<>>><><><><:<>j
	System.out.println();
	String sv1 = "Nguyen Van A";
	String sv2 = "Nguyen Van ";
	String sv3 = "Nguyen Van C";
	
	
	System.out.println(s1.compareTo(sv2));
	System.out.println(s1.compareTo(sv3));
	
}
}
