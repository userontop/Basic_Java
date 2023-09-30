import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		Float diem;
		int thang;
		Scanner num = new Scanner(System.in);
		System.out.printf("nhap vao diem TB: ");
		do {
			diem = num.nextFloat();
		}while(diem > 10 || diem < 0);
		if(diem >= 8) {
			System.out.println("loai gioi!");
		}else if(diem >= 6.5)
				System.out.println("loai kha!");
		else if(diem >= 5)
				System.out.println("loai Trung Binh");
		else {
			System.out.println("loai yeu!");
		}
		System.out.println("nhap vao thang de doan mua:");
		do {
			thang = num.nextInt();
		}while(thang < 1 || thang > 12);
		switch(thang){
			case 1: System.out.println("Xuan");break;
			case 2: System.out.println("Xuan");break;
			case 3: System.out.println("Xuan");break;
			case 4: System.out.println("ha");break;
			case 5: System.out.println("Ha");break;
			case 6: System.out.println("Ha");break;
			case 7: System.out.println("Thu");break;
			case 8: System.out.println("Thu");break;
			case 9: System.out.println("Thu");break;
			case 10: System.out.println("Dong");break;
			case 11: System.out.println("dong");break;
			case 12: System.out.println("Dong");break;
			default: System.out.println("so lieu khong hop le");break;
		}
	}
}
