package jichu;
/*只要其他的芯片对一个芯片的判断结果是1的个数大于0的个数，
 * 就可以判断这个是一个好芯片。因为题目中说了，其中坏的芯片
 * 的判断是随即的要不是1要不是0，所以对一个好的芯片（被检测）
 * 的判断而言，用坏的去判断（检测方）这个好的，显示1和显示0
 * 的概率都是50%，而如果还有一个好的芯片（检测方）也去判断
 * 这个好的芯片（被检测），这个结果一定是1，所以这个显示1的
 * 总数一定会大于显示0的个数。*/
import java.util.Scanner;

public class XinPian {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int j=0;j<n;j++){
			int m = 0;
			for(int i=0;i<n;i++){
				//if(i==j) continue;
				if(arr[i][j]==1) m++;
			}
			if(m>n/2) System.out.print(j+1+" ");
		}
		
	}

}
