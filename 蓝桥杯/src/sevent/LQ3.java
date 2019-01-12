package sevent;

import java.util.Scanner;  
public class LQ3 {  
    public static void main(String[] args){  
    	Scanner a = new Scanner(System.in);
    	long n = a.nextInt();
    	int f1=1,f2=1,f3=0;
    	if(n<3){  
            System.out.print("1");  
            return;} 
    	for(long i=3; i<=n ; i++){
    		if(f1>10007)f1=f1%10007;  //数据过大时会超出int的数据范围
            if(f2>10007)f2=f2%10007;
    		f3 = f1 + f2;
    		f1=f2;
    		f2=f3;
    	}
    	int sum = f3%10007;
    	System.out.println(sum);
    }      
}  