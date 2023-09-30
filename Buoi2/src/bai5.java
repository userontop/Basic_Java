import java.util.Scanner;

public class bai5 {

	public static int nhap() {
		int a;
		do {
			System.out.println("nhap vao so nguyen: ");
			Scanner so1 = new Scanner(System.in);
			a = so1.nextInt();
		}while(a <= 0);
		return a;
	}
		public int tinhTong(int n){
				int tong = 0;
				int i = 1;
				int dem = 0;
			while(dem < n){
				if(i % 2 == 0){
					tong = tong + i;
					dem++;
				}
			i++;
			}
			return tong;
			}
			public static void main(String[] args) {
			int n, tong;
			bai5 b5 = new bai5();
			n = nhap();
			tong = b5.tinhTong(n);
			System.out.println("Tong " + n +" số chẵn đầu tiên = " + tong);
			}


	}

