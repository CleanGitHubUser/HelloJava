package project.v3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SungJukServiceImpl implements SungJukService {

	private String fpath1 = "c:/Java/sungjuk.txt";
	// 파일입출력으로 저장시
	private String fpath2 = "c:/Java/sungjuk.dat";
	// 직렬화사용해서 저장시

	// 각종 오류 메세지를 상수로 정의해 둠
	private final String FILENOTFOUND = "\n파일이 존재하지 않습니다!\n";
	private final String FILEIOERROR = "\n기타 파일입출력 오류입니다!!\n";
	private final String ANYWAYERROR = "\n암튼 오류입니다!!\n";
	private final String WRONGINPUT = "\n잘못입력하셨습니다!!\n\n\n";

	// 성적데이터를 저장하기 위해 ArrayList 객체 사용

	private List<SungJukVO> sjdb = null;

	public SungJukServiceImpl() {
		sjdb = initSungJukFromFile(); // 파일입출력으로
		// sjdb = initSungJukFromSerialized();
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
			System.out.println(WRONGINPUT);
			return;
		}

		processSungJuk(sj); // 성적 재계산
		sjdb.set(no - 1, sj);
		// set(위치) : 컬렉션 객체 내
		// 특정 위치에 성적 객체를 저장

		System.out.println("성적데이터가 수정되었습니다.");
	}

	// 선택한 학생 성적데이터 삭제

	@Override
	public void removeSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println(WRONGINPUT);
			return;
		}

		sjdb.remove(no - 1);
		// remove(위치) : 컬렉션 객체 내
		// 특정 위치에 있는 성적 객체를 제거

		System.out.println("성적데이터가 삭제되었습니다.");

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

	// 프로그램 시작시 파일에서 직렬화된 성적데이터르 읽어 ArrayList에 저장
	private List<SungJukVO> initSungJukFromSerialized() {
		List<SungJukVO> sjdb = new ArrayList<SungJukVO>();

		try (FileInputStream fis = new FileInputStream(fpath2); ObjectInputStream ois = new ObjectInputStream(fis);
		// 직렬화를 이용하기 위해 input 스트림 객체 생성
		) {
			// 직렬화해서 저장된 파일을 역직렬화해서 메모리로 읽어들임
			sjdb = (List<SungJukVO>) ois.readObject();

		} catch (FileNotFoundException fnfe) {
			System.out.println(FILENOTFOUND);
		} catch (IOException ioe) {
			System.out.println(FILEIOERROR);
		} catch (Exception ex) {
			System.out.println(ANYWAYERROR);
		}
		return sjdb;
	}

	// 프로그램 시작시 파일에서 성적데이터를 읽어 ArrayList에 저장
	private List<SungJukVO> initSungJukFromFile() {
		List<SungJukVO> sjdb = new ArrayList<>();

		try (FileReader fr = new FileReader(fpath1); BufferedReader br = new BufferedReader(fr);
		// 파일에서 데이터를 읽기 위해 파일/버퍼 reader 객체 생성
		) {
			while (br.ready()) {
				// 파일에서 버퍼로 읽어올 데이터가 존재하는지 검사
				String[] sjrow = br.readLine().split("/");
				// 버퍼로 한 행을 읽어와서 그것을 "/"으로 나눈후 배열에 저장
				SungJukVO sj = new SungJukVO(sjrow[0], Integer.parseInt(sjrow[1]), Integer.parseInt(sjrow[2]),
						Integer.parseInt(sjrow[3]));
				sj.setTot(Integer.parseInt(sjrow[4]));
				sj.setAvrg(Double.parseDouble(sjrow[4]));
				sj.setGrd(sjrow[4]);

				sjdb.add(sj);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println(FILENOTFOUND);
		} catch (IOException ioe) {
			System.out.println(FILEIOERROR);
		} catch (Exception ex) {
			System.out.println(ANYWAYERROR);
		}

		return sjdb;
	}

	// 프로그램 종료시 처리해아할 작업 정의
	public void finalize() throws Throwable {

		writeSungJukFile();
		// writeSungJukToSerialized();

		super.finalize();
	}

	// 프로그램 종료시 ArrayList에 저장된 성적 데이터를 파일에 저장
	private void writeSungJukFile() {
		try (FileWriter fw = new FileWriter(fpath1); BufferedWriter bw = new BufferedWriter(fw);
		// 파일로 데이터를 쓰기 위해 파일/버퍼 writer 객체 생성
		) {
			StringBuffer out = new StringBuffer();

			for (SungJukVO sj : sjdb) {
				out.append(sj.getName()).append("/").append(sj.getKor()).append("/").append(sj.getEng()).append("/")
						.append(sj.getMat()).append("/").append(sj.getTot()).append("/").append(sj.getAvrg())
						.append("/").append(sj.getGrd()).append("\n");
				// 성적데이터 각 항목을 /로 구분지어 한 행을 만들고

				bw.write(out.toString());
				// 지정한 파일에 그것을 쓴다.
				out.setLength(0);
			} // for

		} catch (FileNotFoundException fnfe) {
			System.out.println(FILENOTFOUND);
		} catch (IOException ioe) {
			System.out.println(FILEIOERROR);
		} catch (Exception ex) {
			System.out.println(ANYWAYERROR);
		}
	} // writeSungJukFile

	// 프로그램 종료시 ArrayList에 저장된 성적 데이터를 직렬화 방식으로 파일에 저장
	private void writeSungJukToSerialized() {
		try (FileOutputStream fos = new FileOutputStream(fpath2); ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 직렬화를 이용하기 위해 output 스트림 객체 생성
		) {

			// a메모리에 저장된 객체를 직렬화해서 파일에 쓰기
			oos.writeObject(sjdb);
		} catch (FileNotFoundException fnfe) {
			System.out.println(FILENOTFOUND);
		} catch (IOException ioe) {
			System.out.println(FILEIOERROR);
		} catch (Exception ex) {
			System.out.println(ANYWAYERROR);
		}
	} // writeSungJukToSerialized
}
