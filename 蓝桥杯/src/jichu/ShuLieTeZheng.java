package jichu;

import java.util.Scanner;

public class ShuLieTeZheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		int max=arr[0],min=arr[0],sum = 0;
		for(int i=0;i<n;i++){
			sum += arr[i];
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}

}
