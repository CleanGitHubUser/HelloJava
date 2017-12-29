package fatalvirus.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SungJukJDBC_Insert {

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

		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 학생 성적을 입력하세요 (이름/국어/영어/수학)");
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int mat = sc.nextInt();

		// 총점/평균/학점 처리
		int tot = kor + eng + mat;
		double avrg = (double) tot / 3;
		String grd = "가";
		switch ((int) avrg / 10) {
		case 10:
		case 9:
			grd = "수";
			break;
		case 8:
			grd = "우";
			break;
		case 7:
			grd = "미";
			break;
		case 6:
			grd = "양";
			break;
		default:
			break;
		}

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
			pstmt = conn.prepareStatement(insertSQL);
			pstmt.setString(1, name);
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, mat);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avrg);
			pstmt.setString(7, grd);

			// 4.
			int cnt = pstmt.executeUpdate(); // insert, update, delete

			System.out.println(cnt + "건의 데이터 추가 완료!");

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
