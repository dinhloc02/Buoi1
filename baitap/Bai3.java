package baitap;

import java.util.Scanner;

public class Bai3 {
	   public static void main(String[] args) {
		 
		        int a, b,n=0;
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Nhập số thứ nhất:");
		        a = scanner.nextInt();
		        System.out.print("Nhập số thứ hai:");
		        b = scanner.nextInt();
		        
		        for(int i = 1; i <= a && i <= b; i++)
		        {
		            if(a%i==0 && b%i==0)
		             n= i;
		        }
		     int   m=a*b/n;
		        System.out.println("Ước chung lớn nhất là: "+ n);
		        System.out.println("Bội chung nhỏ nhất là:"+m);
		        
		   }
	   }
