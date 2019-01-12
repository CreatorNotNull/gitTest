package cn.snake;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Box implements Observer{//观察者可以是任何对象实现的接口Observer
	private int x;
	private int y;
	private boolean live;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public Box() {
		this.live = true;
		Random random = new Random();
		this.x = random.nextInt(80)*10;
		this.y = random.nextInt(60)*10;
	}	
	
	
 	public void update(Observable o, Object arg){
 		if (live == false) {
			Random random = new Random();
			this.x = random.nextInt(80)*10;//this指观察者传递过来的对象
			this.y = random.nextInt(60)*10;
			this.setLive(true);
		}
	}
 	private static Box box = new Box();
 	public static Box takeBox() {
		if (box == null) {
			synchronized (Object.class) {
				if (box == null) {
					box = new Box();
				}
			}
		}
		return box;
	}
	/*static{
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						synchronized (Object.class) {
							if (!box.isEmpty()) {
								Object.class.wait();
							}
							box.push(new Box());
							Object.class.notify();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						synchronized (Object.class) {
							if (box.isEmpty()) {
								Object.class.wait();
							}
							Object.class.notify();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}*/
	@Override
	public String toString() {
		return  String.valueOf(Integer.toHexString(hashCode())).toUpperCase();
	}
}
