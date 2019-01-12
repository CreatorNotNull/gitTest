
package sevent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
public class LQ2{   
     public static void main(String[] args) throws IOException {
         // TODO Auto-generated method stub
             BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
             // BufferedReader 从字符输入流中读取文本,缓冲各个字符,从而实现字符、数组和行的高效读取。可以指定缓冲区的大小,或者可使用默认的大小
             BigDecimal  bg = new BigDecimal(bf.readLine());//readLine()方法读取一行
             BigDecimal value = bg.multiply(bg.multiply(new BigDecimal(Math.PI))).setScale(7,BigDecimal.ROUND_HALF_UP);
             //此方法返回一个BigDecimal，其的值为this * multiplicand
             System.out.println(value);
    }
}
