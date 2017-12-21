package fatalvirus.note;

public class Exercise7_17 {

	public static void main(String[] args) {

	}

}

class Unit717 {
	int x, y;

	void move(int x, int y) {
		/* 지정된 위치로 이동 */ }

	void stop() {
		/* 현재 위치에 정지 */ }

}

class Marine717 extends Unit717 { // 보병

	void stimPack() {
		/* 스팀팩을 사용한다. */}
}

class Tank717 extends Unit717 { // 탱크

	void changeMode() {
		/* 공격모드를 변환한다. */}
}

class Dropship extends Unit717 {
	void load() {
		/* 선택된 대상을 태운다. */ }

	void unload() {
		/* 선택된 대상을 내린다. */ }
}