package library.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Panes extends JFrame {

	public static final long serialVersionUID = 1L;

	private JFrame frame;
	private JFrame frame1;
	private JFrame frame2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Panes window = new Panes();
				window.frame.setVisible(true);
				window.frame1.setVisible(true);
				window.frame2.setVisible(true);
			}
		});
	}

	public Panes() {
		frame = new JFrame("Center");
		frame.setBounds(100, 100, 887, 483);

		frame1 = new JFrame("Left");
		frame1.setBounds(100, 100, 273, 724);

		frame2 = new JFrame("Right");
		frame2.setBounds(100, 100, 206, 483);
	}
}
