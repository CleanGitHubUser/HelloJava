package project.v1b;

public class SoccerPlayerServiceImpl implements SoccerPlayerService {

	@Override
	public void addSoccerPlayer(SoccerPlayerVO sp) {
		System.out.println("축구선수 정보가 추가되었습니다.");
	}

	@Override
	public String getSoccerPlayer() {
		return null;
	}

	@Override
	public String getSoccerPlayer(String name) {
		return null;
	}

	@Override
	public void modifySoccerPlayer(String name) {
		System.out.println("축구선수 정보가 수정되었습니다.");
	}

	@Override
	public void removeSoccerPlayer(String name) {
		System.out.println("축구선수 정보가 삭제되었습니다.");
	}

}
