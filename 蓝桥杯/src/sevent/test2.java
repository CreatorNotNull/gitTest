package sevent;

public class test2 {
	/*
	 * �Ա���һƪ ���� ������ʵ����㷨Ҳ�Ƚ�������� ���Ʋ���jֻ��ǰ�߼���
	 * 
	 */

	static char[] tag;
	static char[] carr;
	static boolean[] vis;

	/**
	 * @param args
	 * @author hyman xiong
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "abcde";
		tag = string.toCharArray();// target array
		vis = new boolean[tag.length];// visit ?
		carr = new char[3];// ��tag(target����)��ȡ 3 ��

		zuhe(0, 0);
	}

	static void zuhe(int p, int j) {
		if (p == carr.length) {
			// find
			for (char ch : carr) {
				System.out.print(ch + "");
			}
			System.out.println();
		} else {
			for (; j < tag.length; j++) {
				if (vis[j])
					continue;
				carr[p] = tag[j];
				vis[j] = true;
				zuhe(p + 1, j);
				vis[j] = false;
			}
		}
	}
}
