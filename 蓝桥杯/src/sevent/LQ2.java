
package sevent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
public class LQ2{   
     public static void main(String[] args) throws IOException {
         // TODO Auto-generated method stub
             BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
             // BufferedReader ���ַ��������ж�ȡ�ı�,��������ַ�,�Ӷ�ʵ���ַ���������еĸ�Ч��ȡ������ָ���������Ĵ�С,���߿�ʹ��Ĭ�ϵĴ�С
             BigDecimal  bg = new BigDecimal(bf.readLine());//readLine()������ȡһ��
             BigDecimal value = bg.multiply(bg.multiply(new BigDecimal(Math.PI))).setScale(7,BigDecimal.ROUND_HALF_UP);
             //�˷�������һ��BigDecimal�����ֵΪthis * multiplicand
             System.out.println(value);
    }
}
