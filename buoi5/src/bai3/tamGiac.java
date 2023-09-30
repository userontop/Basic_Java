package bai3;

import java.util.Scanner;
import java.lang.Math;
public class tamGiac {
	private float a, b, c;

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}
	public tamGiac() {
		this.a = 3;
		this.b = 4;
		this.c = 6;
	}
	public float nhap() {
		float a;
		Scanner so1 = new Scanner(System.in);
		a = so1.nextFloat();
		return a;
	}
	public tamGiac(float a, float b, float c){
		System.out.print("nhap a:");
		a = nhap();
		System.out.print("nhap b:");
		b = nhap();
		System.out.print("nhap c:");
		c = nhap();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void nhap3Canh(float a, float b, float c) {
		do {
			System.out.print("nhap a:");
			a = nhap();
			System.out.print("nhap b:");
			b = nhap();
			System.out.print("nhap c:");
			c = nhap();
		}while(!(a + b > c && a + c > b && b + c > a));
	}
	public void in(float a, float b, float c) {
		System.out.print("tam giac co ba canh ("+ a+", "+ b+", "+c+")");
	}
	public float chuVi(float a, float b, float c) {
		float cv;
		cv = a + b + c;
		return cv;
	}
	public float dienTich(float a, float b, float c) {
		float s;
		float p = chuVi(a, b, c);
		s = (float) Math.sqrt(p * (p - a)*(p - b)*(p - c));
		return s;
	}
}
