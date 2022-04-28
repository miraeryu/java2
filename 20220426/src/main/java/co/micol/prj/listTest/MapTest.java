package co.micol.prj.listTest;

import java.util.HashMap;
import java.util.Map;

import co.micol.prj.dto.StudentVO;

public class MapTest {
	public void mapTest() {
		Map<String, String> map = new HashMap<String, String>(); //맵구조를 쓸건데 hashmap구조로 쓸거임을 명령
		map.put("name", "홍길동");
		map.put("address", "대구광역시");
		System.out.println(map.get("name"));
		System.out.println(map.get("address"));
	}
	
	public void studentMap() {
		Map<Integer, StudentVO> map = new HashMap<Integer,StudentVO>();
		map.put(1,new StudentVO("홍길동"));
		map.put(2,new StudentVO("박승리"));
		
		System.out.println(map.get(2));
		
	}

}
