package buoi3;
import java.util.Scanner;

public class bai9 {
	public int inPut(){ 
		int num;
		Scanner n=new Scanner(System.in); 
		num = n.nextInt(); 
		return num; 
		} 
	public static void main(String[] args){
		int n, so, max, min;
		max = -100;
		min = 100;
		bai8 n1 = new bai8();
		System.out.print("Hãy nhập một số n > 0: ");
		n = n1.inPut();
		for(int i = 0; i< n; i++){
			System.out.print("Nhập số "+(i+1)+" : ");
			so = n1.inPut();
			max = Math.max(so, max);
			min = Math.min(so, min);
			System.out.println("Số lớn nhất = "+max);
			System.out.println("Số nhỏ nhất = "+min);
			System.out.println("=========");
		}
	}
}
