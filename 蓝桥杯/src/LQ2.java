public class LQ2 {
	public static void main(String[] args){
		int c,b,e,f,c1,b1,e1,f1,b2;
		for(int i=1000;i<=9999;i++){
			for(int j=1000;j<=9999;j++){
				int k=i+j;
				c=(i%100)/10;
				b=j%10;
				e=j/1000;
				f=(j%1000)/100;
				e1=k/10000;
				f1=(k%10000)/1000;
				c1=(k%1000)/100;
				b1=(k%100)/10;
				b2=(i%1000)/100;
				if(b==b2 &&c==c1 && b==b1 && e==e1  && f==f1){
					System.out.println(k+" "+i+" "+j);
					break;
				}
			}
		}
	}
}
