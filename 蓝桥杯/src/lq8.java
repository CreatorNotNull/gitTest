import java.util.Scanner;

/**
 * ��дһ����������3��������Ȼ����򽫶��������������մӴ�С�������С�
���������ʽ������ֻ��һ�У��������������м��ÿո������
���������ʽ�����ֻ��һ�У��������Ľ����
���������������
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
