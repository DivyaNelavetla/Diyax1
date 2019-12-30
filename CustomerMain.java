package entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import ui.Customer;

public class CustomerMain {
	public static void main(String[] args) {
		//Customer[] a=new Customer[4];
		Customer a0=new Customer("1234","A",1000);
		Customer a1=new Customer("2341","B",2000);
		Customer a2=new Customer("3412","C",3000);
		Customer a3=new Customer("4321","D",4000);
		a1.transferamt(a2,50);
		Map<String,Customer> m= new HashMap<>();
		m.put(a0.getMobileno(),a0);
		m.put(a1.getMobileno(),a1);
		m.put(a2.getMobileno(),a2);
		m.put(a3.getMobileno(),a3);
		
		
		CustomerMain ex = new CustomerMain();
		ex.fetchbymobile(m,"2341");
		ex.print(m);
	}

	

	public void fetchbymobile(Map<String,Customer> m1,String s) {
	Customer m2=m1.get(s);
	System.out.println(m2.getMobileno()+" "+m2.getName() + " " + m2.getBalance());
	}
	
	public void print(Map<String,Customer> m1) {
		  Set<String> keys=m1.keySet();
		  for(String k:keys)
		  {
			  Customer c1=m1.get(k);
			  System.out.println(c1.getMobileno()+" "+c1.getName() + " " + c1.getBalance());
		  }
		  
	  }
	

}
