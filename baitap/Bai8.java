package baitap;

public class Bai8 {
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
	public static void main(String[] args) {
		
		
		
		for(int i = 100001;i<=999999;++i)
	
			 if(kiemTra(i))
				 System.out.print(i+"  ");
		for(int i = 100001;i<=999999;++i)
		
			if(kiemTra(i) && kiemTraTong(i))
			
				System.out.println(i);
		
        
		}
	}


