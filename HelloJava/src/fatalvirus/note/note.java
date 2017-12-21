package fatalvirus.note;

public class note {

	public static void main(String[] args) {

		Child1 c1 = new Child1();

	}
}

class Child1 {
	int x = 3000;

	Child1() {
		this(1000);
	}

	Child1(int x) {
		this.x = x;
	}
}