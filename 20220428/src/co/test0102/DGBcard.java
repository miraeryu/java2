package co.test0102;

public class DGBcard extends Card {

	private String company = "대구은행";
	private String cardStaff = "신빛용";

	public DGBcard(String cardStaff) {
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		System.out.println("카드 정보 ( Card NO : " + cardNo + ", 유효기간 : " + validDate + ", CVC : " + cvc + " )\n담장직원 - "
				+ cardStaff + ", " + company);
	}

}
