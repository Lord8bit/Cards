
public class CardTester {

	
	public static void main(String[] args) {
		Card card1 = new Card("Jack", "Hearts", 10);
		Card card2 = new Card("Murloc", "Azeroth", 1);
		Card card3 = new Card("Worgen", "Azeroth", 1);
		Card card4 = new Card("Black Lotus", "Artifact", 0);
		System.out.println(card4);
		System.out.println(card3);
		System.out.println(card2);
		System.out.println(card1);
		System.out.println(card3.someMatches(card2));
	}
}
