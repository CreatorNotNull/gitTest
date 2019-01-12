
package sevent;

import java.util.Scanner;

public class LQ1 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int  n = a.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=a.nextInt();
		}
		int temp = 0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
