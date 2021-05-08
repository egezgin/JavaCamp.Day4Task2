package InterfaceAbstractDemo.concretes;

import InterfaceAbstractDemo.abstracts.CustomerCheckService;
import InterfaceAbstractDemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean check(Customer customer) {
		return true;
	}

}
