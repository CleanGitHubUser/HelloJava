package project.v1b;

public interface SoccerPlayerService {
	public void addSoccerPlayer(SoccerPlayerVO sp);

	public String getSoccerPlayer();

	public String getSoccerPlayer(String name);

	public void modifySoccerPlayer(String name);

	public void removeSoccerPlayer(String name);

}
