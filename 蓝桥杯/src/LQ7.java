/*小明被劫持到X赌城，被迫与其他3人玩牌。
一副扑克牌（去掉大小王牌，共52张），均匀发给4个人，每个人13张。
这时，小明脑子里突然冒出一个问题：
如果不考虑花色，只考虑点数，也不考虑自己得到的牌的先后顺序，自己手里能拿到的初始牌型组合一共有多少种呢？*/
public class LQ7 {
	static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1,0);
		System.out.println(sum);
	}
	public static void f(int i/*检索牌数*/,int j/*手中牌数目*/){
		if(j > 13) return;
		if(i == 14){
			if(j == 13){
				sum++ ;
				return;
			}
		}else{
			for(int x = 0;x <= 4 ;x++){
				f(i+1,x+j);
			}
		}
	}

}
