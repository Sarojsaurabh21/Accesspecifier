package Acessspecifier;

public class Employee {
	private int ID;
	private int name;
	private  int salary;
	private int pf;
	
	public void Emplyeedetail(int ID,int name)
	{
		this.ID=ID;
		this.name=name;
		
		//System.out.println("Employee ID="+ID);
	//	System.out.println("Employee Name="+name);
		
	}
	public void Employeedetail2(int salary,int pf)
	{
		this.salary=salary;
		this.pf=pf;
		
	/*	System.out.println("Employee salary"+salary);
		System.out.println("Employee pf"+pf);*/
	}
	
/*	public void setID(int ID,String name)
	{
		this.ID=ID;
		this.name=name;
	}
	
	
public void getID()
{
	System.out.println(ID);
 System.out.println(name);
}*/
	public double annualsalary()
	{
		return salary*12;
	}
	
	public String toString()
	{
		return "E1="+ID+"Name"+name+"sa"+salary+"pf"+pf+"anualsalary="+annualsalary();
	}
	
}
