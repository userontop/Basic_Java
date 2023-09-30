package buoi3;
import java.util.Scanner;
public class bai8 {

	public int inPut(){ 
		int num;
		do{
			Scanner n=new Scanner(System.in); 
			 num = n.nextInt(); 
		}while(num<0);
			return num; 
		}
	public void doi10to2(int num){
		int nhiphan;
		int[] a = new int[100];
		int vt = -1;
		int i = 0;
		System.out.print(num+" he 10 sang he 2 la ");
		do{
			nhiphan = num % 2;
			a[i]= nhiphan;
			vt = i;
			num = num /2;
			i++;
		}while(num > 0);
		for(int j = vt; j >= 0; j-- ){
			System.out.print(" "+a[j]);
		}
	}
	public void doi2to10(int num){
		int he10, i;
			System.out.print(num+" he 2 sang he 10 ");
			i = 0;
			he10 = 0;
		do{
			he10 += (num % 2)* Math.pow(2,i);
			num = num / 10;
			i++;
		}while(num > 0);
		System.out.print(he10);
	}
	public static void main(String[] args) {
		int n;
		bai8 c1 = new bai8();
		System.out.print("Nhập số hệ 10: ");
		n = c1.inPut();
		c1.doi10to2(n);
		System.out.print("\nNhập số hệ 2: ");
		n = c1.inPut();
		c1.doi2to10(n);
	}


}
