package 获取数据类型长度;

public class Length {

	public static void main(String[] args) {
		// 注意 要使用基本数据类型的包装类
		// 打印byte类型的最小值
		System.out.println(Byte.MIN_VALUE);
		// 打印byte的最大值
		System.out.println(Byte.MAX_VALUE);
		// 打印short最小值：-32768
		System.out.println(Short.MIN_VALUE);
		// 打印short最大值： 32767
		System.out.println(Short.MAX_VALUE);
		// 打印Integer类型的最小值：-2147483648
		System.out.println(Integer.MIN_VALUE);
		// 打印Integer的最大值：2147483647
		System.out.println(Integer.MAX_VALUE);
		// 打印Long类型的最小值：-9223372036854775808
		System.out.println(Long.MIN_VALUE);
		// 打印Long的最大值：9223372036854775807
		System.out.println(Long.MAX_VALUE);// 打印Float类型的最小值:1.4E-45(1.4x10的-45次方)
		System.out.println(Float.MIN_VALUE);
		// 打印Float的最大值:3.4028235x10的38次方
		System.out.println(Float.MAX_VALUE);// 打印Double类型的最小值:4.9E-45(4.9x10的-324次方)
		System.out.println(Double.MIN_VALUE);
		// 打印Double的最大值:1.7976931348623157E308(1.7976931348623157x10的308次方)
		System.out.println(Double.MAX_VALUE);
	}

}
