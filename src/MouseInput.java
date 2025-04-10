import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener{
	static final int SCREEN_WIDTH = 600;

	public static MenuPanel menuPanel;
	MouseInput(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if(mx >= SCREEN_WIDTH/2-100 && mx <= SCREEN_WIDTH/2+100) {
			if(my >= 100 && my <= 150) {
				MenuPanel.action = "Play";
				menuPanel.setVisible(false);
				GamePanel gamePanel = new GamePanel();
				gamePanel.setVisible(true);
			}
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
