package bai2;

import java.util.*;

	public class ThoiGian {
		private int ngay;
		private int thang;
		private int nam;
	
	public int getNgay() {
		return ngay;	
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}

	public ThoiGian(){
		Calendar c = Calendar.getInstance();
		Date day = new Date();
		c.setTime(day);
		this.setNgay( c.get(Calendar.DAY_OF_MONTH) );
		this.setThang(c.get(Calendar.MONTH));
		this.setNam(c.get(Calendar.YEAR));
	}

	public ThoiGian(int d, int m, int y){
		this.setNgay(d);
		this.setThang(m);
		this.setNam(y);
	}

	public void nhapNgay(){
	int d, m, y;
	int num;
	Scanner n=new Scanner(System.in); 
	
	do{
		System.out.print("Nhập ngày: ");
		d = n.nextInt();
		this.setNgay(d);
		}while((d <1) || (d > 31));
		
		do{
			System.out.print("Nhập tháng: ");
			m = n.nextInt();
			this.setThang(m);
		}while((m <1) || (m > 12));
		
		do{
			System.out.print("Nhập năm: ");
			y = n.nextInt();
		this.setNam(y);
	}while(y < 0);
	}

	public void hienThi(){
		System.out.println("Thời gian: "+this.getNgay()+"/"+this.getThang()+"/"+this.getNam());
	}

	public static void main(String[] args) {
	
		ThoiGian tg1 = new ThoiGian();
		tg1.hienThi();
		
		ThoiGian tg2 = new ThoiGian(30,04,2015);
		tg2.hienThi();
		ThoiGian tg4 = new ThoiGian();
		tg4.nhapNgay();
		tg4.hienThi();
	}
}
