package bai1;

public class thuocThuong extends thuoc{
	private boolean coKeDon;

	public boolean isCoKeDon() {
		return coKeDon;
	}

	public void setCoKeDon(boolean coKeDon) {
		this.coKeDon = coKeDon;
	}
	public thuocThuong(String tenThuoc, float donGia, int sl, boolean coKeDon) {
		super(tenThuoc, donGia, sl);
		this.coKeDon = coKeDon;
	}
	public float tienThuoc() {
		float tien = this.getDonGia()*this.getSl();
		if(this.coKeDon == true)
			tien += tien*0.05;
		return tien;
	}
}
