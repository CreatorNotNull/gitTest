/*���������ϳ����ھٰ�һ�δ����Żݻ��������C�����ϣ�ƾ3��ƿ�ǿ����ٻ�һƿC�����ϣ����ҿ���һֱѭ����ȥ�������������ˡ�
�������һ�£����С�����˷�ƿ�ǣ������زμӻ����ô����������ʼ�����nƿ���ϣ������һ���ܵõ�����ƿ���ϡ�
���룺һ������n����ʾ��ʼ���������������0<n<10000��
�����һ����������ʾʵ�ʵõ���������
���磺
�û����룺100
����Ӧ�������149
�û����룺101
����Ӧ�������151*/
import java.util.Scanner;

public final class LO6 {
	static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		sum += n;
		f(n);
		System.out.println(sum);
	}
	public static int f(int n){
		
		if(n<3){
			return sum;
		}else{
			int a = n%3;
			int b = (n-a)/3;
			sum += b;
			f(a+b);
		}
		return 0;
	}

}
