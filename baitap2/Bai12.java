package baitap2;

import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số phần tử:");
		int n = scan.nextInt();
		int x[][] = new int[n][n];
		int z[][] = new int[n][n];
		for(int i=0; i<n;++i)
			for(int j=0; j<n;++j)
			x[i][j] = scan.nextInt();
		
		
		for(int i=0; i<n;++i) {
			for(int j=n-1; j>=0;--j) {
	
			System.out.print(x[i][j]+"   ");
		}
		System.out.println();
	}
	}
	

}
