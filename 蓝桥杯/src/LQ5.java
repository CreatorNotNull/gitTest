public class LQ5 {
	public static void main(String[] args){
		int[] a= new int[49];
		for(int i=0;i<=48;i++){
			a[i]=i+1;
		}
		for(int j=1;j<=46;j++){
			for(int k=(j+2);k<=48;k++){
				int mul1=a[j-1]*a[j];
				int mul2=a[k-1]*a[k];
				//System.out.println(mul1);
				int sum = 0;
				for(int l=0;l<=(j-2);l++){
					sum += a[l];
				}
				sum = sum + mul1;
				for(int m=j+1;m<(k-1);m++){
					sum += a[m];
				}
				sum = sum + mul2;
				for(int n=(k+1);n<=48;n++){
					sum += a[n];
				}
				if(sum == 2015) System.out.println(a[j-1]);
			}
		}
	}
}
