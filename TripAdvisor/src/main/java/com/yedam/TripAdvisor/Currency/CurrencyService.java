package com.yedam.TripAdvisor.Currency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CurrencyService {
	private static CurrencyInfo info = new CurrencyInfo();
	private static final String autokey = "YxIGPjJqE0b0aaEcUbNafkTqaK9tWnrt";

	public static double getCurrencyInfomation(String country) {
		double searchCurrency = 0;
		String serviceURL = "https://www.koreaexim.go.kr/site/program/financial/exchangeJSON?";
//		List<PropertiesPair> params = new ArrayList<PropertiesPair>();
//		params.add(new PropertiesPair("autokey",autokey));
//		params.add(new PropertiesPair("searchdate","20220509"));
//		params.add(new PropertiesPair("data","AP01"));
		String AuthKey = "YxIGPjJqE0b0aaEcUbNafkTqaK9tWnrt";
		String SearchDate = "20220509";
		String dataType = "AP01";

		StringBuilder sb = new StringBuilder();
		try {
//			String paramURL = PropertiesPair.getQuery(params);
			String requestURL = "https://www.koreaexim.go.kr/site/program/financial/exchangeJSON?authkey=" + AuthKey
					+ "&searchdate=" + SearchDate + "&data=" + dataType;
//			String requestURL = serviceURL + paramURL;
			// System.out.println(requestURL);
			URL url = new URL(requestURL);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
				String line;
				while ((line = br.readLine()) != null) {
//					sb.append(line);
					JSONParser parser = new JSONParser();
					JSONArray infomation = null;
					infomation = (JSONArray) parser.parse(line);
					for (int i = 0; i<infomation.size(); i++) {
						JSONObject o = (JSONObject) infomation.get(i);
//						JSONObject infom = (JSONObject) o;
						if (o.get("cur_unit").equals(country)) {
							
							System.out.println(o.get("deal_bas_r"));
							searchCurrency = Double.parseDouble((String) o.get("deal_bas_r"));
						}

					}
//					br.close();
				}
			} else {
				System.out.println(con.getResponseMessage());
			}
			con.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}

//		String jsonResult = sb.toString();
//	      JSONParser parser = new JSONParser();
//	      JSONArray information = null;
//	      try {
//	         information = (JSONArray) parser.parse(jsonResult);
//	      } catch (org.json.simple.parser.ParseException e) {
//	         e.printStackTrace();
//	      }

//	      for (int i = 0; i < information.size(); i++) {
//	    	  JSONObject o = (JSONObject) information.get(i);
//	    	  if (i == 0) {
//	    		  info.setResult((Long) o.get("result"));
//	    	  } else if (i == 1) {
//	    		  info.setCur_unit((String) o.get("cur_unit"));
//	    	  } else if (i == 4) {
//	    		  info.setDeal_bas_r((String) o.get("deal_bas_r"));
//	    	  } 
//	    	  else if (i == 10) {
//	    		  info.setCur_nm((String) o.get("cur_nm"));
//	    	  }
//	      }

//	      System.out.println(info.toString());
		return searchCurrency;

//		CurrencyInfo result = new Gson().fromJson([JsonArray].toSring(), CurrencyInfo.class);

	}

}
