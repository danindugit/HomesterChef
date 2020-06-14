import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Danindu
 *Date: 2020 06 13
 *Desc.: A class for the Main GUI
 *Method List: 
 *		
 */
public class MainUI extends JFrame{
	//private data
	private User u;
	private ImagePicture bg;
	private TextPicture title;
	private JButton btnStart;
	private int width, height;

	public MainUI() {
		super("Homester Chef");  //frame title
		//initializing frame width and height
		width =400;
		height = 400;
		//creating ImagePicture and TextPicture
		bg = new ImagePicture(new ImageIcon("bg.png"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
