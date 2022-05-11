package com.yedam.TripAdvisor.Currency;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.TripAdvisor.dao.DataSource;

public class CurrencyDataImpl implements CurrencyData {

	private DataSource dao = DataSource.getInstance();
	private Connection conn = dao.getConnection();
	private PreparedStatement psmt;
	private ResultSet rs;

	@Override
	public List<CurrencyDataVO> listCurrency() {
		List<CurrencyDataVO> list = new ArrayList<CurrencyDataVO>();
		String sql = "select * from country_code order by country_list_number";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				CurrencyDataVO vo = new CurrencyDataVO(rs.getString("country_id"), rs.getString("country_name"),
						rs.getString("currency"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
