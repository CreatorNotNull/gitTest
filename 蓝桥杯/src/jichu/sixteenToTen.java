package jichu;

import java.util.Scanner;
public class sixteenToTen {
	//�Դ�ת��16����ÿһλ���ַ���cΪ�ַ���nΪ�ַ���������λ��
	static Long convert16To10(char c,int n){
		int temp = c>='A' ? c-'A'+10 : c-'0'; 
		Long sum = (long) (temp*Math.pow(16, n));
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length()-1;
		Long sum=0l,sum1 =0l;
		for(int i=0;i<str.length();i++){
			sum = convert16To10(str.charAt(n),i);
			n--;
			sum1+=sum;
		}
		System.out.println(sum1);
	}
}
