package bai1;

public abstract class thuoc {
	private String tenThuoc;
	private float donGia;
	private int sl;
	public String getTenThuoc() {
		return tenThuoc;
	}
	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public thuoc(String tenThuoc, float donGia, int sl) {
		this.donGia = donGia;
		this.sl = sl;
		this.tenThuoc = tenThuoc;
	}
	public abstract float tienThuoc();
}
