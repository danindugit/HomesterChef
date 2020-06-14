import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Danindu
 *Date: 2020 06 13
 *Desc.: A class for the Main GUI
 *Method List: 
 *		public MainUI()
 *		public void actionPerformed(ActionEvent e) 
 *		public static void main(String[] args)		
 */
public class MainUI extends JFrame implements ActionListener{
	//private data
	private Color beta;
	private ImagePicture bg;
	private TextPicture title;
	private JButton btnStart;
	private int width, height;

	public MainUI() {
		super("Homester Chef");  //frame title
		//initializing frame width and height
		width =400;
		height = 400;
		
		//creating color
		beta = new Color(235, 64, 52);
		
		//creating ImagePicture and TextPicture
		bg = new ImagePicture(new ImageIcon("bg.png"),0,0);
		title = new TextPicture ("Welcome to Homester Chef", 105, 50);
		title.setFont(new Font("Arial", Font.BOLD, 16));
		title.setColor(beta);
		
		//creating button
		btnStart = new JButton ("Start");
		btnStart.setBackground(beta);
		btnStart.setForeground(Color.WHITE);
		btnStart.addActionListener(this);
		
		//setting bounds
		bg.setBounds(0, 0, width, height);
		title.setBounds(0, 0, width, height);
		btnStart.setBounds(125, 315, 150, 35);
		
		//adding to the frame
		add(btnStart);
		add(title);
		add(bg);
		
		// set size and location of frame, making it visible
		setSize(width,height); 
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//method that listens to clicks
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnStart) {
			//MenuUI ui = new MenuUI();
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		MainUI ui = new MainUI();
	}

}
