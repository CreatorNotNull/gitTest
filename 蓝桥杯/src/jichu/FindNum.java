package jichu;

import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int a = sc.nextInt();
		for(int i=0;i<n;i++){
			if(a == arr[i]){
				System.out.println(i+1);
				break;
			}
			if(i == n-1 && a!=arr[i]){
				System.out.println(-1);
			}
		}
	}

}
