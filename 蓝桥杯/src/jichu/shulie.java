package jichu;

import java.util.Scanner;

public class shulie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[] b = new int[n];
		for(int i = 0;i<n;i++){
			b[i] = a.nextInt();
			/*for(int j=i;j>0;j--){
				if(b[j-1]>b[j]){
					int temp = b[j-1];
					b[j-1] = b[j];
					b[j] = temp;
				}else{
					break;
				}
			}*/
		}
		//用冒泡法对数组元素进行排序
		for(int i=n;i>1;i--){
			for(int j=0;j<i-1;j++){
				if(b[j+1]<b[j]){
					int temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				}
			}
		}
		
		a.close();
		for(int i = 0;i<n;i++){
			System.out.print(b[i]+" ");
		}
	}

}
