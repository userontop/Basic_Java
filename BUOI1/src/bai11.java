import java.util.Scanner;

public class bai11 {

	public double pT2(int a, int b, int c) {	
		double denTa = b*b - 4*a*c;
		if(denTa >= 0)
			return 1;
		if(denTa < 0)
			return 0;
		return denTa;					
	}
	public static void main(String[] args) {
		bai11 b11 = new bai11();
		int a, b, c;
		Scanner so1 = new Scanner(System.in);
		System.out.println("nhap a:");
		a = so1.nextInt();
		System.out.println("nhap b:");
		b = so1.nextInt();
		System.out.println("nhap c:");
		c = so1.nextInt();
		System.out.print("\nphuong trinh bac hai co dang: ax^2 + by + c = 0");
		double tam = b11.pT2(a, b, c);
		if(tam == 1)
			System.out.print("\npt co nghiem");
		if(tam == 0)
			System.out.print("\npt vo nghiem");
		}
}
