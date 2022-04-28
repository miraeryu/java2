package co.micol.P20220428;

import java.sql.Date;
import java.util.Random;

public class StringExam {
	public static void main(String[] args) {
		//a와 b는 같은 주소값
		String a = "1";
		String b = "1";
		
		//c와 d는 다른 주소값
		String c = new String("1");
		String d = new String("1");
//		String e = a+b;
		a = a+b;
		
		if(a == b ) {
			System.out.println("같은주소값입니다.");
		}else {
			System.out.println("다른주소값입니다.");
		}
		
		StringBuilder sb = new StringBuilder();
		//Builder에 내용을 연속해서 저장함
		sb.append("a");
		sb.append("b");
		sb.append("c");
		System.out.println(sb.toString());
		
		//자르기
		String exam = "1,2,3,4,5,6,7";
		System.out.println(exam);
		String[] temp = exam.split(","); //배열형태로 저장, 출력은 for문으로
		for(int i=0; i<temp.length;i++) {
			System.out.println(temp[i].toString());
			
		}
		
		//시간으로 랜덤값을 넣고 중복을 아예 안 들어오게 하는 방법
		Random rd = new Random();
		rd.setSeed(0);
		long time = System.currentTimeMillis();
		long time2 = System.nanoTime();
		System.out.println(rd.nextInt()+1);
		System.out.println(time + ", " + time2);
		
		//sql 데이터는 초 아래로는 불가능
		Date date = new Date(0);
		System.out.println(date.toString());
		
	}

}
