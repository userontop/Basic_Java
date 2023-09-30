package bai1;

import java.util.Scanner;

public class soNguyen {
	public int nhap() {
		int a;
		Scanner s1 = new Scanner(System.in);
		a = s1.nextInt();
		return a;
	}
	public void nhapMang(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print("[" + (i + 1) +"]: ");
			a[i] = nhap();
		}
	}
	public void xuatMang(int a[]) {
		for(int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);
	}
	public boolean NguyenTo(int a) {
		for(int j = 2; j < a / 2; j++) {
			if(a % j == 0)
				return false;
		}
		return true;
	}
	public int soNguyenTo(int a[]) {
		soNguyen s1 = new soNguyen();
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(s1.NguyenTo(a[i]) == true)
				count++;
		}
		return count;
	}
	public void themCuoiMang(int a[], int x) {
		int size = a.length + 1;
		int[] b = new int[size];
		int msize = a.length < b.length?a.length:b.length;
		System.arraycopy(a, 0, b, 0, msize);
		b[b.length-1] = x;
		a = b;
	}
	public static void main(String[] args) {
		soNguyen so1 = new soNguyen();
		int n;
		System.out.print("n: ");
		n = so1.nhap();
		int[] a = new int[n];
		so1.nhapMang(a);
		System.out.print("\nIn Mang: ");
		so1.xuatMang(a);
		int tam = so1.soNguyenTo(a);
		System.out.print("\nSo luong so nguyen to co trong mang: " + tam);
		int x;
		System.out.print("\nx: ");
		x = so1.nhap();
		so1.themCuoiMang(a, x);
		System.out.print("\nMang sao khi them: ");
		so1.xuatMang(a);
		}

}
