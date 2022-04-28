package co.micol.prj.listTest;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import co.micol.prj.dto.StudentVO;

public class listTest {
	public void listTest() {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("박기자");
		list.add("이승리");
		
		for(String str : list) {
			System.out.println(str);
			
		}
	
	}
	
	public void studentList() {
		List<StudentVO> students = new ArrayList<StudentVO>();
		StudentVO student = new StudentVO();
		student.setStudentId("202204001");
		student.setName("홍길동");
		student.setAge(20);
		student.setBirth(Date.valueOf("2002-03-01"));
		student.setGender("F");
		students.add(student);
		
		student = new StudentVO(); //객체 초기화
		student.setStudentId("202204002");
		student.setName("박기자");
		student.setAge(20);
		student.setBirth(Date.valueOf("2002-04-01"));
		student.setGender("W");
		students.add(student);
		
		for(StudentVO vo : students) {
			vo.toString();
			System.out.println(vo.getStudentId());
		}

	}

}
