package jichu;

import java.util.Scanner;

public class yanghui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//创建一个二维数组
		int[][] arr = new int[n][n];
		for(int i=0;i<arr.length;i++){
			//动态为列开辟空间（每一列的空间大小跟行号是相同的）
			arr[i] = new int[i+1];
		}
		//赋值
		for(int i=0;i<arr.length;i++){//行赋值循环
			arr[i][0]=1;
			arr[i][i]=1;
			for(int j=1;j<i;j++){//列赋值循环
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		//打印
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
