package com.yedam.TripAdvisor.Currency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CurrencyService {
	CurrencyInfo info = new CurrencyInfo();
	private static final String autokey = "YxIGPjJqE0b0aaEcUbNafkTqaK9tWnrt";
	
	public static List<CurrencyInfo> getCurrencyInfomation(){
		String serviceURL = "https://www.koreaexim.go.kr/site/program/financial/exchangeJSON?";
		
		List<PropertiesPair> params = new ArrayList<PropertiesPair>();
		params.add(new PropertiesPair("autokey",autokey));
		params.add(new PropertiesPair("searchdate","20220509"));
		params.add(new PropertiesPair("data","AP01"));
		
		StringBuilder sb = new StringBuilder();
		try {
			String paramURL = PropertiesPair.getQuery(params);
			String requestURL = serviceURL + paramURL;
			//System.out.println(requestURL);
			URL url = new URL(requestURL);
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			if(con.getResponseCode()== HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
				String line;
				while((line = br.readLine())!=null) {
					sb.append(line);
				}
				br.close();
			}else  {
				System.out.println(con.getResponseMessage());
			}
			con.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String jsonResult = sb.toString();
		
//		CurrencyInfo result = new Gson().fromJson([JsonArray].toSring(), CurrencyInfo.class);
		
		return null;
		
	}

}
