package bai1;

public class listThiSinh {
	thiSinh ts[] = new thiSinh[100];
	private int demThiSinh = 0;
	public listThiSinh() {
		demThiSinh = 0;
		for(int i = 0; i< 100; i++) {
			ts[i] = new thiSinh();
		}
	}
	public void themThiSinh(int loai) {
		if(demThiSinh > 100)
			System.out.print("Full Disk! not make new.");
		else {
			if(loai == 1) {
				ts[demThiSinh] = new chuyenLy();
				chuyenLy cl = new chuyenLy();
				cl.nhap();
				ts[demThiSinh] = cl;
			}
			if(loai == 2) {
				ts[demThiSinh] = new chuyenHoa();
				chuyenHoa ch = new chuyenHoa();
				ch.nhap();
				ts[demThiSinh] = ch;
			}
			demThiSinh++;
		}
	}
	public void hienThiDS() {
		for(int i = 0; i < demThiSinh; i++) {
			System.out.print("\n---So TT: "+ (i + 1)+ "-> ");
			System.out.print(ts[i].toString());
		}
	}
	public void tongDiemCao() {
		float max = ts[0].tongDiem();
		int dem = 0;
		for(int i = 1; i < demThiSinh; i++) {
			if(max < ts[i].tongDiem()) {
				max = ts[i].tongDiem();
				dem = i;
			}
		}	
		System.out.print(ts[dem].toString());
	}
}
