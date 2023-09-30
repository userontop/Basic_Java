package buoi3;

import java.util.Scanner;

public class bai3 {
	public int nhap() {
		int ch;
		Scanner so1 = new Scanner(System.in);
		ch = so1.nextInt();
		return ch;
	}
	public static void inSo(int a, int b) {
		for(int i = a; i<= b; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.print("\t" + i);
			}
		}
	}
	public static void main(String[] args) {
		bai3 b3 = new bai3();
		int a, b;
		System.out.println("nhap a: ");
		a = b3.nhap();
		System.out.println("nhap b: ");
		b = b3.nhap();
		b3.inSo(a, b);
	}

}
