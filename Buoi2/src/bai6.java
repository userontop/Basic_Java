import java.util.Scanner;

public class bai6 {
	public static int nhap() {
		int a;
		do {
			Scanner so1 = new Scanner(System.in);
			a = so1.nextInt();
		}while(a <= 0);
		return a;
	}
		//tong 2 canh bat ky phai lon hon canh con lai --> tam giac
	public void timTamGiac(float a, float b, float c){
		if ((a + b > c) && (a + c > b) && (b + c > a) && (a>0) && (b > 0) && (c > 0)){
			if ((a == b) || (b == c) || (c == a)) //neu có 1 cap canh = nhau
			{ 
				if (( a == b) && (b == c)) //neu tat ca cac canh = nhau
					System.out.println("Tam giác đều");
				else
				{ //neu co them 1 goc vuong
					if((a * a + b * b == c * c)|| (a * a + c * c == b * b) || ( c* c + b * b == a * a))
						System.out.println("Tam giác vuông cân");
					else
						System.out.println("Tam giác cân");
					}
				}
				else 
				{ //tam giac thuong co 1 goc vuong
				if((a * a + b * b == c * c)|| (a * a + c * c == b * b) || ( c* c + b * b == a * a))
					System.out.println("Tam giác vuông");
				else
					System.out.println("Tam giác thường");
				}
			}
			 else System.out.println("Không phải tam giác");
		}
	public static void main(String[] args) {
			bai6 tg = new bai6();
			float a, b, c;
			System.out.print("Nhập số a = "); 
			a = nhap();
			System.out.print("Nhập số b = "); 
			b = nhap();
			System.out.print("Nhập số c = "); 
			c = nhap();
			tg.timTamGiac(a,b,c);
		}
}
