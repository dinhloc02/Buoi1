package baitap2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
	static void insertarray(int[]n, int [] m, int a, int [] b) {
		int size = n.length + m.length;
		for(int i = 0; i < a; i++) {
			b[i] = n[i];
		}
		for(int i = a; i < m.length + a; i++) {
			b[i] = m[i - a];
		} 
		int t = a;
		for(int i = m.length + a; i < size; i++) {
			b[i] = n[t];
			t++;
		}
		System.out.println(Arrays.toString(b));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số phần tử:");
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x[] = new int[n];
		int z[] = new int[m];
		int y[] = new int[m+n];
		for(int i=0; i<n;++i) {
			x[i] = scan.nextInt();
		}
		for(int i=0; i<m;++i) {
			z[i] = scan.nextInt();
			
		}
		System.out.println("nhập vị trí cần chèn:");
		int p = scan.nextInt();
		insertarray(x, z, p, y);
}
}
