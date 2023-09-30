package bai4;
import java.util.Scanner;
public class NhanVien {
	private String ten;
	private float HSL;
	public static float LCB = 540000;
	public static int soNV = 0;
	public NhanVien() {
		this.soNV++;
	}
	public NhanVien(String hoten, float hsl) {
		this.ten = hoten;
		this.HSL = hsl;
		this.soNV++;
	}
	public void tangHSL(float heso) {
		this.HSL = this.HSL + heso;
	}
	public void tangLCB(float tien) {
		this.LCB = this.LCB + tien;
	}
	public float tinhLuong() {
		float luong;
		luong = this.LCB * this.HSL;
		return luong;
	}
	public void inThongTin(NhanVien x) {
		System.out.println("Tên: "+ x.ten + " có HSL là "+ x.HSL+" và lương là "+ 
		x.tinhLuong());
	}
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in); 
		System.out.println("Nhập số nhân viên: ");
		do {
			n = input.nextInt();
		}while(n <= 0);
		System.out.println("Nhập " +n+" nhân viên: ");
		NhanVien[] nv = new NhanVien[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhân viên thứ : "+(i+1));
			input.nextLine();
			System.out.print("Tên: ");
			String ten = input.nextLine();
			System.out.print("HSL: ");
			float hsl = input.nextFloat();
			NhanVien x = new NhanVien(ten, hsl);
			nv[i] = x;
		}
		System.out.println("============================");
		System.out.println("Số nhân viên: "+ NhanVien.soNV);
		System.out.println("Lương cơ bản: "+ NhanVien.LCB);
		System.out.println("============================");
		System.out.println("In thông tin sinh viên");
		for(int i = 0; i < n; i++){
			System.out.println("Nhân viên thứ "+(i+1));
			nv[i].inThongTin(nv[i]);
		}
	}
}
