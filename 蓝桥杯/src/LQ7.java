/*С�����ٳֵ�X�ĳǣ�����������3�����ơ�
һ���˿��ƣ�ȥ����С���ƣ���52�ţ������ȷ���4���ˣ�ÿ����13�š�
��ʱ��С��������ͻȻð��һ�����⣺
��������ǻ�ɫ��ֻ���ǵ�����Ҳ�������Լ��õ����Ƶ��Ⱥ�˳���Լ��������õ��ĳ�ʼ�������һ���ж������أ�*/
public class LQ7 {
	static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1,0);
		System.out.println(sum);
	}
	public static void f(int i/*��������*/,int j/*��������Ŀ*/){
		if(j > 13) return;
		if(i == 14){
			if(j == 13){
				sum++ ;
				return;
			}
		}else{
			for(int x = 0;x <= 4 ;x++){
				f(i+1,x+j);
			}
		}
	}

}
