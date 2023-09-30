package buoi4;
import java.util.Scanner;
import java.lang.Math;
public class bai2 {
		public int nhap(){
			int a;
			do{
				Scanner so1 = new Scanner(System.in);
				a = so1.nextInt();
			}while(a <= 0);
			return a;
		}
		public void nhapMang(int[] a){
			bai1 b1 = new bai1();
			for(int i = 0; i < a.length ; i++){
				System.out.println("a"+ i +": ");
				a[i] = b1.nhap();
			}
		}
		public void xuatMang(int[] a){
			for(int i = 0; i < a.length; i++){
				System.out.print(" " + a[i] + " ");
			}
		}
		public void sapXepTang(int[] a){
			int tmp;
			for(int i = 0; i < a.length;i++){
				for(int j = i + 1; j < a.length; j++){
					if(a[i] > a[j]){
						tmp = a[i];
						a[i] = a[j];
						a[j] = tmp;
					}
				}
			}
		}
		public void sapXepGiam(int[] a){
			int tmp;
			for(int i = 0; i < a.length;i++){
				for(int j = i + 1; j < a.length; j++){
					if(a[i] < a[j]){
						tmp = a[i];
						a[i] = a[j];
						a[j] = tmp;
					}
				}
			}
		}
		public int demLe(int[] a){
			int count = 0;
			for(int i = 0; i < a.length; i++){
				if(a[i] % 2 != 0)
					count++;
			}
			return count;
		}
		
		public int demChan(int[] a){
			int count = 0;
			for(int i = 0; i < a.length; i++){
				if(a[i] % 2 == 0)
					count++;
			}
			return count;
		}
		
		public int tongMang(int[] a){
			int tong = 0;
			for(int i = 0; i < a.length; i++){
					tong += a[i];
			}
			return tong;
		}
		public boolean sNT(int a){
			if(a == 1)
					return false;
			for(int i = 2; i < Math.sqrt(a); i++){
				if(a % i == 0)
					return false;
			}
			return true;
		}
		public int demSNT(int[] a){
			bai2 b2 = new bai2();
			int count = 0;
			for(int i = 0; i < a.length; i++){
				if(b2.sNT(a[i]) == true)
					count++;
			}
			return count;
		}
		public void inSNT(int[] a){
			for(int i = 0; i < a.length; i++){
				if(sNT(a[i]) == true)
				System.out.print(" " + a[i] + " ");
			}
		}
		public boolean sHH(int a){
			int tmp = 0;
			for(int i = 1; i <= a/2; i++){
				if(a % i == 0){
					tmp += i;
				}
					
			}
			if(tmp == a)
				return true;
			else 
				return false;
		}
		public int demSHH(int[] a){
			int count = 0;
			bai2 b2 = new bai2();
			for(int i = 0; i < a.length; i++){
				if(b2.sHH(a[i]) == true)
					count++;
			}
			return count;
		}
		public void inSHH(int[] a){
			for(int i = 0; i < a.length; i++){
				if(sHH(a[i]) == true)
				System.out.print(" " + a[i] + " ");
			}
		}
		public int timX(int[] a, int x){
			for(int i = 0; i < a.length; i++){
				if(a[i] == x)
					return i;
			}
			return -1;
		}
		public int demX(int[] a, int x){
			int count = 0;
			for(int i = 0; i < a.length; i++){
				if(a[i] == x)
					count++;
			}
			return count;
		}
		public void themXCuoi(int[] a, int x){
			int size = a.length + 1;
			int[] b = new int [size];
			int msize = a.length < b.length ? a.length : b.length;
			System.arraycopy(a, 0, b, 0, msize);

			b[b.length - 1] = x;
			a = b;
		}
		public void themXDau(int[] a, int x){
			int size = a.length + 1;
			int[] b = new int [size];
			int msize = a.length < b.length ? a.length : b.length;
			System.arraycopy(a, 0, b, 1, msize);
			b[0] = x;
			a = b;
		}
		public void themXViTriK(int[] a, int x, int k){
			int size = a.length + 1;
			int[] b = new int [size];
			System.arraycopy(a, 0, b, 0, k+1);
			b[k+1] = x;
			System.arraycopy(a, k+1, b, k+2, a.length - (k+1));
			a = b;
		}
		public int[] xoaCuoiMang(int[] a){
			int size = a.length - 1;
			int[] b = new int [size];
			System.arraycopy(a, 0, b, 0, size);
			a = b;
			return a;
		}
		public int[]	 xoaDauMang(int[] a){
			int size = a.length - 1;
			int[] b = new int [size];
			System.arraycopy(a, 1, b, 0, size);
			a = b;
			return a;
		}
		public int[] xoaXViTriK(int[] a, int k){
			int size = a.length - 1;
			int[] b = new int [size];
			System.arraycopy(a, 0, b, 0, k);
			System.arraycopy(a, k+1, b, k, a.length - (k + 1));
			a = b;
			return a;
		}
		public static void main(String[] args) {
			bai2 b1 = new bai2();
			int n;
			System.out.println("nhap n: ");
			n = b1.nhap();
			int[] a = new int[n];
			b1.nhapMang(a);
			System.out.println("In: ");
			b1.xuatMang(a);
			b1.sapXepTang(a);
			System.out.println("\nsap xep mang tang dan: \n");
			b1.xuatMang(a);
			b1.sapXepGiam(a);
			System.out.println("\nsap xep mang giam dan: \n");
			b1.xuatMang(a);
			System.out.println("\nso luong so le : "+ b1.demLe(a));
			System.out.println("so luong so chan : "+ b1.demChan(a));
			System.out.println("Tong mang = "+ b1.tongMang(a));
			System.out.print("so luong So Nguyen To : "+ b1.demSNT(a)+" \n-> " );
			b1.inSNT(a);
			System.out.print("\nso luong So Hoan Hao : "+ b1.demSHH(a)+" \n-> " );
			b1.inSHH(a);
			int x;
			System.out.print("\nnhap vao so can tim: ");
			x = b1.nhap();
			System.out.println("vi tri x: "+ b1.timX(a, x));
			System.out.println("so luong x co trong mang: "+ b1.demX(a, x));
			b1.themXCuoi(a, x);
			b1.xuatMang(a);
			b1.themXDau(a, x);
			b1.xuatMang(a);
			int k;
			System.out.print("\nnhap vao k: ");
			k = b1.nhap();
			int[] b = new int[n];
			System.out.println("\nxoa cuoi mang");
			b = b1.xoaCuoiMang(a);
			b1.xuatMang(a);System.out.println("\nxoa dau mang");
			b = b1.xoaDauMang(a);
			b1.xuatMang(a);
			System.out.println("\nxoa vi tri k");
			b = b1.xoaXViTriK(a, k);
			b1.xuatMang(a);
		}

}

