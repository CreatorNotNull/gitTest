package jichu;

import java.util.Scanner;

public class ChangeTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int h=0,m=0,s=0;
		if(t>=3600){
			h=t/3600;
			t=t-h*3600;
		}
		m=t/60;
		t=t-m*60;
		s=t;
		System.out.println(h+":"+m+":"+s);
	}

}
