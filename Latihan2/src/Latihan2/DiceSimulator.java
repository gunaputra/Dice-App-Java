package Latihan2;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DiceSimulator extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -706725089213549363L;
	private JPanel mainPanel = new JPanel();
	private JPanel labelPanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	
	private String[] images = {
		"/Users/ASUS/Documents/New folder/workspace/Latihan2/src/Latihan2/images/dice1.png",
		"/Users/ASUS/Documents/New folder/workspace/Latihan2/src/Latihan2/images/dice2.png",
		"/Users/ASUS/Documents/New folder/workspace/Latihan2/src/Latihan2/images/dice3.png",
		"/Users/ASUS/Documents/New folder/workspace/Latihan2/src/Latihan2/images/dice4.png",
		"/Users/ASUS/Documents/New folder/workspace/Latihan2/src/Latihan2/images/dice5.png",
		"/Users/ASUS/Documents/New folder/workspace/Latihan2/src/Latihan2/images/dice6.png",
	};
	
	private JButton rollBtn = new JButton("Roll");
	private JButton exitBtn = new JButton("Exit");
	
	private JLabel label_1;
	private JLabel label_2;
	
	private int num_1 = 3, num_2 = 4;
	
	public DiceSimulator() {
		super("Dice Simulator");
		buildPanel();
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(400, 300);
		add(mainPanel, BorderLayout.NORTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void buildPanel() {
		// TODO Auto-generated method stub
		mainPanel.setBackground(Color.WHITE);
		
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBorder(new EmptyBorder(50,20,20,50));
		
		label_1 = new JLabel(new ImageIcon(images[num_1]));
		label_2 = new JLabel(new ImageIcon(images[num_2]));
		
		//labelPanel
		labelPanel.setLayout(new GridLayout(1,2));
		labelPanel.setBorder(BorderFactory.createRaisedBevelBorder());
		labelPanel.setBackground(Color.WHITE);
		
		labelPanel.add(label_1);
		labelPanel.add(label_2);
		
		//buttonPanel
		buttonPanel.setLayout(new GridLayout(1,2));
		buttonPanel.add(exitBtn);
		buttonPanel.add(rollBtn);
		
		buttonPanel.setBorder(BorderFactory.createRaisedBevelBorder());
		buttonPanel.setBackground(Color.WHITE);
		
		mainPanel.add(labelPanel, BorderLayout.CENTER);
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);
		
		rollBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Random ran = new Random();
				num_1 = ran.nextInt((int) (6*Math.random()+1));
				num_2 = ran.nextInt((int) (6*Math.random()+1));
				
				System.out.println(num_1);
				
				label_1.setIcon(new ImageIcon(images[num_1]));
				label_2.setIcon(new ImageIcon(images[num_2]));
			}
		});
		
		exitBtn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	});
		
}
	
	public static void main(String[] args) {
		new DiceSimulator();
		}
	}

//Source link
//Dices: "https://github.com/curadProgrammer/Java_TwoDiceRoll/tree/main/src"
//Codes: https://www.youtube.com/watch?v=9XkT7ZQVE7M