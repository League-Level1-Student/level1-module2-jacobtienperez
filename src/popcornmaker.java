import java.text.ParseException;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class popcornmaker {
public static void main(String[] args) {
	String flavoure =JOptionPane.showInputDialog("Hi welcome to chillies what flavour of popcorn do you want");
	Popcorn pop = new Popcorn(flavoure);
	String cood = JOptionPane.showInputDialog("how long do you want to cook it ");
	int pep = Integer.parseInt(cood);
   Microwave het = new Microwave();
   het.putInMicrowave(pop);
   het.setTime(pep);
   
	pop.applyHeat();
	het.startMicrowave();
	pop.eat();
	
}
}
