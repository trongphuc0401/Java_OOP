package java38;

public class MayTinh {

	private HangSanXuat hangSanXuat;
	private double giaBan;
	private double thoiGianBaoHanh;
	private Ngay ngaySanXuat;
	public MayTinh(HangSanXuat hangSanXuat, double giaBan, double thoiGianBaoHanh, Ngay ngaySanXuat) {
		this.hangSanXuat = hangSanXuat;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.ngaySanXuat = ngaySanXuat;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public double getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public Ngay getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Ngay ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	
	public boolean kiemTraGiaThapHon (MayTinh mayKhac) {
		return this.giaBan < mayKhac.giaBan;
	}
	public String layTenQuocGia () {
		return this.hangSanXuat.layTenQuocGia();
	}
}
