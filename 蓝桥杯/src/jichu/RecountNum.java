package jichu;

import java.util.Scanner;

public class RecountNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt();
		int c = b-a;
		int[] arr = new int[c+1];
		for(int i=0;i<c+1;i++){
			arr[i] = a;
			a = a+1;
		}
		for(int i=0;i<c+1;i++){
			System.out.print(arr[i]+"=");
			run(arr[i]);
		}
		
	}
	static void run(int a){
		if(isPrime(a)){
			System.out.println(a);
		}else{
			for(int i=2;i<a;i++){
				if(a%i==0){
					System.out.print(i+"*");
					run(a/i);//ตÝน้
					return;
				}
			}
		}
		
	}
	
	static boolean isPrime(int number){
		for(int i=2;i<number;i++){
			if(number%i==0) return false;
		}
		return true;
		
	}

}
