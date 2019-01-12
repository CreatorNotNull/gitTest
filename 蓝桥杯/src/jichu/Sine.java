package jichu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sine {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = S(n);
		System.out.println(str);
	}
	public static String A(int i){
		String str="";
		for(int t=1;t<=i;t++){
			if(t%2!=0)
				str+="+"+"sin("+t; //这样会使弟一项也会有一个“+”所以后续得去掉
			else str+="-"+"sin("+t;
		}
		for(int t=1;t<=i;t++)
			str+=")";
		str=str.substring(1,str.length());//因为多产生了一个“+”号
		return str;
	}
	public static String S(int t){
		String str="";
		for(int i=1;i<t;i++)
			str+="(";
		for(int i=1,j=t;i<=t;i++,j--)
			str+=A(i)+"+"+j+")";
		str=str.substring(0, str.length()-1);
		
		return str;
		
	}
}
