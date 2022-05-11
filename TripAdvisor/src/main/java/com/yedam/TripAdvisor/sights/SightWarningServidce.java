package com.yedam.TripAdvisor.sights;

public class SightWarningServidce {
	private static SightWarningInfo WarningInfo = new SightWarningInfo();
	private static final String ServiceKey = 	
			"nsI3idhNhVtaDh18YDPl7ACbn730ehO7gzq1ON4RAGtou1jbZtbh5G09xsNkyMACV6dYB//g6X194dS6dAC/cA==";
	
	public static int getWarninglevel(String country) {
		
		String serviceURL = "http://apis.data.go.kr/1262000/TravelAlarmService2?";
		
		/*https://apis.data.go.kr/1262000/TravelAlarmService2/getTravelAlarmList2?
serviceKey=nsI3idhNhVtaDh18YDPl7ACbn730ehO7gzq1ON4RAGtou1jbZtbh5G09xsNkyMACV6dYB%2F%2Fg6X194dS6dAC%2FcA%3D%3D&
returnType=JSON&numOfRows=10&cond[country_nm::EQ]=%EA%B0%80%EB%82%98&cond[country_iso_alp2::EQ]=GH&pageNo=1
		 * 
		 */
		
		return 0;
		
	}

}
