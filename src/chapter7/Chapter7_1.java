package chapter7;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		
		for(int i = 0; i < cards.length ; i++) {
			
		//	cards[i] = SutdaCard(i+1, ;
			
		}
		
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()��� ObjectŬ������ toString()�� �������̵��ߴ�.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Chapter7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");

	}

}
