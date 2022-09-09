package QLSV;

import java.io.Serializable;

public class SinhVien implements Comparable<SinhVien>,Serializable {
	private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private float diemTrungBinh;
	/**
	 * @param maSinhVien
	 * @param hoVaTen
	 * @param namSinh
	 * @param diemTrungBinh
	 */
	public SinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
		
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTrungBinh = diemTrungBinh;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}
	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return this.maSinhVien.compareTo(o.maSinhVien);
	}
	
	

}
