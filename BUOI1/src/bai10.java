import java.util.Scanner;

public class bai10 {
	public double pT1(int a, int b) {
		return (double)-b/a;
	}
	public static void main(String[] args) {
		bai10 b10 = new bai10();
		int a, b;
		Scanner so1 = new Scanner(System.in);
		System.out.println("nhap a:");
		a = so1.nextInt();
		System.out.println("nhap b:");
		b = so1.nextInt();
		System.out.print("\nphuong trinh bac nhat co dang: ax + b = 0");
		double x = b10.pT1(a, b);
		System.out.println("ket qua = "+ x);
		}
	}

