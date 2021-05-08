package InterfaceAbstractDemo.adapters;

import InterfaceAbstractDemo.abstracts.CustomerCheckService;
import InterfaceAbstractDemo.entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean check(Customer customer) {
		return true;
	}

}
