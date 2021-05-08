package InterfaceAbstractDemo;

import java.time.LocalDate;

import InterfaceAbstractDemo.abstracts.CustomerManager;
import InterfaceAbstractDemo.adapters.MernisServiceAdapter;
import InterfaceAbstractDemo.concretes.*;
import InterfaceAbstractDemo.entities.Customer;

public class Output {

	public static void main(String[] args) throws Exception {
		CustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Engin", "Dermiog", LocalDate.of(1985, 1, 6), "28861499108"));
	}

}
