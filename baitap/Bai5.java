package baitap;

import java.util.Scanner;

public class Bai5 {
	 public static void main (String[] args)
	    {
	        int a,b;
	        int c=0;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số cần cộng:");
	        a = scanner.nextInt();
	while(a>0)  
	{  
	b=a%10;  
	c=c+b;  
	a=a/10;  
	} 
	System.out.println(c);
}
}
