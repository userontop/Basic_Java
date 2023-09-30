package buoi3;

import java.util.Scanner;
public class bai2{ 
	public int inPut(){ 
		int ch;
		System.out.print("Nhập số từ 0 đến 9:"); 
		Scanner so1 = new Scanner(System.in);
		ch = so1.nextInt();
		return ch;
	}
	public void inKetQua(int so){
	switch(so){ 
		case 0:{
			System.out.print("Zero"); 
			break; 
		} 
		case 1:{ 
			System.out.print("One"); 
			break; 
		} 
		case 2:{ 
			System.out.print("Two"); 
			break; 
		} 
		case 3:{ 
			System.out.print("Three"); 
			break; 
		} 
		case 4:{ 
			System.out.print("Four"); 
			break; 
		} 
		case 5:{ 
			System.out.print("Five"); 
			break; 
		} 
		case 6:{ 
			System.out.print("Six"); 
			break; 
		} 
		case 7:{ 
			System.out.print("Seven"); 
			break; 
		} 
		case 8:{ 
			System.out.print("Eight"); 
			break;
		} 
		case 9:{ 
			System.out.print("Nine"); 
			break; 
		} 
		default: System.out.print("I don't know!"); 
		} 
	}
	public void inTheoIf(int a) {
		if(a ==0 )
			System.out.print("Zero");
		else if(a == 1){ 
			System.out.print("One"); 
		} 
		else if(a == 2){ 
			System.out.print("Two"); 
		} 
		else if(a == 3){ 
			System.out.print("Three"); 
		} 
		else if(a == 4){ 
			System.out.print("Four"); 
		} 
		else if( a == 5){ 
			System.out.print("Five"); 
		} 
		else if(a == 6){ 
			System.out.print("Six"); 
		} 
		else if(a == 7){ 
			System.out.print("Seven"); 
		} 
		else if(a == 8){ 
			System.out.print("Eight"); 
		} 
		else if(a == 9){ 
			System.out.print("Nine");  
		} 
		else System.out.print("I don't know!"); 
	}

	public static void main(String args[]){ 
	bai2 b2 = new bai2();
	int key;
	key = b2.inPut();
	b2.inKetQua(key);
	System.out.print("  ");
	b2.inTheoIf(key);
	}
}
