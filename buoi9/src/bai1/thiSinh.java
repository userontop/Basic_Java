package bai1;
import java.util.Scanner;

public class thiSinh {
	protected String hTen, soBaoDanh, namSinh, diaChi;
	protected float diemToan, diemVan, diemAnh;
	protected Scanner so1 = new Scanner(System.in);
	
	protected thiSinh(String ht, String sbd, String nam, String diachi, float anh, float van, float toan){
		this.diaChi = diachi;
		this.diemAnh = anh;
		this.diemToan = toan;
		this.diemVan = van;
		this.hTen = ht;
		this.namSinh = nam;
		this.soBaoDanh = sbd;
	}
	
	protected thiSinh(){
		this.diaChi = "";
		this.diemAnh = 0;
		this.diemToan = 0;
		this.diemVan = 0;
		this.hTen = "";
		this.namSinh = "";
		this.soBaoDanh = "";
	}
	

	protected String gethTen() {
		return hTen;
	}

	protected void sethTen(String hTen) {
		this.hTen = hTen;
	}

	protected String getSoBaoDanh() {
		return soBaoDanh;
	}

	protected void setSoBaoDanh(String soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	protected String getNamSinh() {
		return namSinh;
	}

	protected void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	protected String getDiaChi() {
		return diaChi;
	}

	protected void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	protected float getDiemToan() {
		return diemToan;
	}

	protected void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	protected float getDiemVan() {
		return diemVan;
	}

	protected void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	protected float getDiemAnh() {
		return diemAnh;
	}

	protected void setDiemAnh(float diemAnh) {
		this.diemAnh = diemAnh;
	}
	
	public void nhap(){
		System.out.print("\nNhap thong tin sinh vien: ");
		System.out.print("\nSo bao danh: ");
		soBaoDanh = so1.next();
		System.out.print("Ho ten: ");
		hTen = so1.next();
		System.out.print("Nam sinh: ");
		namSinh = so1.next();
		System.out.print("Dia chi: ");
		diaChi = so1.next();
		System.out.print("Diem toan = ");
		diemToan = so1.nextFloat();
		System.out.print("Diem van = ");
		diemVan = so1.nextFloat();
		System.out.print("Diem Anh = ");
		diemAnh = so1.nextFloat();
	}
	public String toString(){
		return "" + this.soBaoDanh+ "\t" + this.hTen + "\t" + this.namSinh +"\t" + this.diaChi+ "\t"+this.diemToan+"\t"+this.diemVan+"\t"+this.diemAnh;
	}
	public float tongDiem() {
		return this.diemAnh + this.diemToan+ this.diemVan;
	}
	
}
