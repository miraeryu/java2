package com.yedam.TripAdvisor.sights;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.TripAdvisor.dao.DataSource;

public class SightSearchServiceImpl implements SightSearchService {
	
	private DataSource dao = DataSource.getInstance();
	private Connection conn = dao.getConnection();
	private PreparedStatement psmt;
	private ResultSet rs;
	

	@Override
	public List<SightVO> selectAllList() {
		List<SightVO> list = new ArrayList<SightVO>();
		String sql = "select * from sight_list order by hit";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				SightVO vo = new SightVO();
				vo.setCountry(rs.getString("sight_country_name"));
				vo.setName(rs.getString("sight_name"));
				vo.setHit(rs.getInt("hit"));
				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<SightVO> countryList() {
		List<SightVO> list = new ArrayList<SightVO>();
		String sql = "select distinct sight_country_name from sight_list order by sight_country_name";
		
		return null;
	}

	@Override
	public List<SightVO> selectCountryList(String country) {
		return null;
	}

	@Override
	public SightVO readMoreSight(String name) {
		return null;
	}

	@Override
	public void updateHit() {

	}

	@Override
	public void myListSave() {

	}

}
