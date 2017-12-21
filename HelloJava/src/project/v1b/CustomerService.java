package project.v1b;

public interface CustomerService {
	void addCustomer(CustomerVO c);

	String getCustomer();

	String getCustomer(String name);

	void modifyCustomer(String name);

	void removeCustomer(String name);

}
