package co.test0304;

public class SimplePayment implements Payment {
	private double simplePaymentRatio;

	public SimplePayment(double simplePaymentRatio) {
		super();
		this.simplePaymentRatio = simplePaymentRatio;
	}

	@Override
	public int online(int price) {
		return (int) (price * (1 - (ONLINE_PAYMENT_RATIO + simplePaymentRatio)));
	}

	@Override
	public int offline(int price) {
		return (int) (price * (1 - (OFFLINE_PAYMENT_RATIO + simplePaymentRatio)));
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제 시 총 할인율 : " + (ONLINE_PAYMENT_RATIO + simplePaymentRatio));
		System.out.println("오프라인 결제 시 총 할인율 : " + (OFFLINE_PAYMENT_RATIO + simplePaymentRatio));

	}

}
