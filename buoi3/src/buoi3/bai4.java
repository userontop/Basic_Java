package buoi3;

import java.util.Scanner;

public class bai4 {
	public int nhap() {
		int a;
		Scanner so1 = new Scanner(System.in);
		a = so1.nextInt();
		return a;
	}
	public int tong(int n) {
		int tong = 0;
		while(n > 0) {
			tong += n % 10;
			n = n/10;
		}
		return tong;
	}
	public static void main(String[] args) {
		bai4 b4 = new bai4();
		int n;
		System.out.println("nhap n: ");
		n= b4.nhap();
		System.out.println("tong cac chu so cua so nguyen = "+ (b4.tong(n)));
	}

}
