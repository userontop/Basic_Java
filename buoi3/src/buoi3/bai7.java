package buoi3;
import java.util.Scanner;

public class bai7 {
	public int nhap() {
		int a;
		Scanner so1 = new Scanner(System.in);
		a = so1.nextInt();
		return a;
	}
	public long gT(int a) {
		long tich = a;
		for(int i = 1; i < a; i++) {
			tich *= (long)i;
		}
		return tich;
	}
	
	public long tongGT(int n) {
		bai7 b7 = new bai7();
		long tong = 0;
		for(int i = 1; i <= n; i++) {
			tong += (long)b7.gT(i);
		}
		return tong;
	}
	public static void main(String[] args) {
		bai7 b = new bai7();
		int n;
		System.out.println("nhap n: ");
		n = b.nhap();
		long t = b.tongGT(n);
		System.out.println("tong giai thu cua "+ n +" = "+ t);
	}
}
