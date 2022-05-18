package baitap2;

import java.util.Scanner;

public class Bai6 {
 public static int [] chen(int a[] , int k) {
		        int b = a.length - 1;
		        int c = a.length;
		        int d[]  = new int[c + 1];
		        boolean kiemTra = true;
		         
		        for (int i = c; i >= 0; i--) {
		            if (a[b] > k) {
		                d[i] = a[b--];
		            } else {
		                if (kiemTra) {
		                    d[i] = k;
		                     kiemTra = false;
		                } else 
		                    d[i] = a[b--];
		                
		            }
		        }
		        return d;
		    }
 public static void sapxep(int [] a) {
     int b = a[0];
     for (int i = 0 ; i < a.length - 1; i++) {
         for (int j = i + 1; j < a.length; j++) {
             if (a[i] > a[j]) {
                 b = a[j];
                 a[j] = a[i];
                 a[i] = b;
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
		for(int i=0; i<n;++i) 
			x[i] = scan.nextInt();
		
		sapxep(x);
		x = chen(x, 86);
		hienMang(x);
	}

}
