package baitap;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		 int a,b=0;
		 
	       
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số cần phân tích:");
	        a = scanner.nextInt();
	        int c[] = new int[a];
            for(int i=2;i<=a;++i)
            { 
            		 
            	        while(a%i==0){ 	 
            	            a=a/i;
            	            c[b]=i;
            	            b++;	           
     } 	               	
	}
            for(int i=0;i<b;++i)
            	System.out.println(c[i]);
	}
}
