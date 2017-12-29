package fatalvirus.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukVO;

public class SungJukJDBC_Select {

	public static void main(String[] args) {

		// 성적 처리 JDBC
		// 오라클 접속 정보 설정
		String DRV = "oracle.jdbc.driver.OracleDriver";
		String URL = "jdbc:oracle:thin:@192.168.88.128:1521:xe";
		String USR = "fatalvirus";
		String PWD = "123456";

		// jDBC 관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// SQL 관련 변수 선언
		String selectSQL = " select sjno, name, kor, eng, mat, regdate from sungjuk ";
		String selectOneSQL = " select * from sungjuk where sjno = ? ";
		StringBuffer sb = new StringBuffer();
		sb.append("insert into sungjuk (sjno, name, kor, eng, mat, tot, avrg, grd) ")
				.append(" VALUES (SJNO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)");
		String insertSQL = sb.toString();
		String updateSQL = "update sungjuk set name = ?, kor = ?, eng = ?, mat = ? where sjno = ?";
		String deleteSQL = "delete from SUNGJUK where sjno = ?";

		try {
			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectSQL);
			// 4.
			rs = pstmt.executeQuery(); // select
			// 5.

			List<SungJukVO> sjlist = new ArrayList<>();
			while (rs.next()) {
				SungJukVO sj = new SungJukVO();
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));
				sjlist.add(sj);
			}

			for (SungJukVO sj : sjlist) {
				System.out.println(sj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
			}
			try {
				pstmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception e) {
			}

		}
	}

}
