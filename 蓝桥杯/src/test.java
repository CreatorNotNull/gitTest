import java.util.Timer;
import java.util.TimerTask;
public class test{
	public static void main(String[] args){
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			public void run(){
				System.out.println("�������ڶ�ʱ��");
			}
		}, 2000,2000);
		try{
			Thread.sleep(8000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		timer.cancel();
	}
}