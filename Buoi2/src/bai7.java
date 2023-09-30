import java.util.Scanner;

public class bai7 {
	public static int nhap() {
		int a;
		do {
			Scanner so1 = new Scanner(System.in);
			a = so1.nextInt();
		}while(a <= 0);
		return a;
	}
	public int UCLN(int a, int b) {
	    if (a == 0 || b == 0){
	        return a + b;
	    }
	    while (a != b){
	        if (a > b){
	            a -= b; 
	        }else{
	            b -= a;
	        }
	    }
	    return a; 
	}
	public int BCNN(int a, int b) {
		return (a*b)/UCLN(a,b);
	}
	public static void main(String[] args) {
		bai7 b7 = new bai7();
		int a, b, k;
		System.out.println("nhap so a: ");
		a = nhap();
		System.out.println("nhap so b: ");
		b = nhap();
		k = b7.UCLN(a, b);
		System.out.println("ucln = "+ k);
		System.out.println("bcnn = "+ b7.BCNN(a, b));
	}

}
