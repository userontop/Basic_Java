package bai1;

public class soTienTietKiem extends theNganHang{
	private int kyHan;

	public int getKyHan() {
		return kyHan;
	}

	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}
	
	public soTienTietKiem(String mt, float sotien, float laiSuat, int kyHan){
		super(mt, laiSuat, sotien);
		this.kyHan = kyHan;
	}
	public float tinhTienLai(){
		float tienLai =(float)(this.getSoTien() * (this.getLaiSuat()/12*100)*this.kyHan);
		return tienLai;
	}
	
}
