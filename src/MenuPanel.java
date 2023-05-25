import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class MenuPanel extends JPanel{
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_SIZE = 25;
	Rectangle playButton = new Rectangle(SCREEN_WIDTH/2-100,100,200,50);
	Rectangle statsButton = new Rectangle(SCREEN_WIDTH/2-100,200,200,50);
	Rectangle settingsButton = new Rectangle(SCREEN_WIDTH/2-100,300,200,50);
	Rectangle creditsButton = new Rectangle(SCREEN_WIDTH/2-100,400,200,50);
	Rectangle exitButton = new Rectangle(SCREEN_WIDTH/2-100,500,200,50);
	public static String action = "";
	Timer timer;
	
	MenuPanel() {
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.BLACK);
		this.setFocusable(true);
		this.addMouseListener(new MouseInput(this));
		if(action.equals("Play")) {
			System.out.println("SIIII");
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.setFont(new Font("Ink Free",Font.BOLD,40));
		FontMetrics metricsScore = getFontMetrics(g.getFont());
		g.drawString("SNAKE", (SCREEN_WIDTH-metricsScore.stringWidth("SNAKE"))/2, g.getFont().getSize());
		
		g.setColor(Color.WHITE);
		Graphics2D g2d = (Graphics2D) g;
		g.drawString("Play", (SCREEN_WIDTH-metricsScore.stringWidth("Play"))/2, playButton.y+40);
		g2d.draw(playButton);
		g.drawString("Stats", (SCREEN_WIDTH-metricsScore.stringWidth("Stats"))/2, statsButton.y+40);
		g2d.draw(statsButton);
		g.drawString("Settings", (SCREEN_WIDTH-metricsScore.stringWidth("Settings"))/2, settingsButton.y+40);
		g2d.draw(settingsButton);
		g.drawString("Credits", (SCREEN_WIDTH-metricsScore.stringWidth("Credits"))/2, creditsButton.y+40);
		g2d.draw(creditsButton);
		g.drawString("Exit", (SCREEN_WIDTH-metricsScore.stringWidth("Exit"))/2, exitButton.y+40);
		g2d.draw(exitButton);
	}
}
