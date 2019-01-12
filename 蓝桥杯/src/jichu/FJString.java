package jichu;

import java.util.Scanner;

public class FJString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(run(n));
	}
	private static String run(int n){
		if(n==1){
			return "A";
		}else{
			return run(n-1)+(char)('A'+n-1)+run(n-1);
		}
	}

}
