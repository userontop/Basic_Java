import java.util.Scanner;
import java.lang.Math;
public class bai9 {
		public static int nhap() {
			int a;
			System.out.println("nhap vao so kw: ");
			Scanner a1 = new Scanner(System.in);
			a = a1.nextInt();
			return a;
		}	
		public int tinhTienDien(int kw) {
			int tien = 0;
			if(kw <= 50)
				tien = kw*550;
			else if(kw <= 100)
				tien = 50*550 + (kw - 50)*850;
			else if(kw <= 200)
				tien = 50*550 + 50*850 +(kw - 50)*1200;
			else
				tien = 50*550 + 50*850 + 100*1200 + (kw - 200)*1500;
			return tien;
		}
	public static void main(String[] args) {
		bai9 b9 = new bai9();
		int kw, tien;
		kw = nhap();
		tien = b9.tinhTienDien(kw);
		System.out.println("so tien phai tra = "+ tien);
	}

}
