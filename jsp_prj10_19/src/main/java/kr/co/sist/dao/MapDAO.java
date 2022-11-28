package kr.co.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import kr.co.sist.vo.LatLngVO;

public class MapDAO {

	private static MapDAO wmDAO;

	private MapDAO() {

	}

	public static MapDAO getInstance() {
		if (wmDAO == null) {
			wmDAO = new MapDAO();
		}
		return wmDAO;
	}

	public List<LatLngVO> selectLatLng() throws SQLException {
		List<LatLngVO> list = new ArrayList<LatLngVO>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DbcpDAO.getInstance().getConn("jdbc/dbcp");

			String selectMap = "select lat, lng, title from maps ";
			pstmt = con.prepareStatement(selectMap);
			rs = pstmt.executeQuery();

			LatLngVO sVO = null;

			while (rs.next()) {
				sVO = new LatLngVO(rs.getDouble("lat"), rs.getDouble("lng"), rs.getString("title"));
				list.add(sVO);
			}

		} catch (NamingException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}

		return list;
	}

}
