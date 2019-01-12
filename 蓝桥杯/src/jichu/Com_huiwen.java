package jichu;

import java.util.Scanner;

public class Com_huiwen {
	static boolean is_huiwen(int a) {
		String s = String.valueOf(a);
		char[] c = s.toCharArray();
		for (int i = 0, j = c.length - 1; i < c.length; i++, j--) {
			if (i == j || j < i)
				break;
			if (c[i] != c[j])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Com_huiwen a = new Com_huiwen();
		for (int i = 1000; i < 10000; i++) {
			if (is_huiwen(i))
				System.out.println(i);
		}
	}
}
