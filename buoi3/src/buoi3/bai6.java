package buoi3;
import java.lang.Math;
import java.util.Scanner;

public class bai6 {
	public int nhap() {
		int a;
		Scanner so1 = new Scanner(System.in);
		a = so1.nextInt();
		return a;
	}
	
	public static void kt(int a, int b, int c) {
		if(a + b > c && a + c > b && b + c > a)
			System.out.println("co the lap thanh tam giac.");
		else 
			System.out.println("khong the tao thanh tam giac.");
	}
	public int chuVi(int a, int b, int c) {
		int tong = a + b + c;
		return tong;
	}
	public double dienTich(int a, int b, int c, float p) {
		double s;
		s  = (double) Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;
	}
	public static void main(String[] args) {
		bai6 b6 = new bai6();
		int a, b, c;
		System.out.println("nhap a: ");
		a = b6.nhap();
		System.out.println("nhap b: ");
		b = b6.nhap();
		System.out.println("nhap c: ");
		c = b6.nhap();
		b6.kt(a, b, c);
		System.out.println("chu vi = "+ b6.chuVi(a, b, c));
		float p = (float)b6.chuVi(a, b, c)/ 2;
		double s = b6.dienTich(a, b, c, p);
		System.out.println("dien tich = "+ s);
	}

}
