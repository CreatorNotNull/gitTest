package jichu;

import java.util.Scanner;

public class yanghui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//����һ����ά����
		int[][] arr = new int[n][n];
		for(int i=0;i<arr.length;i++){
			//��̬Ϊ�п��ٿռ䣨ÿһ�еĿռ��С���к�����ͬ�ģ�
			arr[i] = new int[i+1];
		}
		//��ֵ
		for(int i=0;i<arr.length;i++){//�и�ֵѭ��
			arr[i][0]=1;
			arr[i][i]=1;
			for(int j=1;j<i;j++){//�и�ֵѭ��
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		//��ӡ
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
