package co.yedam.app.common;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor //모든 필드를 이용해서 생성자를 이용하는 커맨드
@Data
public class PropertiesPair {
	private String key;
	private String value;
	
	public static String getQuery(List<PropertiesPair> params) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		
		for(PropertiesPair param : params) {
			if(isFirst) {
				isFirst = false;
			}else {
				sb.append("&");
				//처음인지 처음아닌지 구분
			}
			
			try {
				sb.append(URLEncoder.encode(param.getKey(),"UTF-8"));
				sb.append("=");
				sb.append(URLEncoder.encode(param.getValue(),"UTF-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			
		}
		return sb.toString();
	}

}
