package jichu;
/*ֻҪ������оƬ��һ��оƬ���жϽ����1�ĸ�������0�ĸ�����
 * �Ϳ����ж������һ����оƬ����Ϊ��Ŀ��˵�ˣ����л���оƬ
 * ���ж����漴��Ҫ����1Ҫ����0�����Զ�һ���õ�оƬ������⣩
 * ���ж϶��ԣ��û���ȥ�жϣ���ⷽ������õģ���ʾ1����ʾ0
 * �ĸ��ʶ���50%�����������һ���õ�оƬ����ⷽ��Ҳȥ�ж�
 * ����õ�оƬ������⣩��������һ����1�����������ʾ1��
 * ����һ���������ʾ0�ĸ�����*/
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
