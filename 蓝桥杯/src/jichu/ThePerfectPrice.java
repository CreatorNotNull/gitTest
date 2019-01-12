package jichu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ThePerfectPrice {
	private static int sum=0;
	private static boolean haveMiddle = false;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();
		br.close();
		if(toCompare(arr,0,n-1)){
			System.out.println(sum);
		}else{
			System.out.println("Impossible");
		}
		
	}
	private static boolean toCompare(char[] arr,int a,int b){
		if(b<=a){
			return true;
		}
		for(int i=b;i>a;i--){
			if(arr[a]==arr[i]){
				toExchange(arr,i,b);
				sum += toExchangeTime(i,b);
				return toCompare(arr,a+1,b-1);
			}
		}
		if(!haveMiddle){//若出现中间字符，需要最后移动才能保证移动次数是最少的，
						//所以以及仅仅统计中间字符移动次数，未改变原数列
			haveMiddle = true;
			sum += toExchangeTime(a,arr.length/2);
			return toCompare(arr,a+1,b);
		}
		return false;
		
	}
	private static void toExchange(char[] arr,int a,int b){
		char temp = arr[a];
		for(int i=a;i<b;i++){
			arr[i]=arr[i+1];
		}
		arr[b]=temp;
	}
	private static int toExchangeTime(int a,int b){
		return b-a;
	}
}
