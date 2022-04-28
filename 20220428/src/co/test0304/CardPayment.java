package co.test0304;

public class CardPayment implements Payment{
	private double cardRatio;
	
	

	public CardPayment(double cardRatio) {
		super();
		this.cardRatio = cardRatio;
	}

	@Override
	public int online(int price) {
		return (int) (price*(1-(ONLINE_PAYMENT_RATIO+cardRatio)));
	}

	@Override
	public int offline(int price) {
		return (int) (price * (1 - (OFFLINE_PAYMENT_RATIO + cardRatio)));
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		System.out.println("온라인 결제 시 총 할인율 : " + (ONLINE_PAYMENT_RATIO+cardRatio));
		System.out.println("오프라인 결제 시 총 할인율 : " + (OFFLINE_PAYMENT_RATIO+cardRatio));
		
	}
	
	

}
