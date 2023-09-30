
public class bai2 {

	public static void main(String[] args) {
		int n = 10;
		for(int i = 0; i <= n; i++) {
			System.out.print("%2d"+ i);
		}
		int a = 1;
		do {
			System.out.println("%d"+ a);
			a *= a + 1;
		}while(a >= n);
		int b = 1;
		while(b > n) {
			System.out.print("%2d" + b);
			b = b + 1;
		}
	}

}
