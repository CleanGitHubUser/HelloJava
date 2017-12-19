package fatalvirus.note;

public class Exercise6_9 {

	public static void main(String[] args) {

	}

}

class Marine {
	int x = 0, y = 0; // Marine의 위치좌표 (x,y)
	int hp = 60; // 현재 체력
	static int weapon = 6; // 공격력
	static int armor = 0; // 방어력

	static void weaponUp() {
		weapon++;
	}

	static void armorUp() {
		armor++;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 공격력과 방어력은 개체에 상관없이 동일하므로
	// 클래스 변수와 메서드로 지정해서 개체가 없어도 확인 할 수 있어야한다.
	// 위치좌표와 현재 체력, 이동 위치는 개체별로 다를 것이기 때문에
	// 인스턴스 변수와 메서드로 지정해야한다.
}