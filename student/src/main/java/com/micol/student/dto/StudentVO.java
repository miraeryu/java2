package com.micol.student.dto;

import java.sql.Date;

import lombok.Data;
@Data

public class StudentVO { //DTO
	// 컬럼명과 똑같이 설정할 것
	private String studentId;
	private String name;
	private Date birthday; // 시분초 중요 = util.date써야함
	private String major;
	private String address;

	private String tel;

//	public String getStudentId() {
//		return studentId;
//	}
//
//	public void setStudentId(String studentId) {
//		this.studentId = studentId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Date getBirthday() {
//		return birthday;
//	}
//
//	public void setBirthday(Date birthday) {
//		this.birthday = birthday;
//	}
//
//	public String getMajor() {
//		return major;
//	}
//
//	public void setMajor(String major) {
//		this.major = major;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getTel() {
//		return tel;
//	}
//
//	public void setTel(String tel) {
//		this.tel = tel;
//	}

	@Override
	public String toString() {
		System.out.print(studentId + " : ");
		System.out.print(name + " : ");
		System.out.print(birthday + " : ");
		System.out.print(major + " : ");
		System.out.print(address + " : ");
		System.out.print(tel + " : ");
		System.out.println();
		return null;
	}
	
	
	
	

}
