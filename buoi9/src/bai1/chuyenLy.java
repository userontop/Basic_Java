package bai1;

public class chuyenLy extends thiSinh{
	protected float diemLy;
	
	
	protected float getDiemLy() {
		return diemLy;
	}


	protected void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}
	protected chuyenLy(String ht, String sbd, String nam, String diachi, float anh, float van, float toan, float ly){
		super( ht,  sbd,  nam,  diachi,  anh,  van,  toan);
		this.diemLy = ly;
	}
	protected chuyenLy(){
		super();
		this.diemLy = 0;
	}
	public void nhap(){
		super.nhap();
		System.out.print("Diem ly = ");
		diemLy = so1.nextFloat();
	}
	public String toString(){
		return "sobaodanh: " + this.soBaoDanh+ ", hoten: " + this.hTen + ", namsinh: " + this.namSinh +", diachi: " + this.diaChi+ ", diemtoan: "+this.diemToan+", diemvan: "+this.diemVan+", diemanh: "+this.diemAnh+", diemly: "+diemLy+", tongdiem: "+this.tongDiem();	
	}

	public float tongDiem(){
		float tong = 0;
		return tong = this.diemVan + this.diemToan + this.diemAnh + diemLy *2;
	}
}