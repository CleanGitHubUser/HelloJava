package fatalvirus;

public class Interfaces {

	public static void main(String[] args) {

		// 인터페이스 - 객체화 불가 클래스
		// 인터페이스를 구현한 클래스를 통해 객체화 가능
		// ISungJukService isjsrv = new ISungJukService();
		SungJukServiceImpl sjsrv = new SungJukServiceImpl();
		sjsrv.getTotal();
		sjsrv.getAverage();
		sjsrv.getGrade();

		// 추상클래스 객체 생성 가능?
		// 추상메서드를 포함한 클래스를 의미 - 객체화 불가!
		// AbstractClass ac = new AbstractClass();
		// 추상클래스의 객체화는 상속을 통해 가능!
		CompleteClass cc = new CompleteClass();
	}

}

interface ISungJukService {
	int tot = 0; // 상수 (초기화 필요!)
	double avg = 0.0;

	abstract void getTotal(); // 추상메서드

	void getAverage();

	void getGrade();
}

class SungJukServiceImpl implements ISungJukService {

	@Override
	public void getTotal() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAverage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getGrade() {
		// TODO Auto-generated method stub

	}

}

abstract class AbstractClass {

}

class CompleteClass extends AbstractClass {

}

class Unit {

}

interface Fightable {
	void move(int x, int y);

	void attack(Unit u);
} // 미완된 메서드 포함

class Firebat implements Fightable {
	@Override
	public void move(int x, int y) {
	}

	@Override
	public void attack(Unit u) {
	}
} // 완전한 메서드 포함

// 인터페이스를 구현하는 중
// 인터페이스의 모든 추상메서드를 구현할 필요가 없으면
// 추상클래스로 만들면 된다!!
abstract class Medic implements Fightable {
	@Override
	public void move(int x, int y) {
	}
} // 일부 완전한 메서드 포함