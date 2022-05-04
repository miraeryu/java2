package com.yedam.forecast.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.yedam.forecast.service.vo.WeatherInfo;

import co.yedam.app.common.PropertiesPair;

public class ForecastService {
	// API랑 동일한 각 메서드 선언

	// 동네예보 - 육상예보조회
	public static List<WeatherInfo> getWeatherForecast() {
		String key = "nsI3idhNhVtaDh18YDPl7ACbn730ehO7gzq1ON4RAGtou1jbZtbh5G09xsNkyMACV6dYB//g6X194dS6dAC/cA==";
		String serviceURL = "http://apis.data.go.kr/1360000/VilageFcstMsgService/getLandFcst?"; // ?항상 필수

		List<PropertiesPair> params = new ArrayList<PropertiesPair>();

		params.add(new PropertiesPair("ServiceKey", key));
		params.add(new PropertiesPair("pageNo", "1"));
		params.add(new PropertiesPair("numOfRows", "10"));
		params.add(new PropertiesPair("dataType", "JSON"));
		params.add(new PropertiesPair("regId", "11A00101"));

		StringBuilder sb = new StringBuilder();
		try {
			String paramURL = PropertiesPair.getQuery(params);

			String requestURL = serviceURL + paramURL;
			URL url = new URL(requestURL);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET"); //내가 호출하는 방식 지정
			con.setRequestProperty("Content-type", "application/json"); //URL방식보다는 파일방식에 많이 쓰임. URL은 필요없음 다만 연습용으로 쓴거임
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream())); //내용의 양을 모르기때문에 Stringbuilder를 통해가져옴
				String line;
				while((line=br.readLine()) != null) {
					sb.append(line);
				}
				br.close();
			}else {
				System.out.println(con.getResponseMessage());
			}
			con.disconnect();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String jsonResult = sb.toString();
		System.out.println(jsonResult);
		
		return getWeatherData(jsonResult);
	}
	
	private static List<WeatherInfo> getWeatherData(String jsonData){
		List<WeatherInfo> list = new ArrayList<WeatherInfo>();
		try {
			JSONParser parser = new JSONParser();
			JSONObject forecastData = (JSONObject)parser.parse(jsonData); //Object클래스라 강제로 타입변환 시켜줘야함
			JSONObject response = (JSONObject)forecastData.get("response");
			JSONObject body = (JSONObject)response.get("body");
			JSONObject items = (JSONObject)body.get("items");
			JSONArray item = (JSONArray)items.get("item");
			
			for(int i=0; i< item.size(); i++) {
				JSONObject data = (JSONObject)item.get(i);
				WeatherInfo info = new WeatherInfo();
				
				//발표시간 - 필수
//				info.setAnnounceTime((long)data.get("announceTime"));
				info.setAnnounceTime(Long.parseLong(data.get("announceTime").toString()));
				//발표번호 - 옵션
//				info.setNumEf((data.get("numEf") == null)? 0 : (long)data.get("numEf"));
				info.setNumEf((data.get("numEf") == null)? 0 : Long.parseLong(data.get("numEf").toString()));
				//예보구역코드 - 필수
				info.setRegId((String)data.get("regId"));
				//강수확률 - 옵션
//				info.setRnSt((data.get("rnSt")==null)? 0.0 : (double)data.get("rnSt"));
				info.setRnSt((data.get("rnSt") == null)? 0.0 : Double.parseDouble(data.get("rnSt").toString()));
				//강수형태 - 필수
//				info.setRnYn((int)data.get("rnYn"));
				info.setRnYn(Integer.parseInt(data.get("rnYn").toString()));
				//예상기온 - 옵션
//				info.setTa((data.get("ta")==null)? 0.0 : (double)data.get("ta"));
				info.setTa((data.get("ta") == null)? 0.0 : Double.parseDouble(data.get("ta").toString()));
				//날씨 - 필수
				info.setWf((String)data.get("wf"));
				//하늘상태 - 필수
				info.setWfCd((String)data.get("wfCd"));
				//풍속 강도코드 - 필수
//				info.setWsIt((int)data.get("wsIt"));
				info.setWsIt(Integer.parseInt(data.get("wsIt").toString()));
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return list;
	}

}
