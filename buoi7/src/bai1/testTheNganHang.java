package bai1;

public class testTheNganHang {
	public static void main(String[] args){
		soTienTietKiem s1 = new soTienTietKiem("0123456", 1000000, (float)0.6, 3);
		System.out.print("The Ngan Hang: \nmt: "+ s1.getMaThe()+"\nlai suat: "+ s1.getLaiSuat()+"\nso tien: "+s1.getSoTien()+"\nky han:"+ s1.getKyHan()+"\nco so tien lai = "+s1.tinhTienLai());
		theATM t1 = new theATM("015422", 10000000, (float)0.6, 360);
		System.out.print("\n\nThe ATM: \nmt: "+ t1.getMaThe()+"\nlai suat: "+ t1.getLaiSuat()+ " \nso tien: "+t1.getSoTien()+"\nso ngay gui: "+ t1.getSoNgayGui()+"\nso tien lai = "+ t1.tinhTienLai());
	}
}
