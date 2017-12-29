package project.v4;

import java.util.List;

public interface SungJukDAO {

	void insertSungJuk(SungJukVO sj); // 성적추가

	List<SungJukVO> selectSungJuk(); // 성적 전체조회

	SungJukVO selectSungJuk(int sjno); // 성적 상세조회

	void updateSungJuk(SungJukVO sj, int no); // 성적수정

	void deleteSUngJuk(int sjno); // 성적삭제
}
