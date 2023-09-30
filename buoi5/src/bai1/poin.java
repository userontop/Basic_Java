package bai1;
import java.util.Scanner;

public class poin {
	private String tenDiem;
	private  double hoangDo;
	private double tungDo;
	
	public String getTenDiem() {
		return tenDiem;
	}

	public void setTenDiem(String tenDiem) {
		this.tenDiem = tenDiem;
	}

	public double getHoangDo() {
		return hoangDo;
	}

	public void setHoangDo(double hoangDo) {
		this.hoangDo = hoangDo;
	}

	public double getTungDo() {
		return tungDo;
	}

	public void setTungDo(double tungDo) {
		this.tungDo = tungDo;
	}
	
	public poin(String ten,double h ,double t){
		this.tenDiem = ten;
		this.hoangDo = h;
		this.tungDo = t;
	}

	public poin() {
		this.tenDiem = "A";
		this.hoangDo = 0.0;
		this.tungDo = 0.0;
	}

	public void in(){
		System.out.print("\npoin: "+ getTenDiem() + " at ("+ getHoangDo()+ ", "+ getTungDo() + ")");
	}
	public double khoangCach(double x1, double y1, double x2, double y2){
		return (double) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2)* (y1 - y2));
	}
	public void nhap(){
		String ten;
		double h;
		double t;
		Scanner s1 = new Scanner(System.in);
		System.out.print("\nname Poin: ");
		ten = s1.nextLine();
		System.out.print("hoang do: ");
		h = s1.nextInt();
		System.out.print("tung do: ");
		t = s1.nextInt();
		this.tenDiem = ten;
		this.hoangDo = h;
		this.tungDo = t;
		}
	public static void main(String[] args) {
		poin p1 = new poin("A", 8, 10);
		p1.in();
		p1.nhap();
		p1.in();
		poin p2 = new poin();
		p2.nhap();
		poin p3 = new poin();
		p3.nhap();
		System.out.print("khoang cach 2 diem =  "+p2.khoangCach(p2.hoangDo, p3.hoangDo, p2.tungDo, p3.tungDo));
	}

}
