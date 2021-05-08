package InterfaceAbstractDemo.abstracts;

import InterfaceAbstractDemo.entities.Customer;

public abstract class CustomerManager implements CustomerService {
	public void save(Customer customer) throws Exception
	{
		System.out.println("saved to database: " + customer.getFirstName() + ".");
	}
}
