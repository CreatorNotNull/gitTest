package cn.snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JPanel;

public class Yard extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Snake snake;
	private Box box;

	public Yard(Snake snake) {
		box = Box.takeBox();
		this.snake = snake;
		this.setSize(Variables.WIDTH, Variables.HEIGHT);
		ReentrantLock reentrantLock = new ReentrantLock(true);
		new Thread(new Runnable() {
			@Override 
			public void run() {
				try {
					while (true) {
						Thread.sleep(10);
						while (snake.isRun() == true) {
							reentrantLock.lock();
							Thread.sleep(50);
							repaint();// 如果组件显示的是指定区域，则将指定的区域添加到脏区域列表中。
							reentrantLock.unlock();
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
						Thread.sleep(10);
						while (snake.isRun() == true) {
							reentrantLock.lock();
							Thread.sleep(50);
							snake.move(snake.getDir());
							reentrantLock.unlock();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	public void keyDown(Dir dir) {
		switch (dir) {
		case UP:
			snake.setDir(Dir.UP);
			break;
		case DOWN:
			snake.setDir(Dir.DOWN);
			break;
		case LEFT:
			snake.setDir(Dir.LEFT);
			break;
		case RIGHT:
			snake.setDir(Dir.RIGHT);
			break;
		case STOP:
			snake.setRun((snake.isRun() == true) ? false : true);
			break;
		}
		snake.move(snake.getDir());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// 画网格
		for (int i = 0; i <= Variables.HEIGHT / 10; i++) {
			g.drawLine(0, 10 * i, Variables.WIDTH, 10 * i);
		}
		for (int i = 0; i <= Variables.WIDTH / 10; i++) {
			g.drawLine(10 * i, 0, 10 * i, Variables.HEIGHT);
		}
		for (int i = 0; i < snake.getSnodeBox().size(); i++) {
			g.fillOval(snake.getSnodeBox().get(i).getX(), snake.getSnodeBox().get(i).getY(), 10, 10);
		}
		g.setColor(Color.pink);
		g.fillOval(box.getX(), box.getY(), 10, 10);
		if ((box.getX() == snake.getX() && box.getY() == snake.getY())
				|| (box.getX() == snake.getX() + 1 && box.getY() == snake.getY() + 1)) {
			box.setLive(false);
			snake.eat(box);
		}
	}
}
