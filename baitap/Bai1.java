package baitap;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		int n, tLe= 0,tChan=0;
		float tThuong=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        n= sc.nextInt();
        
        for(int i = 1; i <= n; ++i)
        {
        	if(n%2==1)
           if(i%2==1)
            tLe += i;
        	if(n%2==0)
            if(i%2==0)
          tChan+=i;     
            tThuong+= (float)1/i;
        }
        if(tChan!=0)
        System.out.println("Tổng các phép tính là: "+tChan+",  "+tThuong);
        if(tLe!=0)
        	 System.out.println("Tổng các phép tính là: "+tLe+",  "+tThuong);
        	
      

	
	}
}
