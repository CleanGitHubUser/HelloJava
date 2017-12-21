package project.v1b;

public class CustomerMain {

	public static void main(String[] args) {

		CustomerService sc = new CustomerServiceImpl();

		CustomerVO c = new CustomerVO(1, "박지성", "810101-1xxxxx", "영국 런던", "000-5000-0001");

		sc.addCustomer(c);
		System.out.println(c);

		sc.modifyCustomer("박지성");

		sc.removeCustomer("박지성");

		sc.getCustomer();

		sc.getCustomer("박지성");
	}

}
