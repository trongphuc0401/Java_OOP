package java36;

public class BoPhim {

	private String tenPhim;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private Ngay ngaychieu;
	public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngaychieu) {
		
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngaychieu = ngaychieu;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public Ngay getNgaychieu() {
		return ngaychieu;
	}
	public void setNgaychieu(Ngay ngaychieu) {
		this.ngaychieu = ngaychieu;
	}
	public boolean kiemTraGiaVeReHon(BoPhim phimKhac) {
		return this.giaVe <phimKhac.giaVe;
		
	}
	public String layTenHangSanXuatPhim() {
		return this.hangSanXuat.getTenHangSanXuat();
	}
	public double giaSauKhuyenMai (double x) {
		return this.giaVe*(1-x/100);
	}
}
