package jichu;

import java.util.Scanner;

public class huiwen {
	static boolean is_huiwen(int a){ //�ж��Ƿ��ǻ�������
		String s = String.valueOf(a);//����ת�����ַ���
		char[] c = s.toCharArray();//�ַ���ת�����ַ�����
		for(int i=0,j=c.length-1;i<c.length;i++,j--){
			if(i==j||j<i) break;
			if(c[i]!=c[j]) return false;
		}
		return true;
	}
	static int sum(int b){
		int sum=0,m=b,t;
		if(b<100000){
			for(int i=0;i<5;i++){
				t=m%10;
				sum+=t;
				m/=10;
			}
		}else{
			for(int i=0;i<6;i++){
				t=m%10;
				sum+=t;
				m/=10;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=10000;i<1000000;i++){
			if(is_huiwen(i)){
				if(sum(i)==n){
					System.out.println(i);
				}
			}
		}
	}
}
