import javax.swing.JFrame;

public class snakeframe extends JFrame{

	snakeframe(){
		this.add(new snakepanel());
		this.setTitle("Snake Game By Keerthika");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}