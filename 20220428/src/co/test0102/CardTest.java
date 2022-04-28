package co.test0102;

public class CardTest {
	public static void main(String[] args) {
		Card card = new Card();
		TossCard toss = new TossCard("신빛용");
		DGBcard dgb = new DGBcard("신빛용");
		toss.showCardInfo();
		dgb.showCardInfo();
	}

}
