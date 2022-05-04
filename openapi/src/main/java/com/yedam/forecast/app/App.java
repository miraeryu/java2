package com.yedam.forecast.app;

import java.util.List;

import com.yedam.forecast.service.ForecastService;
import com.yedam.forecast.service.vo.WeatherInfo;

public class App {
	public static void main(String[] args) {
//		ForecastService run = new ForecastService();
//		run.getWeatherForecast();
		
		List<WeatherInfo> list = ForecastService.getWeatherForecast();
		for(WeatherInfo info : list) {
			System.out.println(info);
		}
	}

}
