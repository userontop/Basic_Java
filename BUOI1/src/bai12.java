import java.util.Scanner;

public class bai12 {

	public static void main(String[] args) {
		int n;
		Scanner so3 = new Scanner(System.in);
		System.out.println("nam: ");
		n = so3.nextInt();
		if(n % 400 == 0|| (n % 4 ==0 && n % 100 !=0)) {
			System.out.print("\nnam "+ n +" la nam nhuan co 366 ngay");
		}
		else 
			System.out.print("\nnam "+ n +" co 365 ngay");
	}

}
