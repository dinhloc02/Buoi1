package baitap2;

import java.util.Scanner;

public class Bai3 {
	
	    	 
        	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số phần tử:");
		int n = scan.nextInt();
		int x[] = new int[n];
		int z[] = new int[n];
		for(int i=0; i<n;++i) {
			x[i] = scan.nextInt();
		}
			int m=0;
			z[m++]=x[0]; 
			
			for(int i=1;i<n;i++) {
			 boolean kiemTra=true;
				for(int j =i-1;j>=0;j--)
				{  
					if(x[i]==x[j])
					{
					kiemTra=false;
					break;
					}
				}
				if(kiemTra==true)
					z[m++]=x[i];
				
			}
			int max=0,giu=0;
			 for(int i = 0; i<m;++i) {
	    		 int dem=0;
	    	 for(int j=0;j<n;++j)
	    	 {
	           if(z[i]==x[j]) {
	        	   dem++;
	        	   
	           }
	    	 }
	    	 System.out.println(z[i]+"xuất hiện"+dem+"lần");
	    	 if(max < dem) {
	    		 max = dem;
	    		 giu = x[i];
	    				 }
		
		
			 }
			 System.out.println("Phần tử" + giu+ " xuất hiện nhiều nhất "  );
			 }

}
