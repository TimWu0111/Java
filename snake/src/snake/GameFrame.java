package snake;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
	GameFrame(){
		
		GamePanel panel = new GamePanel();
			
		this.add(panel);
		this.setTitle("Snake Game");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);//prevent frame being resized
		this.pack();//fit
		this.setVisible(true);
		this.setLocationRelativeTo(null);//center
		
		ImageIcon image = new ImageIcon("snake.jpg");
		this.setIconImage(image.getImage());
	}
}
