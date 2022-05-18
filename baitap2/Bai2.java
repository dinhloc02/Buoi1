package baitap2;

import java.util.Scanner;

public class Bai2 {
	
		 public static void sapXep(int a[] ) {
		        int giu = a[0];
		        for (int i = 0 ; i < a.length - 1; i++) {
		            for (int j = i + 1; j < a.length; j++) {
		                if (a[i] > a[j]) {
		                    giu = a[j];
		                    a[j] = a[i];
		                    a[i] = giu;
		                }
		            }
		        }
	}
	static void hienMang(int a[]) {
		 int n= a.length;
		    for (int i=0; i < n; i++){
		        System.out.print(a[i]+" "); 
		       
		      }
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số phần tử:");
		int n = scan.nextInt();
		int x[] = new int[n];
		for(int i=0; i<n;++i) {
			x[i] = scan.nextInt();
		}
		sapXep(x);
		hienMang(x);
		
	}

}
