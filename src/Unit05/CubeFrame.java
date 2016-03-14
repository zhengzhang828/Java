package Unit05;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Time;
import java.util.TimerTask;

import javax.management.timer.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CubeFrame extends JFrame {
	private int cubeX = 40, cubeY = 0;
	private Timer timer;

	public CubeFrame() {
		setSize(350, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		CubePanel panel = new CubePanel();
		add(panel);
		// KeyListener()
		KeyListener l = new KeyAdapter() {

			// @Override
			// public void keyTyped(KeyEvent e) {
			// }

			// @Override
			// public void keyReleased(KeyEvent e) {
			// }

			@Override
			public void keyPressed(KeyEvent e) {
				// System.out.println("Press " + e.getKeyCode());
				int key = e.getKeyCode();
				switch (key) {
				case KeyEvent.VK_RIGHT: // The right arrow keyboard
					cubeX += 30;
					break;
				case KeyEvent.VK_LEFT:
					cubeX -= 30;
					break;
				default:
					break;
				}
				repaint();
			}
		};

		panel.addKeyListener(l);
		panel.setFocusable(true); // Panel able to obtain the cursor
		panel.requestFocus(); // Request cursor for the panel

		// Add timetask in the CubeFrame
		timer = new Timer();
		TimerTask dropTask = new TimerTask() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				cubeY += 10;
				repaint();
				// repaint();
			}
		};
		//timer.schedule(dropTask, 1000, 500);
		
	}

	public static void main(String[] args) {
		CubeFrame frame = new CubeFrame();
		frame.setVisible(true);
	}

	private class CubePanel extends JPanel {
		public void paint(Graphics g) {
			// g.setColor(Color.BLACK);
			g.setColor(new Color(0x000000));
			g.fillRect(0, 0, getWidth(), getHeight());

			g.setColor(Color.DARK_GRAY);
			g.fillRoundRect(cubeX + 5, cubeY + 5, 30, 30, 5, 5);
			g.drawRoundRect(cubeX + 5, cubeY + 5, 30, 30, 5, 5);

			g.setColor(Color.YELLOW);
			g.fillRoundRect(cubeX, cubeY, 30, 30, 5, 5);
			g.drawRoundRect(cubeX, cubeY, 30, 30, 5, 5);
		}
	}
}
