package buoi3;
import java.util.Scanner;
public class bai1 {
	public int inPut(){ 
		int num;
		do{
			Scanner n=new Scanner(System.in); 
			num = n.nextInt(); 
		}while(num<=0);
		return num; 
	}
	public boolean kiemTraSHH(int so)
	{
		int tong = 0;
		for(int i = 1; i <= so/2; i++)
		{
			if(so % i == 0) {
				tong = tong + i;
			}
		}
		if(tong == so)
		return true;
		else
		return false;
	}
	public void timSNT(int n){
		for(int i = 1; i < n; i++){
			if(kiemTraSHH(i) == true){
				System.out.print(" "+i);
			}
		}
	}
	public int demSNT(int n){
		int dem = 0;
		for(int i = 1; i < n; i++){
		if(kiemTraSHH(i) == true){
		dem++;
		}
		}
		return dem;
	}
	public static void main(String[] args) {
		bai1 snt = new bai1();
		int n, dem1 = 0;
		System.out.print("Nhập số n = ");
		n = snt.inPut();
		System.out.print("Các số hoàn hảo < "+n+": ");
		snt.timSNT(n);
		dem1 = snt.demSNT(n);
		System.out.print("\nCó "+dem1+" số hoàn hảo");
	}
}

