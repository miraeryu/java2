package co.yedam.movie.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.yedam.movie.vo.BoxOfficeResult;
import com.yedam.movie.vo.MovieInfo;

import co.yedam.app.common.PropertiesPair;

public class MovieService {
	//메서드 하나에 하나의 API가 대응되도록 반듦
	//일별 박스 오피스
	private static final String key = "7c793fe3dbaff0d4719dd423c4c31da5";
	//영화진흥위원회에서 제공하는 모든 API에 사용하기 때문에 필드값으로 정의함.

	public static List<MovieInfo> getDailyBoxofficeResult(){ //인스턴스 없이 호출하려면 static이 있어야함
		String serviceURL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?";//요청하려는 서비스 URL
		
		List<PropertiesPair> params = new ArrayList<PropertiesPair>();
		params.add(new PropertiesPair("key",key));
		params.add(new PropertiesPair("targetDt","20220428"));
		
		
		StringBuilder sb = new StringBuilder();
		try {
			String paramURL = PropertiesPair.getQuery(params);
			String requestURL = serviceURL + paramURL;
			URL url = new URL(requestURL);
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection(); //강제 형변환 필요
//			con.getResponseCode(); //내가 서버에 정보를 보내고 서버에 응답하는지 확인가능
			if(con.getResponseCode()== HttpURLConnection.HTTP_OK) {//정상연결일경우 http_OK코드를 반환받음
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
				String line;
				while((line = br.readLine()) != null) {
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
		BoxOfficeResult result = new Gson().fromJson(jsonResult, BoxOfficeResult.class); //BoxofficeResult라는 클래스로 변환시켜줌
		
		
		
		return result.getBoxOfficeResult().getDailyBoxOfficeList();
		// BoxOfficeInfo = result.getBoxOffiveResult();
		// List<MovieInfo> list = info.getDailyBoxOfficeList(); 이 두분장을 위처럼 줄인것임
	}

}
