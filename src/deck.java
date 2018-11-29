import java.util.Random;

public class deck {
	private int cards[];
    private int nextCardIndex = 0;
	private int card;
	public deck() {
		cards = new int[40];
		int index = 0;
		for (int i = 1; i <= 10; i++) {
			cards[index] = i;
			index++;
			cards[index] = i;
			index++;
			cards[index] = i;
			index++;
			cards[index] = i;
			index++;
		}

	}

	public void shuffle() {
	Random rnd = new Random();
	for (int i = 0; i < cards.length; i++) {
		int  cardIndex1 = rnd.nextInt(cards.length);
		int cardIndex2 = rnd.nextInt(cards.length);
		int cardValue1 = cards[cardIndex1];
		int cardValue2 = cards[cardIndex2];
		cards[cardIndex1] = cardValue2;
		cards[cardIndex2] = cardValue1;}
		
	}
	
	public int getCardsleft() {
		return cards.length - nextCardIndex;
	}
	
	public int dealCard() {
		if(getCardsleft() > 0) {
	    nextCardIndex++;
	    int card = cards[nextCardIndex];
		return card;
		}
	    else {
	    	return  0;
	    }
		
	} 

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < cards.length; i++) {
			builder.append(cards[i] + "");
			
		}
		return builder.toString();

	}

}
