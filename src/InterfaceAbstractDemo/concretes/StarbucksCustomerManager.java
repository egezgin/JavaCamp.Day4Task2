package InterfaceAbstractDemo.concretes;

import InterfaceAbstractDemo.abstracts.CustomerCheckService;
import InterfaceAbstractDemo.abstracts.CustomerManager;
import InterfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends CustomerManager{
	public CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		if (this.customerCheckService.check(customer))
		{
			super.save(customer);
		}
		else
		{
			throw new Exception("Not a valid person.");
		}
	}

}
