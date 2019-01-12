import java.util.Scanner;

/*第九届蓝桥杯Java B组第七题螺旋折线*/
public class LQ9 {

	static int sum = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		LQ9 lq9 = new LQ9();
		lq9.dis(0, 0, x, y);
		System.out.println(sum);
		if (scanner != null) {
			scanner.close();
		}
	}

	private void dis(int xo, int yo, int x, int y) {
		int a = 2 * xo + 1;
		for (int i = 0; i < a; i++) {
			if (xo == x && yo == y) {
				return;
			}
			sum++;
			xo--;
		}
		int b = -2 * yo + 1;
		for (int i = 0; i < b; i++) {
			if (xo == x && yo == y) {
				return;
			}
			sum++;
			yo++;
		}
		int c = -2 * xo;
		for (int i = 0; i < c; i++) {
			if (xo == x && yo == y) {
				return;
			}
			sum++;
			xo++;
		}
		int d = 2 * yo;
		for (int i = 0; i < d; i++) {
			if (xo == x && yo == y) {
				return;
			}
			sum++;
			yo--;
		}
		dis(xo, yo, x, y);
	}
}
