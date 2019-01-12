package jichu;

import java.util.Scanner;

public class HuiXingQuShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int tot = 0, x = -1, y = 0;
		while (tot < m * n) {
			while (x + 1 < m && arr[x + 1][y] != -1) {
				System.out.print(arr[++x][y] + " ");
				arr[x][y] = -1;
				++tot;
			}
			while (y + 1 < n && arr[x][y + 1] != -1) {
				System.out.print(arr[x][++y] + " ");
				arr[x][y] = -1;
				++tot;
			}
			while (x > 0 && arr[x - 1][y] != -1) {
				System.out.print(arr[--x][y] + " ");
				arr[x][y] = -1;
				++tot;
			}
			while (y > 0 && arr[x][y - 1] != -1) {
				System.out.print(arr[x][--y] + " ");
				arr[x][y] = -1;
				++tot;
			}
		}

	}

}
