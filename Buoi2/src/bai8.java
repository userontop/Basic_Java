import java.util.Scanner;
import java.lang.Math;
public class bai8 {
	public static int nhap() {
		int a;
		System.out.println("nhap vao so: ");
		Scanner a1 = new Scanner(System.in);
		a = a1.nextInt();
		return a;
	}
	public static void lKSoNT(int n) {
		int count1 = 0;
		for(int i = 2; i < n; i++) {
			int count = 0;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j ==0)
					count++;
			}
			if(count == 0) {
				System.out.print(" "+ i);
				count1++;
			}
		}
		System.out.print("\nso luong so nguyen to = "+ count1);
	}
	public static void main(String[] args) {
		int n;
		bai8 a = new bai8();
		n = nhap();
		a.lKSoNT(n);
	}

}
