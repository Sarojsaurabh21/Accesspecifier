package Acessspecifier;

public class Sunady1 {

	public static void main(String[] args)
	{
		
	/*	Sunday s1=new Sunday(101,200,10);
		s1.billNumber=102;
		
		System.out.println(billNumber);
		System.out.println("Bill= "+s1);
		System.out.println("Bill= "+s1);
		System.out.println("calculatebill="+s1.calculatebill());*/
		Sunday s=new Sunday(122,33,80);
		System.out.println(s);
	System.out.println(s.calculatebill());
	Sunday s2=new Sunday();
	s2.setBillnumber(103);
	s2.setNoofcost(200);
	System.out.println(s2.get());
	System.out.println(s2.getBillnumber());
	
	
	
		
	}

}
