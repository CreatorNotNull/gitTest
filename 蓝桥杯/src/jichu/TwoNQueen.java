package jichu;

import java.util.Scanner;

public class TwoNQueen {
	static int count=0,n;//nΪ���̴�С��
	static int map[][];//��ά�����ʾ����

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
	static void put(int t,int s){//���ûʺ�ĺ���
		if(t==n){//�жϵ�ǰ���ͻʺ������Ƿ�ﵽҪ�󣬼��Ƿ������̵����һ��
			if(s==2) put(0,3);//���׻ʺ���óɹ�������кڻʺ�ķ���
			else count++;
			return;
		}
		for(int i=0;i<n;i++){
			if(map[t][i]!=1) continue;
			if(check(t,i,s)){//�Ƿ�������ĿҪ���жϣ����㸳ֵ
				map[t][i]=s;
			}else continue;
			put(t+1,s);
			map[t][i]=1; //���ݷ��Ĺؼ�
		}
		return; //������Ӧ�Ļ���
	}
	static boolean check(int t,int i,int s){
		for(int q=t-1;q>=0;q--)//��ǰλ���Ϸ��Ƿ��������ͬ�ʺ�ķ��� �������µĻ�û�Ų����  
			if(map[q][i]==s) return false;
		 //�����Խ��� �������µĻ�û�Ų����
		for(int q=t-1,w=i-1;q>=0&&w>=0;q--,w--)
			if(map[q][w]==s) return false;
		//����ҶԽ��� �������µĻ�û�Ų����
		for(int q=t-1,w=i+1;q>=0&&w<=n-1;q--,w++)
			if(map[q][w]==s) return false;
		return true;
		
	}
}
