package com.yedam.TripAdvisor.Currency;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CurrencyService2 {
	JSONParser parser = new JSONParser();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	String AuthKey = "YxIGPjJqE0b0aaEcUbNafkTqaK9tWnrt";
	String SearchDate = "";
	String dataType = "AP01";
	String apiURL = "https://www.koreaexim.go.kr/site/program/financial/exchangeJSON?authkey="+AuthKey+ "&searchdate="+ sdf +"&data="+dataType;

    try {         
        URL oracle = new URL(apiURL);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
         
        String inputLine;
        while ((inputLine = in.readLine()) != null) {               
            JSONArray a = (JSONArray) parser.parse(inputLine);
            
            // Loop through each item
            for (Object o : a) {
                JSONObject tutorials = (JSONObject) o;
                
                logger.warn("result>>"+tutorials.get("result"));
                logger.warn("cur_unit>>"+(String)tutorials.get("cur_unit"));
                logger.warn("cur_nm>>"+(String)tutorials.get("cur_nm"));
                logger.warn("ttb>>"+(String)tutorials.get("ttb"));
                logger.warn("tts>>"+(String)tutorials.get("tts"));
                logger.warn("deal_bas_r>>"+(String)tutorials.get("deal_bas_r"));
                logger.warn("bkpr>>"+(String)tutorials.get("bkpr"));
                logger.warn("yy_efee_r>>"+(String)tutorials.get("yy_efee_r"));
                logger.warn("ten_dd_efee_r>>"+(String)tutorials.get("ten_dd_efee_r"));
                logger.warn("kftc_deal_bas_r>>"+(String)tutorials.get("kftc_deal_bas_r"));
                logger.warn("kftc_bkpr>>"+(String)tutorials.get("kftc_bkpr"));
                logger.warn("----------------------------------------");
            }
        }
        in.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ParseException e) {
        e.printStackTrace();
    }




	
	

}
