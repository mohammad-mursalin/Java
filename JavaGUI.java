
import javax.swing.JFrame;

public class JavaGUI {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();  //this will create a frame

		frame.setSize(420, 420);
		
		frame.setTitle("Demo frame");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        frame.setVisible(true);

	}

}
