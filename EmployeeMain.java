import java.util.*;

public class EmployeeMain {
	public static void main(String[] args)
	{
		Employee e[]=new Employee[3];
		e[0]=new Employee(01,"ram",1500.0);
		e[0].addsalary(2000);
		e[1]=e[0];
		
		
		Manager m1=new Manager(03,"ted");
		e[2]=m1;
		m1.addManagedEmployee(e[0]);
		
		for(int i=0;i<3;i++) {
		
		System.out.println("id="+e[i].getId()+"name="+e[i].getName()+"salary="+e[i].getBalance());
		}
		/*EmployeeMain m=new EmployeeMain();
		m.printt(e);*/
	}
	/*void printt(Employee[] e1){
			for(int i=0;i<3;i++) {
				
				System.out.println("id="+e1[i].getId()+"name="+e1[i].getName()+"salary="+e1[i].getBalance());
			}
			
		}*/	
}
		
		
		
		
		
	

