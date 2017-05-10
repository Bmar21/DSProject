package ds.model;

import java.util.Queue;
import java.util.LinkedList;

public class Customer 
{
	private Queue<Customer> Customer;
	
	public Customer()
	{
		Customer = new LinkedList<Customer>();
	}
}
