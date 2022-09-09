package java37;

public class SinhVien {
	private String maSoSinhVien,hovaten;
	private Ngay ngaySinh;
	private double diemTB;
	private Lop lop;
	public SinhVien(String maSoSinhVien, String hovaten, Ngay ngaySinh, double diemTB, Lop lop) {
		this.maSoSinhVien = maSoSinhVien;
		this.hovaten = hovaten;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}
	public String getMaSoSinhVien() {
		return maSoSinhVien;
	}
	public void setMaSoSinhVien(String maSoSinhVien) {
		this.maSoSinhVien = maSoSinhVien;
	}
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public Ngay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	                        
	public String layTenKhoa() {
		return this.lop.getTenKhoa();
	}                                               
	public boolean kiemTraThiDat() {
		return this.diemTB >= 5;
	}
	public boolean kiemTraCungNgaySinh(SinhVien svKhac) {
		return this.ngaySinh.equals(svKhac.ngaySinh);
	}
}
