package sevent;
/*输入一个数字1-9，形成数组，进行全排列*/
import java.util.Arrays;
import java.util.Scanner;

public class LQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = i+1;
		}
		//System.out.println(Arrays.toString(a));
		f(a,0);
	}
	public static void f(int[] a,int n){
		if(n == a.length){
			System.out.println(Arrays.toString(a));
		}else{
			for(int i = n;i<a.length;i++){
				int temp=a[i];
				a[i]=a[n];
				a[n]=temp;
				f(a,n+1);
				temp=a[i];
				a[i]=a[n];
				a[n]=temp;
			}
		}
	}
}
