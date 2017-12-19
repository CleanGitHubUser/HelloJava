package fatalvirus.note;

public class Print39 {

}

class Phone {
	private String manufact;
	private int price;
	private String commuType;

	public Phone() {
	}

	public Phone(String manufact, int price, String commuType) {
		this.manufact = manufact;
		this.price = price;
		this.commuType = commuType;
	}

	public String getManufact() {
		return manufact;
	}

	public void setManufact(String manufact) {
		this.manufact = manufact;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCommuType() {
		return commuType;
	}

	public void setCommuType(String commuType) {
		this.commuType = commuType;
	}

	@Override
	public String toString() {
		return "Phone [manufact=" + manufact + ", price=" + price + ", commuType=" + commuType + "]";
	}
}

class SmartPhone {
	private String manufact;
	private int price;
	private String cummuType;
	private String osVer;
	private int inMemorySize;
	private String camInstall;
	private String blutoothSupport;

	public SmartPhone() {
	}

	public SmartPhone(String manufact, int price, String cummuType, String osVer, int inMemorySize, String camInstall,
			String blutoothSupport) {
		this.manufact = manufact;
		this.price = price;
		this.cummuType = cummuType;
		this.osVer = osVer;
		this.inMemorySize = inMemorySize;
		this.camInstall = camInstall;
		this.blutoothSupport = blutoothSupport;
	}

	public String getManufact() {
		return manufact;
	}

	public void setManufact(String manufact) {
		this.manufact = manufact;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCummuType() {
		return cummuType;
	}

	public void setCummuType(String cummuType) {
		this.cummuType = cummuType;
	}

	public String getOsVer() {
		return osVer;
	}

	public void setOsVer(String osVer) {
		this.osVer = osVer;
	}

	public int getInMemorySize() {
		return inMemorySize;
	}

	public void setInMemorySize(int inMemorySize) {
		this.inMemorySize = inMemorySize;
	}

	public String getCamInstall() {
		return camInstall;
	}

	public void setCamInstall(String camInstall) {
		this.camInstall = camInstall;
	}

	public String getBlutoothSupport() {
		return blutoothSupport;
	}

	public void setBlutoothSupport(String blutoothSupport) {
		this.blutoothSupport = blutoothSupport;
	}

	@Override
	public String toString() {
		return "SmartPhone [manufact=" + manufact + ", price=" + price + ", cummuType=" + cummuType + ", osVer=" + osVer
				+ ", inMemorySize=" + inMemorySize + ", camInstall=" + camInstall + ", blutoothSupport="
				+ blutoothSupport + "]";
	}
}