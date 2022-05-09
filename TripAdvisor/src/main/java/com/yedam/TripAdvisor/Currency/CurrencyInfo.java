package com.yedam.TripAdvisor.Currency;

import java.util.List;

import lombok.Data;

@Data
public class CurrencyInfo {
	
	private int result; // 서버 통신여부
	private String cur_unit; //통화 코드
	private double deal_bas_r; //매매 기준율
	private String cur_nm; //국가/통화명
	private List<CurrencyInfo> ExchangeRate;



}
