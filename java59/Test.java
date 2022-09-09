package java59;

public class Test {
public static void main(String[] args) {
	
	TKB tkb_t2 = new TKB(Day.Monday,"Toán Lý Hóa");
	TKB tkb_t3 = new TKB(Day.TuesDay, "Văn Sử Địa");
	TKB tkb_t4 = new TKB(Day.Wednesday, "Lý Hóa Sinh");
	TKB tkb_t5 = new TKB(Day.Thursday, "Tin GDCD Kinh Tế");
	TKB tkb_t6 = new TKB(Day.Friday, "TD Địa Toán");
	TKB tkb_t7 = new TKB(Day.Saturday, "Văn Lý Sử");
	
	System.out.println(tkb_t2);
	
	int x =Month.January.soNgay();
	System.out.println(x);
}
}
