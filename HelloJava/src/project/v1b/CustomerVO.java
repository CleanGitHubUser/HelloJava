package project.v1b;

public class CustomerVO {

	private int no;
	private String name;
	private String resiNo;
	private String adrr;
	private String tellNo;

	public CustomerVO() {
	}

	public CustomerVO(int no, String name, String resiNo, String adrr, String tellNo) {
		this.no = no;
		this.name = name;
		this.resiNo = resiNo;
		this.adrr = adrr;
		this.tellNo = tellNo;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResiNo() {
		return resiNo;
	}

	public void setResiNo(String resiNo) {
		this.resiNo = resiNo;
	}

	public String getAdrr() {
		return adrr;
	}

	public void setAdrr(String adrr) {
		this.adrr = adrr;
	}

	public String getTellNo() {
		return tellNo;
	}

	public void setTellNo(String tellNo) {
		this.tellNo = tellNo;
	}

	@Override
	public String toString() {
		String fmt = "CustomerVO [no=%d, name=%s, resiNo=%s, adrr=%s, tellNo=%s]";
		return String.format(fmt, no, name, resiNo, adrr, tellNo);
	}

}
