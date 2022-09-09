package java46;

public class Test {
public static void main(String[] args) {
	System.out.println("Test câu a: ");
	MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
	MayTInhVinaCal500 mvn500 = new MayTInhVinaCal500();
	
	System.out.println("5+3 = "+mfx500.cong(5,3));
	System.out.println("4*5 = "+mfx500.nhan(4,5));
	System.out.println("4/0 = "+mfx500.chia(4,0));
	
	PhamMemMayTinh pmmp = new PhamMemMayTinh();
	
	
}
}
