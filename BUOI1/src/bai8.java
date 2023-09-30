import java.util.Scanner;

public class bai8 {
	public static void main(String[] args) {
		int n;
		Scanner so1 = new Scanner(System.in);
		n = so1.nextInt();
		int i;
		int j;
		System.out.println("tong cac so le < n: ");
		for(i = 1; i < n; i++) {
			int tongle = i;
			if(i % 2 != 0 || i == 1) {
				tongle += (i+2);
				if(tongle < n)
				System.out.println("tong = "+ tongle);
			}
		}
		System.out.println("tong cac so chan < n: ");
			for(j = 1; j < n; j++){
				int tongchan = j;
				if(j % 2 == 0) {
					tongchan += j+2;
					if(tongchan < n)
					System.out.println("tong = "+ tongchan);
				}
			}
		}
	}
