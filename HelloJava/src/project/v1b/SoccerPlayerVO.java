package project.v1b;

public class SoccerPlayerVO {
	private String name;
	private String team;
	private String hometown;
	private String position;
	private int no;
	private String birthDate;
	private int height;
	private int weight;

	public SoccerPlayerVO() {
	}

	public SoccerPlayerVO(String name, String team, String hometown, String position, int no, String birthDate,
			int height, int weight) {
		this.name = name;
		this.team = team;
		this.hometown = hometown;
		this.position = position;
		this.no = no;
		this.birthDate = birthDate;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		String fmt = "SoccerPlayerVO [name=%s, team=%s, hometown=%s, position=%s, no=%d, birthDate=%s, height=%d, weight=%d]";
		return String.format(fmt, name, team, hometown, position, no, birthDate, height, weight);
	}
}
