package fatalvirus.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import project.v1.SungJukVO;

public class SungJukJDBC_Update {

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
			rs = pstmt.executeQuery(); // select

			List<SungJukVO2> sjlist = new ArrayList<>();
			while (rs.next()) {
				SungJukVO2 sj = new SungJukVO2();
				sj.setSjno(rs.getString("sjno"));
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));
				sj.setRegdate( // 2017.12.18 11:12:13
						rs.getString("regdate").substring(0, 10));
				sjlist.add(sj);
			}

			for (SungJukVO2 sj : sjlist) {
				System.out.println(sj);
			}

			System.out.print("수정할 학생번호를 입력하세요.");
			int sjno = sc.nextInt();
			System.out.println("수정할 데이터를 입력하세요. (이름/국어/영어/수학)");
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("국어: ");
			int kor = sc.nextInt();
			System.out.print("영어: ");
			int eng = sc.nextInt();
			System.out.print("수학: ");
			int mat = sc.nextInt();

			pstmt = conn.prepareStatement(updateSQL);
			pstmt.setString(1, name);
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, mat);
			pstmt.setInt(5, sjno);

			int cnt = pstmt.executeUpdate(); // insert, update, delete

			System.out.println(cnt + "건의 데이터 수정 완료!");

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

class SungJukVO2 extends SungJukVO {
	private String sjno;
	private String regdate;

	public String getSjno() {
		return sjno;
	}

	public void setSjno(String sjno) {
		this.sjno = sjno;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		String fmt = "SungJukVO [sjno=%s, name=%s, kor=%d, eng=%d, mat=%d, tot=%d, avrg=%.1f, grd=%s, regdate=%s]";
		return String.format(fmt, sjno, getName(), getKor(), getEng(), getMat(), getTot(), getAvrg(), getGrd(),
				regdate);
	}
}