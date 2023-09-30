package buoi3;

import java.util.Scanner;

public class bai5 {

	public int inPut(){
	int num;
	do{
		System.out.print("nhap n > 0: ");
		Scanner n=new Scanner(System.in);
		num = n.nextInt();
	}while(num<0);
	return num;
	}

	public void timThuaSo(int num){
	int so, i;
	so = num;
	i = 2;
	System.out.print(num + " = ");
	do{
		if(so % i == 0){
			so = so / i;
			System.out.print(" "+i);
			i = 1;
		if(so != 1)
			System.out.print(" * ");
		}
		i++;
	}while(so != 1);
	}

	public static void main(String[] args) { 
		int n;
		bai5 b5 = new bai5();
		n = b5.inPut();
		b5.timThuaSo(n);
	}
}