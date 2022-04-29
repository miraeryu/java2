package com.micol.student;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.micol.student.dao.DataSource;
import com.micol.student.dto.StudentVO;
import com.micol.student.service.StudentService;
import com.micol.student.serviceImpl.StudentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//전체 리스트
    	StudentService dao = new StudentServiceImpl();
    	List<StudentVO> list = new ArrayList<StudentVO>();
    	list = dao.selectListStudent();
    	
        for(StudentVO vo : list) {
            vo.toString();
         }
//        
//        //한명 조회
//        System.out.println("===========================================");
//        StudentVO student = new StudentVO();
//        student.setStudentId("park@abc.com");
//        student = dao.selectStudentVO(student);
//        student.toString();
        
    	
    	//학생추가
//    	StudentVO vo = new StudentVO();
//    	vo.setStudentId("meet@abc.com");
//    	vo.setName("만나자");
//    	vo.setBirthday(Date.valueOf("2000-04-09"));
//    	vo.setMajor("조소학과");
//    	vo.setAddress("대구광역시 중구");
//    	vo.setTel("010-5333-3333");
//    	int n = dao.insertStudent(vo);
//    	if (n != 0) {
//    		System.out.println("정상적으로 입력되었습니다.");
//    	}else {
//    		System.out.println("비정상적인 입력입니다.");
//    	}
    }
}
