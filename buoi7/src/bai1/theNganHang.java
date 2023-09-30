package bai1;

public abstract class theNganHang {
	private String maThe;
	private float soTien;
	private float laiSuat;
	public String getMaThe() {
		return maThe;
	}
	public void setMaThe(String maThe) {
		this.maThe = maThe;
	}
	public float getSoTien() {
		return soTien;
	}
	public void setSoTien(float soTien) {
		this.soTien = soTien;
	}
	public float getLaiSuat() {
		return laiSuat;
	}
	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}
	public theNganHang(){
		this.laiSuat = 0;
		this.maThe = "";
		this.soTien = 0;
	}
	public theNganHang(String mt, float lais, float tien){
		this.laiSuat = lais;
		this.maThe = mt;
		this.soTien = tien;
	}
	public abstract float tinhTienLai();
}
