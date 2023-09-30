import java.util.Scanner;
import java.lang.Math;
public class bai10 {
	public static float nhap() {
		float a;
		System.out.println("nhap vao: ");
		Scanner a1 = new Scanner(System.in);
		a = a1.nextFloat();
		return a;
	}	
	public float tinhKhoangCach(Float x1, Float y1, Float x2, Float y2) {
		float r = 0;
		r = (float) Math.sqrt(Math.pow(x1, y1)+ Math.pow(x2, y2));
		return r;
	}
	public static void main(String[] args) {
		bai10 b10 = new bai10();
		float x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		System.out.println("nhap toa do 1:");
		System.out.print("x1 ");
		x1 = nhap();
		System.out.print("y2 ");
		y1 = nhap();
		System.out.println("nhap toa do 2:");
		System.out.print("x2 ");
		x2 = nhap();
		System.out.print("y2 ");
		y2 = nhap();
		float r = b10.tinhKhoangCach(x1, y1, x2, y2);
		System.out.print("khoang cach cua 2 diem toa do = "+ r);
	}

}
