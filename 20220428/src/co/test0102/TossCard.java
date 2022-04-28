package co.test0102;

public class TossCard extends Card {

	private String company = "Toss";
	private String cardStaff = "신빛용";

	public TossCard(String cardStaff) {
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		System.out.println("카드 정보 - Card NO, " + cardNo + "\n담장직원 - " + cardStaff + ", " + company);
	}

}
