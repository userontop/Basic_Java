package bai1;
import java.util.Scanner;
public class qLThiSinh {
	public static void main(String[] args) {
		listThiSinh lts = new listThiSinh();
		Scanner in = new Scanner(System.in);
		int x;
		do {
			System.out.println("\n\t\t------------------------------------------");
			System.out.println("\t\t0. Thoat chuong trinh.\t\t\t\t");
			System.out.println("\t\t1. Them thi sinh Ly.\t\t\t\t");
			System.out.println("\t\t2. Them thi sinh Hoa.\t\t\t\t");
			System.out.println("\t\t3. Hien thi danh sach thi sinh.\t\t\t\t");
			System.out.println("\t\t4. Thi sinh co diem cao nhat\t\t\t\t");
			System.out.println("\n\t\t------------------------------------------");
			System.out.print("chon: ");
			x = in.nextInt();
			switch(x) {
				case 1:{
					lts.themThiSinh(1);
					break;
				}
				case 2: {
					lts.themThiSinh(2);
					break;
				}
				case 3:{
					lts.hienThiDS();
					break;
				}
				case 4:{
					lts.tongDiemCao();
					break;
				}
			}
		}while(x != 0);
		System.out.println("");
	}
}
