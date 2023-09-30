package bai1;

public class testThuoc {

	public static void main(String[] args) {
		thuocThuong t1 = new thuocThuong("Asitamon", 10000, 100, true);
		thuocBaoHiem t2 = new thuocBaoHiem("Giam Sot", 5000, 200, 30);
		System.out.print("Thuoc: "+ t1.getTenThuoc()+"\nSoluong: "+ t1.getSl()+"\nDon gia: "+ t1.getDonGia()+"vnd\ntien Thanh toan: "+t1.tienThuoc()+"vnd");
		System.out.print("\n\nThuoc: "+ t2.getTenThuoc()+"\nSoluong: "+ t2.getSl()+"\nDon gia: "+ t2.getDonGia()+"vnd\nGiam: "+t2.getTiLeGiam()+"\ntien Thanh toan: "+t1.tienThuoc()+"vnd");
	}

}
