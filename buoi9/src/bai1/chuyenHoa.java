package bai1;

public class chuyenHoa extends thiSinh{
	protected float diemHoa;

	protected float getDiemHoa() {
		return diemHoa;
	}

	protected void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
	
	protected chuyenHoa(String ht, String sbd, String nam, String diachi, float anh, float van, float toan, float hoa){
		super( ht,  sbd, nam,  diachi,  anh, van,  toan);
		this.diemHoa = hoa;
	}
	protected chuyenHoa(){
		super();
		this.diemHoa = 0;
	}
	public void nhap(){
		super.nhap();
		System.out.print("Diem hoa = ");
		diemHoa = so1.nextFloat();
	}
	public String toString(){
		return "sobaodanh: " + this.soBaoDanh+ ", hoten: " + this.hTen + ", namsinh: " + this.namSinh +", diachi: " + this.diaChi+ ", diemtoan: "+this.diemToan+", diemvan: "+this.diemVan+", diemanh: "+this.diemAnh+", diemhoa: "+diemHoa+", tongdiem: "+this.tongDiem();
	}
	
	public float tongDiem(){
		return this.diemVan + this.diemToan + this.diemAnh + diemHoa *2;
	}
}
