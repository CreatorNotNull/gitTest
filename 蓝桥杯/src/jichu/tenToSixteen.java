package jichu;

import java.util.Scanner;

public class tenToSixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		String str2 = Integer.toHexString(str);
		System.out.println(str2);
	}
}
