package project.v1b;

public class SoccerPlayerServiceMain {

	public static void main(String[] args) {

		SoccerPlayerService sps = new SoccerPlayerServiceImpl();

		SoccerPlayerVO sp = new SoccerPlayerVO("최강조", "일화천마", "성남", "MF", 6, "90/01/24", 165, 57);

		sps.addSoccerPlayer(sp);
		System.out.println(sp);

		sps.getSoccerPlayer();

		sps.getSoccerPlayer("최강조");

		sps.modifySoccerPlayer("최강조");

		sps.removeSoccerPlayer("최강조");

	}

}
