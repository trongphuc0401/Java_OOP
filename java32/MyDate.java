package java32;

public class MyDate {
	private int day;
	private int month;
	private int year;
	public MyDate(int day, int month, int year) {
		if(day>=1 && day <= 31) {
		this.day = day;
		}else {
			this.day=1;
		}
		if(month>=1 && month <=12) {
			this.month = month;
		}else {
			this.month = 1;
		}
		if (year >=0) {
			this.year = 1;
		}else {
			
		}
	}
	public int getDay() {
		return this.day;
		
	}
	public void setDay(int d) {
		if(d>=1 && d<=31)
			this.day = d;
	}
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int m) {
		if(m>=1 && m <12)
			this.month = m;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		if(y >=0)
			this.year = y;
	}
 	

}
