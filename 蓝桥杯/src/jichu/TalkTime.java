package jichu;

import java.util.Scanner;

public class TalkTime {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		run(h,m);
	}
	static void run(int h,int m){
		String str[] = {"zero","one","two","three","four","five","six","seven",
				"eight","nine","ten","eleven","twelve","thirteen","fourteen",
				"fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
				"thirty","forty","fifty"};
		String str1;
		if(h<=20)
			str1=str[h]+" ";
		else{
			int a=h%20;
			str1=str[20]+" "+str[a]+" ";
		}
		if(m==0){
				System.out.println(str1+"o'clock");
		}else{
			if(m<=20){
				str1 += str[m];
				System.out.println(str1);
			}else{
				int b=m%10;
				m/=10;
				if(b!=0)
					str1 += str[18+m]+" "+str[b];
				else
					str1 += str[18+m];
				System.out.println(str1);
			}
		}
		
	}
}
