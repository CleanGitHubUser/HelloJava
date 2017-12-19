package fatalvirus.note;

public class Exercise6_1 {

}

class SutdaCard {
	private int num; // 카드의 숫자.(1~10사이의 정수)
	private boolean isKwang; // 광(光)이면, true, 아니면 false

	public SutdaCard() {
		this(1, true);
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isKwang() {
		return isKwang;
	}

	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return "SutdaCard [num=" + num + ", isKwang=" + isKwang + "]";
	}

	public String info() {
		if (isKwang)
			return getNum() + "K";
		else
			return getNum() + "";
	}
}
