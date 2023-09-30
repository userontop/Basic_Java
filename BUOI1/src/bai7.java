import java.util.Scanner;

public class bai7 {
	public static void main(String[] args) {
		int n;
		int a = 10;
		int b = 20;
		Scanner so1 = new Scanner(System.in);
		n = so1.nextInt();
		System.out.print("\na = "+ Math.sqrt(n));
		System.out.print("\na = "+ Math.pow(a, b));
		System.out.print("\na = "+ Math.max(a, b));
		System.out.print("\na = "+ Math.min(a, b));
		System.out.print("\na = "+ Math.abs(-a));
	}
}
