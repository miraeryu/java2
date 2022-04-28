package co.test0102;

public class Card {
	protected String cardNo = "5432-4567-9534-3657";
	protected int validDate = 20251203;
	protected int cvc = 253;

	public Card() {
	}

	public Card(String cardNo, int validDate, int cvc) {
		super();
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}

	public String getCardNo() {
		return cardNo;
	}

	public int getValidDate() {
		return validDate;
	}

	public int getCvc() {
		return cvc;
	}

	public void showCardInfo() {
		System.out.println("카드정보 ( Card NO : " + cardNo + ", 유효기간 : " + validDate + ", CVC : " + cvc + " )");
	}

}
