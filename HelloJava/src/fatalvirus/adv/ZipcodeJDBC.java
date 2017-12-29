package fatalvirus.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ZipcodeJDBC {

	public static void main(String[] args) {

		String rbpath = "fatalvirus.adv.oracle_hr";

		String DRV = null;
		String URL = null;
		String USR = null;
		String PWD = null;

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);

		String region = null;
		while (true) {
			System.out.print("지역을 입력하세요. (서울/경기) ");
			String iregion = sc.nextLine();
			if (iregion.equals("서울")) {
				region = "seoul";
				break;
			} else if (iregion.equals("경기")) {
				region = "kyunggi";
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

		System.out.print("도로명을 입력하세요. ");
		String road = sc.nextLine();

		StringBuffer sb = new StringBuffer();
		sb.append(" select * from zipcode_").append(region).append(" where \"도로명\" like ? ");
		String selectSQL = sb.toString();

		try {
			ResourceBundle rb = ResourceBundle.getBundle(rbpath);
			DRV = rb.getString("DRV");
			URL = rb.getString("URL");
			USR = rb.getString("USR");
			PWD = rb.getString("PWD");

			// 1.
			Class.forName(DRV);
			// 2.
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3.
			pstmt = conn.prepareStatement(selectSQL);

			pstmt.setString(1, road + "%");
			// 4.
			rs = pstmt.executeQuery(); // select
			// 5.

			List<ZipcodeVO> zclist = new ArrayList<>();
			while (rs.next()) {
				ZipcodeVO zc = new ZipcodeVO();
				zc.set우편번호(rs.getInt("우편번호"));
				zc.set건물번호본번(rs.getInt("건물번호본번"));
				zc.set건물번호부번(rs.getInt("건물번호부번"));
				zc.set지번본번(rs.getInt("지번본번"));
				zc.set시도(rs.getString("시도"));
				zc.set시군구(rs.getString("시군구"));
				zc.set읍면(rs.getString("읍면"));
				zc.set도로명(rs.getString("도로명"));
				zc.set시군구용건물명(rs.getString("시군구용건물명"));
				zc.set법정동명(rs.getString("법정동명"));
				zc.set리명(rs.getString("리명"));
				zclist.add(zc);
			}

			for (ZipcodeVO zc : zclist) {
				System.out.println(zc);
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
