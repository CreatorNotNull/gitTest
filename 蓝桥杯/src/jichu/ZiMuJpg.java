package jichu;

import java.util.Scanner;

public class ZiMuJpg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				int a = i-j;
				if(a<0) a=a*-1;
				arr[i][j]='A'+a;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print((char)arr[i][j]);
			}
			System.out.println();
		}
	}

}
