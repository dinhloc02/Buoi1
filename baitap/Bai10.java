package baitap;

public class Bai10 {
	 static boolean kiemTra(int n) {
     	for(int i=2;i<n/2;++i){
     		if(n%i==0) return false;
     	}
     	return true;
     }
       static boolean kiemTraCacSo(int n) {
     	  int a;
     	  while(n>0) {
     		  a=n%10;
     		  n/=10;
     		 if( a!=3&& a!=5&& a!=7)  return false;
     	  }
     	  return true;
       
       }
       static boolean kiemTraDao(int n)
       {
    	   int a=0,b;
    	   while(n>0);
    	   {
    		   a=a*10+n%10;
    		   n/=10;
    	   }
    	   for(int i=2;i<a/2;++i){
        		if(a%i==0) return false;
        	}
        	return true;
       }
     
	public static void main (String[] args)
 {
		
for(int i = 1000001;i<=9999997;++i)
			
			if(kiemTra(i) && kiemTraCacSo(i) && kiemTraDao(i))
			
				System.out.println(i);					
	
 
   }

}
