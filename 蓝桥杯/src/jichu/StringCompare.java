package jichu;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine(),
				b = sc.nextLine();
		/*while(true) ��һ������ѭ������Ϊ���ʽ��ֵ
		һֱΪ�档Ϊ������ѭ����ѭ�����ڲ�Ҫ��break�����������*/
			if(a.length()!=b.length()){
				System.out.println("1");return;
			}else if(a.equals(b)){
				System.out.println("2");return;
			}else if(a.equalsIgnoreCase(b)){
				System.out.println("3");return;
			}else if(a.length()==b.length()){
				System.out.println("4");return;
			}
	}
}
