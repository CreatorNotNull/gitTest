package jichu;

import java.util.Scanner;

public class TwoNQueen {
	static int count=0,n;//n为棋盘大小，
	static int map[][];//二维数组表示棋盘

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				map[i][j]=sc.nextInt();
		put(0,2);
		System.out.println(count);
	}
	static void put(int t,int s){//放置皇后的函数
		if(t==n){//判断当前类型皇后数量是否达到要求，即是否到了棋盘的最后一行
			if(s==2) put(0,3);//若白皇后放置成功，则进行黑皇后的放置
			else count++;
			return;
		}
		for(int i=0;i<n;i++){
			if(map[t][i]!=1) continue;
			if(check(t,i,s)){//是否满足题目要求判断，满足赋值
				map[t][i]=s;
			}else continue;
			put(t+1,s);
			map[t][i]=1; //回溯法的关键
		}
		return; //进行相应的回溯
	}
	static boolean check(int t,int i,int s){
		for(int q=t-1;q>=0;q--)//当前位置上方是否进行了相同皇后的放置 这行以下的还没放不检查  
			if(map[q][i]==s) return false;
		 //检查左对角线 这行以下的还没放不检查
		for(int q=t-1,w=i-1;q>=0&&w>=0;q--,w--)
			if(map[q][w]==s) return false;
		//检查右对角线 这行以下的还没放不检查
		for(int q=t-1,w=i+1;q>=0&&w<=n-1;q--,w++)
			if(map[q][w]==s) return false;
		return true;
		
	}
}
