package jichu;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine(),
				b = sc.nextLine();
		/*while(true) 是一个无限循环，因为表达式的值
		一直为真。为了跳出循环，循环体内部要用break语句来跳出。*/
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
