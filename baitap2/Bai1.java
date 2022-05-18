package baitap2;

import java.util.Scanner;

public class Bai1 {
static boolean kiemTra( int x[]) {
			int n =x.length;
			for(int i=0;i<n/2;++i) {
			if(x[i]!=x[n-i-1]) return false;
			}
			return true;
		}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số phần tử:");
		int n = scan.nextInt();
		int x[] = new int[n];
		for(int i=0; i<n;++i) {
			x[i] = scan.nextInt();
		}
		if(kiemTra(x))
			System.out.println("Mảng đối xứng");
		else
			System.out.println("Mảng không đối xứng");
	}

}
