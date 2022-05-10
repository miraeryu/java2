package com.yedam.TripAdvisor;

import java.util.Scanner;

import com.yedam.TripAdvisor.Currency.CurrencyService;
import com.yedam.TripAdvisor.Currency.currencyListone;

public class App 
{
    public static void main( String[] args )
    {
//    	Main main = new Main();
//    	main.Start();
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("원하는 국가 입력");
//    	System.out.print(">>");
//    	String nation = sc.next();
//    	CurrencyService cs = new CurrencyService();
//    	CurrencyService.getCurrencyInfomation(nation);
//    	System.out.println(CurrencyService.getCurrencyInfomation(nation));
    	currencyListone list = new currencyListone();
    	list.execute();
    }
}


