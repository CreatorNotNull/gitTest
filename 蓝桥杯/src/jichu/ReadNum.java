package jichu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		run(n);
	}
	private static void run(int n){
		String num[] = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		String wei[] = {"","shi","bai","qian","wan","shi","bai","qian","yi","shi","bai"};
		String ss=n+"";
		String buffer = new String();
		boolean b = true;
		int i,j;
		for(i=0;i<ss.length();i++){//扫描输入的一串数字
			for(j=0;j<9;j++)
				if(ss.charAt(i)==j+'0') break;
			if((ss.length()+2)%4==0&&i==0&&j==1){//去掉类似零一十这种情况
				buffer += wei[ss.length()-i-1]+" ";
			}else if(i!=ss.length()-1&&j==0){//遇见0时
				if(b){
					buffer += num[j]+" ";
					b=false;
				}
			}else if(i==ss.length()-1&&j==0){
				if(!b)
					buffer = buffer.substring(0, buffer.length()-5);				
			}else{
				buffer += num[j]+" "+wei[ss.length()-i-1]+" ";
				b = true;
			}	
		}
		System.out.println(buffer);	
	}
}
