package baitap2;

import java.util.Scanner;

public class Bai4 {
	static boolean kiemTra(int n) {
		if(n<2) return false;
     	for(int i=2;i<n/2;++i){
     		if(n%i==0) return false;
     	}
     	return true;
     }

	public static void main(String[] args) {
		int min,k =3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số phần tử:");
		int n = scan.nextInt();
		int x[] = new int[n];
		for(int i=0; i<n;++i) {
			x[i] = scan.nextInt();
		}
		System.out.println("Nhập số cần tìm gần nhất:");
		int m = scan.nextInt();
		min=Math.abs(m-x[0]);
		int l = 0;
		for(int i=0; i<n;++i) 
		{
			if(kiemTra(x[i]))
				if(min>=Math.abs(m-x[i]))
				{
				   min = Math.abs(m-x[i]) ;
				 k=x[i];
				 l=i+1;
				 
				}
			
		}
		System.out.print(k);
		System.out.println("   vị trí"+l);
	}

}
