package baitap;

import java.util.Scanner;

public class Bai2 {
	 public static void main(String[] args) {
	 int n, dem = 0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhập vào một số: ");
     n = sc.nextInt();
     for(int i = 1; i <= n; ++i)
     {
       if(n%i==0)
       {
    	   System.out.println(i);
    	   ++dem;
       } 
     }
     System.out.println("số lượng ước là "+dem);
}
}
