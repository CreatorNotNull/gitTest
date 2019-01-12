package jichu;

import java.util.Scanner;
import java.util.Stack;

public class sixteenToEight {

	static String convert16To2(char c) {
		int temp = c >= 'A' ? c - 'A' + 10 : c - '0';
		int[] a = new int[4];
		int i = 0;
		for (; i < a.length; i++) {// i=3时符合条件，进入循环后运算得4
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
			sb.append(convert16To2(n.charAt(i)));// 把16进制的每一位转化为四位2进制
		}
		Stack<String> stack = new Stack<>();// 新建堆栈对象
		for (int i = sb.length(); i >= 0; i -= 3) {
			int start = i - 3 > 0 ? i - 3 : 0;
			String temp = sb.substring(start, i);// 方法用于提取字符串中介于两个指定下标之间的字符。
			stack.add(convert2To8(temp));// 从后向前没三位2进制数转换为一位8进制，存储在堆栈中
		}
		while (stack.peek().equals("0")) {// s.peek() 表示的是查看堆栈顶部的对象，但不从堆栈中移除它
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
		for (String string : strings) {// 遍历数组
			if (string.equals("0")) {
				System.out.println(0);
			} else {
				convert16To8(string);
			}
		}
	}
}
