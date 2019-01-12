import java.util.Scanner;

/**
 * 编写一个程序，输入3个整数，然后程序将对这三个整数按照从大到小进行排列。
　　输入格式：输入只有一行，即三个整数，中间用空格隔开。
　　输出格式：输出只有一行，即排序后的结果。
　　输入输出样例
 *
 */
public class lq8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++)
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					arr[i] = arr[i] ^ arr[j];
					arr[j] = arr[i] ^ arr[j];
					arr[i] = arr[i] ^ arr[j];
				}
			}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
