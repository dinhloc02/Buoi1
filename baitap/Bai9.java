package baitap;

public class Bai9 {
	static boolean kiemTra(int n)
	{
		int giu=n;
	    int a=0;
	    while(n>0)
	    {
	    	a=a*10+n%10;
	    	n/=10;
	    }
	    if(a!=giu) return false;
	    return true;
	}
	static boolean kiemTraTong(int n) {
		int a=0;
		while(n>0) {
			a+=n%10;
			n=n/10;
		
		} if(a%10!=0) return false;
		return true;
	}
	static boolean kiemTraSo(int n)
	{
		int a=0;
		while(n>0) {
			a=n%10;
			n/=10;
			if(a!=0 && a!=8 && a!=6) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		for(int i = 200000;i<=888888888;++i)
			
			if(kiemTra(i) && kiemTraTong(i) && kiemTraSo(i))
			
				System.out.println(i);
		}

	}


