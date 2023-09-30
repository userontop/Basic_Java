package bai2;
import java.util.Scanner;
public class sinVien {
	private String mssv, ten;
	private float diemLyThuyet, diemThucHanh;
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getDiemLyThuyet() {
		return diemLyThuyet;
	}
	public void setDiemLyThuyet(float diemLyThuyet) {
		this.diemLyThuyet = diemLyThuyet;
	}
	public float getDiemThucHanh() {
		return diemThucHanh;
	}
	public void setDiemThucHanh(float diemThucHanh) {
		this.diemThucHanh = diemThucHanh;
	}
	public sinVien(){
		this.diemLyThuyet = 0;
		this.diemThucHanh = 0;
		this.mssv = "";
		this.ten = "";
	}
	public sinVien(String mssv, String ten, float diemLyThuyet, float diemThucHanh){
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
		this.mssv = mssv;
		this.ten= ten;
	}
	public float tinhDiemTB(){
		float dTB = 0;
		dTB = (this.diemThucHanh + this.diemLyThuyet)/2;
		return dTB;
	}
	public void nhapSV(){
		Scanner s1 = new Scanner(System.in);
		System.out.print("nhap mssv: ");
		this.mssv = s1.next();
		System.out.print("nhap ten Sv: ");
		this.ten = s1.next();
		System.out.print("nhap diem Ly Thuyet: ");
		this.diemLyThuyet = s1.nextFloat();
		System.out.print("nhap diem Thuc Hanh: ");
		this.diemThucHanh = s1.nextFloat();
	}
	
	public String toString() {
		return ("\n1 "+ ten + "\t "+ mssv+" \t"+ tinhDiemTB());
	}
	
	public static void main(String[] args){
		sinVien sv1 = new sinVien("sv01", "Nguyen Van A", 9, 10);
		sinVien sv2 = new sinVien("sv02", "Nguyen Van B", 5, 9);
		sinVien sv3 = new sinVien();
		sv3.nhapSV();
		System.out.print(" Sinh Vien\t  mssv\tDiem Trung Binh");
		System.out.print("------------------------------------------------------------");
		System.out.print(sv1);
		System.out.print(sv2);
		System.out.print(sv3);
	}
}
