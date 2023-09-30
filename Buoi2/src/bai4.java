import java.util.Scanner;

public class bai4 {
	public static int nhap() {
		int a;
		do {
			System.out.println("nhap vao so nguyen: ");
			Scanner so1 = new Scanner(System.in);
			a = so1.nextInt();
		}while(a <= 0);
		return a;
	}
	public int tongFor(int a) {
		int tong = 0;
		for(int i = 1; i <= a; i++) {
			tong += i;
		}
		return tong;
	}
	public int tongWhile(int a) {
		int tong = 0;
		int i = 1;
		while(i <= a) {
			tong += i;
			i++;
		}
		return tong;
	}
	public int tongDoWhile(int a) {
		int tong = 0;
		int i = 1;
		do {
			tong += i;
			i++;
		}while(i <= a);
		return tong;
	}
	public static void main(String[] args) {
		bai4 b4 = new bai4();
		int n, tong;
		n = nhap();
		tong = b4.tongFor(n);
		System.out.println("tong for = "+ tong);
		tong = b4.tongWhile(n);
		System.out.println("tong While = "+ tong);
		tong = b4.tongDoWhile(n);
		System.out.println("tong Do While = "+ tong);
		
	}

}
