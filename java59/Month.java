package java59;

public enum Month {
	January(30),
	February(29),
	March(30),
	April(31),
	May(30),
	June(31),
	July(30),
	August(31),
	September(30),
	October(31),
	November(30),
	December(31);
	
	private final int soNgay;
	Month(int soNgay) {
		this.soNgay = soNgay;
	}
	public  int soNgay() {
		return soNgay;
	}
}
