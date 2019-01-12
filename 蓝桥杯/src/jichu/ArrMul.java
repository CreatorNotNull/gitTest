package jichu;

import java.util.Scanner;

public class ArrMul {
	static int[][] mi(int[][] a,int[][] b){
		int length = a.length;
		int[][] c = new int[length][length];
		int sum=0;
		for(int i=0;i<length;i++){
			for(int j=0;j<length;j++){
				for(int k=0;k<length;k++){
					sum += a[i][k]*b[k][j];
				}
				c[i][j] = sum;
				sum = 0;
			}
		}
		return c;
	}
	static void out(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+" ");
			}				
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int[][] arr1 = new int[n][n];
		int m = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		arr1=arr;
		if(m==0){
			for(int i=0;i<n;i++){  
	            for(int j=0;j<n;j++){  
	                if(i==j){
	                	arr1[i][j]=1;  
	                }else{
	                	arr1[i][j]=0;
	                }
	            }  
	        }
			out(arr1);
		}else if(m==1){
			out(arr1);
		}else{
			for(int i=1;i<m;i++){
				arr1=mi(arr,arr1);
			}
			out(arr1);
		}
	}
}
