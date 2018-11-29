

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

public class war {
	
	scorekeeper scores = new scorekeeper(0,0,0);
	deck Deck;
	int playerPoints= 0;
	int computerPoints = 0;
	int bonusPoints = 0;
	
	
	
	public void Initialize(JFrame frame, JPanel topPanel, JLabel topMessage, JPanel leftScore) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 420);
		frame.setTitle("War!");
		
		topPanel = new JPanel();
		topPanel.setBackground(new Color(200,100,126));
		frame.add(topPanel, BorderLayout.NORTH);
		topMessage = new JLabel();
		topMessage.setText("You've come to duel");
		topPanel.add(topMessage);
		
		leftScore = new JPanel();
		frame.add(leftScore, BorderLayout.WEST);
		
	}
public static void main(String[] args, JPanel topPanel, JFrame frame, JLabel topMessage, JPanel leftScore) {
	testDeck();
	war War = new war();
	War.Initialize(frame, topPanel, topMessage, leftScore);
}

private static void testDeck() {
	deck d = new deck();
	System.out.println();
	d.shuffle();
}
}
