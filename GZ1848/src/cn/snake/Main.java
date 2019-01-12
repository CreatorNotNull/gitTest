package cn.snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws Exception {
		JFrame win = new JFrame("Snake");
		win.setSize(Variables.WIDTH, Variables.HEIGHT);
		File file = new File("F:/Test/snake.data");
		//file.createNewFile();
		Object data = null;
		if (file.length() != 0) {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
			data = inputStream.readObject();
			inputStream.close();
		}
		final Snake snake = (data == null)?new Snake():(Snake) data;
		Yard yard = new Yard(snake);
		win.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
					outputStream.writeObject(snake);
					outputStream.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				System.exit(0);
			}
		});
		win.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					System.out.println(e.getKeyCode()+":"+e.getKeyChar());
					yard.keyDown(Dir.UP);
					break;
				case KeyEvent.VK_DOWN:
					System.out.println(e.getKeyCode()+":"+e.getKeyChar());
					yard.keyDown(Dir.DOWN);
					break;
				case KeyEvent.VK_LEFT:
					System.out.println(e.getKeyCode()+":"+e.getKeyChar());
					yard.keyDown(Dir.LEFT);
					break;
				case KeyEvent.VK_RIGHT:
					System.out.println(e.getKeyCode()+":"+e.getKeyChar());
					yard.keyDown(Dir.RIGHT);
					break;
				case KeyEvent.VK_SPACE:
					System.out.println(e.getKeyCode()+":"+e.getKeyChar());
					yard.keyDown(Dir.STOP);
					break;
				}
			}
		});
		win.setLocationRelativeTo(null);
		win.add(yard);
		win.setVisible(true);
	}

}
