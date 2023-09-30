package bai1;

public class thuocBaoHiem extends thuoc{
	private int tiLeGiam;

	public int getTiLeGiam() {
		return tiLeGiam;
	}

	public void setTiLeGiam(int tiLeGiam) {
		this.tiLeGiam = tiLeGiam;
	}
	public thuocBaoHiem(String tenThuoc, float donGia, int sl, int giam) {
		super(tenThuoc, donGia, sl);
		this.tiLeGiam = giam;
	}
	public float tienThuoc() {
		return this.getDonGia() * (float)(this.tiLeGiam/100) * this.getSl();
	}
}
