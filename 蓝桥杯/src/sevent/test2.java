package sevent;

public class test2 {
	/*
	 * 对比上一篇 排列 发现其实组合算法也比较容易理解 控制参数j只向前走即可
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
		carr = new char[3];// 从tag(target数组)中取 3 个

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
