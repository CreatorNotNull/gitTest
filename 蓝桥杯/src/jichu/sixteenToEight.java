package jichu;

import java.util.Scanner;
import java.util.Stack;

public class sixteenToEight {

	static String convert16To2(char c) {
		int temp = c >= 'A' ? c - 'A' + 10 : c - '0';
		int[] a = new int[4];
		int i = 0;
		for (; i < a.length; i++) {// i=3ʱ��������������ѭ���������4
			a[i] = temp % 2;
			temp /= 2;
		}
		i--;
		StringBuffer sb = new StringBuffer();
		for (; i >= 0; i--) {
			sb.append(a[i]);
		}
		return sb.toString();
	}

	static String convert2To8(String str) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			result += Math.pow(2, str.length() - 1 - i) * (str.charAt(i) - '0');
		}
		return result + "";
	}

	static void convert16To8(String n) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n.length(); i++) {
			sb.append(convert16To2(n.charAt(i)));// ��16���Ƶ�ÿһλת��Ϊ��λ2����
		}
		Stack<String> stack = new Stack<>();// �½���ջ����
		for (int i = sb.length(); i >= 0; i -= 3) {
			int start = i - 3 > 0 ? i - 3 : 0;
			String temp = sb.substring(start, i);// ����������ȡ�ַ����н�������ָ���±�֮����ַ���
			stack.add(convert2To8(temp));// �Ӻ���ǰû��λ2������ת��Ϊһλ8���ƣ��洢�ڶ�ջ��
		}
		while (stack.peek().equals("0")) {// s.peek() ��ʾ���ǲ鿴��ջ�����Ķ��󣬵����Ӷ�ջ���Ƴ���
			stack.pop();
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			strings[i] = sc.next();
		}
		for (String string : strings) {// ��������
			if (string.equals("0")) {
				System.out.println(0);
			} else {
				convert16To8(string);
			}
		}
	}
}
