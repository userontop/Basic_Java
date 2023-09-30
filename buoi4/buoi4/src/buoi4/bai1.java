package buoi4;

import java.util.Scanner;

public class bai1 {
	public int nhap(){
		int a;
		do{
			Scanner so1 = new Scanner(System.in);
			a = so1.nextInt();
		}while(a <= 0);
		return a;
	}
	public void nhapMang(int[] a){
		bai1 b1 = new bai1();
		for(int i = 0; i < a.length ; i++){
			System.out.println("a"+ i +": ");
			a[i] = b1.nhap();
		}
	}
	public void xuatMang(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(" " + a[i] + " ");
		}
	}
	public void sapXepTang(int[] a){
		int tmp;
		for(int i = 0; i < a.length;i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[i] > a[j]){
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
	public int iMax(int[] a){
		int maxa = a[0];
		for(int i = 1; i < a.length; i++){
			if(maxa < a[i])
				maxa = a[i];
		}
		return maxa;
	}
	public int iMin(int[] a){
		int mina = a[0];
		for(int i = 1; i < a.length; i++){
			if(mina > a[i])
				mina = a[i];
		}
		return mina;
	}
	public static void main(String[] args) {
		bai1 b1 = new bai1();
		int n;
		System.out.println("nhap n: ");
		n = b1.nhap();
		int[] a = new int[n];
		b1.nhapMang(a);
		System.out.println("In: ");
		b1.xuatMang(a);
		b1.sapXepTang(a);
		System.out.println("\nsap xep mang tang dan: \n");
		b1.xuatMang(a);
		System.out.println("\nmax = "+ b1.iMax(a));
		System.out.print("min = "+ b1.iMin(a));
	}

}
