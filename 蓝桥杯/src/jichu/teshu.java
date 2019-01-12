package jichu;

public class teshu {
	static boolean teshu(int a){
		int sum=0,t,m=a;
		for(int i=0;i<3;i++){
			t=m%10;
			sum=sum+t*t*t;
			m/=10;
		}
		if(sum==a){
			return true;
		}else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<1000;i++){
			if(teshu(i)) System.out.println(i);
		}
	}
}
