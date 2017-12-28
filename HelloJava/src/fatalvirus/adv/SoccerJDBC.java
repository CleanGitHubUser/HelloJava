package fatalvirus.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SoccerJDBC {

	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.88.128:1521:xe";
	private static String USR = "fatalvirus";
	private static String PWD = "123456";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Connection conn = null;
		StringBuffer sb = null;
		String sql = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("선수 이름:");
		String scname = sc.nextLine();
		System.out.print("팀 이름:");
		String tmname = sc.nextLine();
		System.out.print("팀 연고지:");
		String tmregion = sc.nextLine();
		System.out.print("포지션:");
		String tmpos = sc.nextLine();
		System.out.print("등번호:");
		String bkno = sc.nextLine();
		System.out.print("생년월일:");
		String birth = sc.nextLine();
		System.out.print("키:");
		String height = sc.nextLine();
		System.out.print("몸무게:");
		String weight = sc.nextLine();

		PreparedStatement pstmt = null;
		int cnt = 0;
		ResultSet rs = null;
		try {
			// 1. 데이터베이스 드라이버 메모리에 올림
			Class.forName(DRV);
			// 2. 지정한 URL로 데이터베이스 서버에 접속
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3. 실행할 SQL문을 생성
			sb = new StringBuffer();
			sb.append("insert into soccer ")
					.append("(scno, scname, tmname, tmregion, tmpos, bkno, birth, height, weight) ").append("values ")
					.append("(scno.nextval, ?, ?, ?, ?, ?, ?, ?, ?)");
			sql = sb.toString();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, scname);
			pstmt.setString(2, tmname);
			pstmt.setString(3, tmregion);
			pstmt.setString(4, tmpos);
			pstmt.setString(5, bkno);
			pstmt.setString(6, birth);
			pstmt.setString(7, height);
			pstmt.setString(8, weight);

			// 4. 작성된 SQL문을 실행
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건의 데이터가 추가됨!");

			// 3b. 실행할 SQL문을 생성 - select
			sql = "select * from soccer";
			pstmt = conn.prepareStatement(sql);

			// 4b. SQL문을 실행하고 결과집합 저장
			rs = pstmt.executeQuery();

			// 4c. 결과집합 처리
			sb.setLength(0);
			while (rs.next()) {
				sb.append(rs.getString(2)).append("\t").append(rs.getString(3)).append("\t").append(rs.getString(4))
						.append("\t").append(rs.getString(5)).append("\t").append(rs.getString(6)).append("\t")
						.append(rs.getString(7)).append("\t").append(rs.getString(8)).append("\t")
						.append(rs.getString(9)).append("\t").append(rs.getString(10)).append("\t").append("\n");
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5. 사용한 객체들을 모두 정리
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
