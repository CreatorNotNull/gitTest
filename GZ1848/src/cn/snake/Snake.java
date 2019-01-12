package cn.snake;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

public class Snake extends Observable implements Serializable{// 被观察
										// 应用程序中调用Observable的notifyObservers方法使其所有观察员被通知通过调用他们的update方法的变化

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x = 50;
	private int y = 50;
	private Dir dir;
	private ArrayList<Snode> snodeBox = new ArrayList<Snode>();
	private boolean run;

	public Snake() {
		this.dir = Dir.RIGHT;
		this.run = true;
		snodeBox.add(new Snode());
	}

	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}

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

	public Dir getDir() {
		return dir;
	}

	public void setDir(Dir dir) {
		this.dir = dir;
	}

	public ArrayList<Snode> getSnodeBox() {
		return snodeBox;
	}

	public void setSnodeBox(ArrayList<Snode> snodeBox) {
		this.snodeBox = snodeBox;
	}

	public void move(Dir dir) {
		switch (dir) {
		case UP:
			y -= 10;
			break;
		case DOWN:
			y += 10;
			break;
		case LEFT:
			x -= 10;
			break;
		case RIGHT:
			x += 10;
			break;
		}
		// 设置前一个节点获取上上个节点的位置
		for (int j = snodeBox.size() - 1; j > 0; j--) {
			snodeBox.get(j).setX(snodeBox.get(j - 1).getX());
			snodeBox.get(j).setY(snodeBox.get(j - 1).getY());
		}
		// 给头设置一个新的位置
		snodeBox.get(0).setX(this.x);
		snodeBox.get(0).setY(this.y);
	}

	public void eat(cn.snake.Box box) {
		Snode snode = new Snode();
		snodeBox.add(snode);
		setChanged();// 标志着这 Observable对象为已更改； hasChanged方法将返回 true
		addObserver(box);// 添加一个观察者为这个对象的一组观察者，只要它是不一样的一些观察者已经在集合。
		notifyObservers(box);// 如果这个对象已经发生了变化，由 hasChanged方法表明，然后通知所有的观察者，然后调用
								// clearChanged方法表明该对象已不再改变
	}
}
