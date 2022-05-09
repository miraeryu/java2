package com.yedam.TripAdvisor;

import com.yedam.TripAdvisor.Currency.CurrencyService;

public class App 
{
    public static void main( String[] args )
    {
//    	Main main = new Main();
//    	main.Start();
    	CurrencyService cs = new CurrencyService();
    	CurrencyService.getCurrencyInfomation();
    }
}
