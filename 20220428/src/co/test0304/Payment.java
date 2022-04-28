package co.test0304;

public interface Payment {
	double ONLINE_PAYMENT_RATIO = 0.05; // 온라인결제할인률
	double OFFLINE_PAYMENT_RATIO = 0.03; // 오프라인결제할인률

	public int online(int price); // 온라인결제

	public int offline(int price); // 오프라인결제

	public void showInfo(); // 결제정보출력

}
