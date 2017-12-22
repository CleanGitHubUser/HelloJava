package project.v2;

import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukVO;

public class SungJukServiceImpl implements SungJukService {

	// 성적데이터를 저장하기 위해 ArrayList 객체 사용

	private List<SungJukVO> sjdb = null;

	// 생성자 (변수 초기화)
	public SungJukServiceImpl() {
		sjdb = new ArrayList<>();
	}

	// ArrayList에 성적 데이터 저장

	@Override
	public void addSungJuk(SungJukVO sj) {

		processSungJuk(sj); // 성적처리 - 총점, 평균, 학점

		sjdb.add(sj); // List객체에 성적데이터 저장
	}

	// 성적 데이터 전체 출력 : 번호/이름/국어/영어/수학

	@Override
	public String getSungJuk() {
		StringBuffer sb = new StringBuffer();
		String fmt = "%s %d %d %d \n";

		for (SungJukVO sj : sjdb) {
			sb.append(String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat()));
		}

		return sb.toString();
	}

	// 특정 학생의 성적 데이터 상세 출력 : 번호/이름/국어/영어/수학/총점/평균/학점

	@Override
	public String getSungJuk(int no) {
		// 입력받은 값이랑 실제 저장된 데이터 갯수와 비교
		// 잘못된 값 입력시 실행 중단 : return
		if (checkSungJukNo(no, sjdb.size()))
			return "\n잘못된 값 입력!!";

		SungJukVO sj = sjdb.get(no - 1);

		String fmt = "\n\n%d : %s %d %d %d %d %.1f %s";
		StringBuffer sb = new StringBuffer();
		sb.append(String.format(fmt, no, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(), sj.getTot(), sj.getAvrg(),
				sj.getGrd()));

		return sb.toString();
	}

	// 메뉴 선택값이 음수이거나
	// 실제 저장된 데이터 갯수보다
	// 큰 값이 입력되는 경우
	// 경고메세지 출력 후 메서드 실행종료
	private boolean checkSungJukNo(int no, int size) {
		boolean isFail = false;
		if (no <= 0 || (no > size)) {
			isFail = true;
		}
		return isFail;
	}

	// 선택한 학생 성적데이터 수정

	@Override
	public void modifySungJuk(SungJukVO sj, int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println("잘못입력하셨습니다.!\n\n");
			return;
		}

		processSungJuk(sj); // 성적 재계산
		sjdb.set(no - 1, sj);
		// set(위치) : 컬렉션 객체 내
		// 특정 위치에 성적 객체를 저장
	}

	// 선택한 학생 성적데이터 삭제

	@Override
	public void removeSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println("\n잘못입력하셨습니다!!\n\n\n");
			return;
		}

		sjdb.remove(no - 1);
		// remove(위치) : 컬렉션 객체 내
		// 특정 위치에 있는 성적 객체를 제거
	}

	private void processSungJuk(SungJukVO sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avg = (double) tot / 3;
		String grd = "가";
		switch ((int) avg / 10) {
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
		}

		sj.setTot(tot);
		sj.setAvrg(avg);
		sj.setGrd(grd);

	}
}
