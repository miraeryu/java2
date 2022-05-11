package com.yedam.TripAdvisor.sights;

import java.util.Date;

import lombok.Data;
@Data
public class SightWarningInfo {
	
	//1/여행유의 2/여행자제 3/출국권고 4/여행금지
	private int alarm_lvl; //여행경보단계
	private Date written_dt; //경보 발령일
	

}
