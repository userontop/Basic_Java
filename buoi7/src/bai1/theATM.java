
package bai1;

public class theATM extends theNganHang{
	private int soNgayGui;

	public int getSoNgayGui() {
		return soNgayGui;
	}

	public void setSoNgayGui(int soNgayGui) {
		this.soNgayGui = soNgayGui;
	}
	public theATM(String mt, float laiSuat, float soTien, int soNgayGui){
		super(mt, laiSuat, soTien);
		this.soNgayGui = soNgayGui;
	}
	public float tinhTienLai(){
		float tienLai =(this.getSoTien()*(this.getLaiSuat()/360*100)*this.soNgayGui);
		return tienLai;
	}
}
