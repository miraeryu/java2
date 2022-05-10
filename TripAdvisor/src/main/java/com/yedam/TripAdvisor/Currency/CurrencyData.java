package com.yedam.TripAdvisor.Currency;

import java.util.List;

public interface CurrencyData {
	
	//통화코드+국가+통화를 불러오는 코드
	public List<CurrencyDataVO> listCurrency();
	
	//통화코드를 불러와서 API랑 대조
	public String cur_code_load();

}
