package ds.controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import ds.model.*;

public class DSController 
{
	private Stack<Pancakes> Pancakes;
	private Queue<Customer> Customer;
	
	public void Crackers(Stack pancake, int all)
	{
		pancake.push(new Integer(all));
		System.out.println("push(" + all +")");
		System.out.println("stack: " + pancake);
		pancake.pop();
		pancake.peek();
		
	}
	
	public void Customer()
	{
		Customer = new LinkedList<Customer>();
		Customer.addAll(Customer);
		Customer.remove();
	}
	
	public void start()
	{
		
	}

}
