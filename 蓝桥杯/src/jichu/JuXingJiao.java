package jichu;

import java.util.Scanner;

public class JuXingJiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double[] a = new Double[4];
		Double[] b = new Double[4];
		Double[] c = new Double[4];
		for(int i=0;i<4;i++){
			a[i]=sc.nextDouble();
			b[i]=sc.nextDouble();
		}
		//公共部分为左边界较大值到右边界最小值，下边界最大值到上边界最小值。
		c[0]=Math.max(Math.min(a[0], a[1]), Math.min(a[2], a[3]));
		c[1]=Math.min(Math.max(a[0], a[1]), Math.max(a[2], a[3]));
		c[2]=Math.max(Math.min(b[0], b[1]), Math.min(b[2], b[3]));
		c[3]=Math.min(Math.max(b[0], b[1]), Math.max(b[2], b[3]));
		if(c[1]<c[0]||c[3]<c[2]){
			System.out.println("0.00");
		}else{
			System.out.printf("%.2f\n",(c[1]-c[0])*(c[3]-c[2]));
		}
	}

}
