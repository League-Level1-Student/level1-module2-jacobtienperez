import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysuprise implements ActionListener {
	JButton leftbutton = new JButton();
	JButton rightbutton = new JButton();
	public static void main(String[] args) {
		
	}
	
	
	private void createUI() {
		JFrame frame = new JFrame();
		JPanel Panel = new JPanel();
		frame.add(Panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		leftbutton.setText("trick");
		rightbutton.setText("Treat");
		leftbutton.addActionListener(this);
		rightbutton.addActionListener(this);
		
	}
	
	
	
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imagelable = new JLabel();
			 JFrame frame = new JFrame();
	          frame.add(imagelable);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace(); }
	     }
	@Override
		public void actionPerformed(ActionEvent e) {
		JButton buttonpressed = (JButton) e.getSource(); 
		if (buttonpressed == leftbutton);
			
		}
		
		
		
	}
		
	

}
	
	
	
	
	
	
	

	
	


