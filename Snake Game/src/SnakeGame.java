import javax.swing.JFrame;

public class SnakeGame extends JFrame {

	SnakeGame(){
		
		this.add(new Second());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}	
}
