package baitap2;

import java.util.Scanner;

public class Bai7 {
     static void dayDaiNhat(int a[]) {
    	 int dem[] = new int[a.length];
    	 int d=0,c=0,max=0;
    	 for(int i=0;i<a.length;++i)
         for(int j=i+1;j<a.length;++j)
    	 { 
    		 if(a[i]<=a[j])
    		 {
    			 dem[c++]++;
    			
    			 if(max<dem[c]) {
    				 max=dem[c];
    				 d=c-dem[c];
    			 }
    			 
    		 } 
    	 }
    	 System.out.println(max);
    	 System.out.println(d);
     }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số phần tử:");
		int n = scan.nextInt();
		int x[] = new int[n];
		for(int i=0; i<n;++i) {
			x[i] = scan.nextInt();
		}
dayDaiNhat(x);
	}

}
