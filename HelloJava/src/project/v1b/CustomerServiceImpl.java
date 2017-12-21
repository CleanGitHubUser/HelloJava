package project.v1b;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void addCustomer(CustomerVO c) {
		System.out.println("고객 정보가 입력되었습니다.");
	}

	@Override
	public String getCustomer() {
		String out = "고객 정보를 출력합니다.";
		return out;
	}

	@Override
	public String getCustomer(String name) {
		return name;
	}

	@Override
	public void modifyCustomer(String name) {
		System.out.println("고객 정보가 수정되었습니다.");
	}

	@Override
	public void removeCustomer(String name) {
		System.out.println("고객 정보가 삭제되었습니다.");
	}

}
