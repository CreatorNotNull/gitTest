package jichu;

import java.util.Scanner;

public class RabbitAndTurtle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v1=sc.nextInt(),
			v2=sc.nextInt(),
			t=sc.nextInt(),
			s=sc.nextInt(),
			l=sc.nextInt();
		sc.close();
		run(v1,v2,t,s,l,0,0,0,1);
	}
	private static void run(int v1,int v2,int t,int s,
			int l,int xr,int xt,int left,int time){
		if(left > 0){
			xt += v2;
			left--;
		}else{
			xr += v1;
			xt += v2;
			if(xr-xt>=t) left = s;
		}
		if(xt==l){
			if(xr==xt){
				System.out.println("D");
			}else{
				System.out.println("T");
			}
			System.out.println(time);
			return;
		}else if(xr==l){
			if(xr==xt){
				System.out.println("D");
			}else{
				System.out.println("R");
			}
			System.out.println(time);
			return;
		}
		
		run(v1,v2,t,s,l,xr,xt,left,time+1);
	}
}
