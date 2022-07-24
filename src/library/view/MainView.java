package library.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class MainView {

	private JFrame frame;

	public JPanel headPanel;
	public JSplitPane footPanel;

	public JScrollPane left;
	public JScrollPane right;
	public JScrollPane center;
	public JScrollPane down;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView window = new MainView();
					window.frame.setVisible(true);
					window.frame.pack();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, Variables.pcWidth, Variables.pcHeight);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		headPanel = new JPanel();
		headPanel.setBackground(Color.MAGENTA);
		headPanel.setPreferredSize(new Dimension(Variables.pcWidth, Variables.pcMenuHeight));
		headPanel.setBackground(Variables.light);
		frame.getContentPane().add(headPanel, BorderLayout.NORTH);

		left = new JScrollPane();
		left.setPreferredSize(new Dimension(Variables.widthOne, Variables.heightOne));
		left.setMinimumSize(Variables.lefMinSize);
		left.setMaximumSize(Variables.lefMaxSize);
		left.setLayout(null);
		left.setBackground(Variables.ciel);

		center = new JScrollPane();
		center.setPreferredSize(new Dimension(Variables.widthTwo, Variables.heightTwo));
		center.setMinimumSize(Variables.cenMinSize);
		center.setMaximumSize(Variables.cenMaxSize);
		center.setLayout(null);
		center.setBackground(Variables.lightGrey);

		right = new JScrollPane();
		right.setPreferredSize(new Dimension(Variables.widthThree, Variables.heightTwo));
		right.setMinimumSize(Variables.rigMinSize);
		right.setMaximumSize(Variables.rigMaxSize);
		right.setLayout(null);
		right.setBackground(Variables.ciel);

		down = new JScrollPane();
		down.setPreferredSize(new Dimension(Variables.width23, Variables.heightThree));
		down.setMinimumSize(Variables.botMinSize);
		down.setMaximumSize(Variables.botMaxSize);
		down.setLayout(null);
		down.setBackground(Variables.light);

		JSplitPane centerR = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, center, right);
		centerR.setPreferredSize(new Dimension(Variables.width23, Variables.heightTwo));
		centerR.setMinimumSize(Variables.cenRMinSize);
		centerR.setBorder(null);
		centerR.setResizeWeight(0.5);
		centerR.setDividerSize(3);
		centerR.resetToPreferredSizes();

		JSplitPane centerRB = new JSplitPane(JSplitPane.VERTICAL_SPLIT, centerR, down);
		centerRB.setPreferredSize(new Dimension(Variables.width23, Variables.heightOne));
		centerRB.setMinimumSize(Variables.cenRBMinSize);
		centerRB.setMaximumSize(Variables.cenRBMaxSize);
		centerRB.setBorder(null);
		centerR.setResizeWeight(0.5);
		centerRB.setDividerSize(0);
		centerRB.resetToPreferredSizes();

		JSplitPane footPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, left, centerRB);
		footPanel.setResizeWeight(0.5);
		footPanel.setBorder(null);
		footPanel.setDividerSize(3);
		footPanel.resetToPreferredSizes();
		frame.getContentPane().add(footPanel, BorderLayout.CENTER);
	}
}
