package baitap2;

import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số phần tử:");
		int n = scan.nextInt();
		int x[][] = new int[n][n];
		for(int i=0; i<n;++i)
			for(int j=0; j<n;++j)
		
			x[i][j] = scan.nextInt();
		int cheoChinh=0;
		int cheoPhu=0;
		for(int i=0; i<n;++i)
			for(int j=0; j<n;++j)
			{
				if(i==j)
					cheoChinh+=x[i][j];
				if(i+j==n-1)
					cheoPhu+=x[i][j];
			}
		System.out.println("Tổng chéo chính:"+cheoChinh);
		System.out.println("Tổng chéo phụ:"+cheoPhu);
	}

}
 