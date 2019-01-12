package sevent;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = new String();
		data1 = "a";
		String data2 = new String();
		data2 = data1;
		System.out.println(data1 == data2);
		String data3 = "test";
		String data4 = "test";
		System.out.println(data3 == data4);
		String data5 = "A" + "B" + "C" + "D"; // 只创建了一个对象,反编译发现和data6一样
		String data6 = "ABCD"; // 直接从字符串缓存里面取,所以data5==data6结果true
		System.out.println(data5 == data6);
		int a = 10, b = 10;
		b = ++b + a * (a + b);
		System.out.println(b);
	}

}
