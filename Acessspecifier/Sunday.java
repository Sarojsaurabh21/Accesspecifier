package Acessspecifier;

public class Sunday {
	private int billNumber;
	private int noofunits;
	private int costperunit;
	
	 public Sunday()
	 {
		 
	 }
	 
	 public Sunday(int billNumber,int noofunits,int costperunit)
	 {
		 this.billNumber=billNumber;
		 this.noofunits=noofunits;
		 this.costperunit=costperunit;
		 System.out.println(billNumber);
		 
	 }
	 
	 public void setBillnumber(int billNumber)
	 {
		 this.billNumber=billNumber;
	 }
	 public  int getBillnumber()
	 {
		 return billNumber;
	 }
	 
	 
	 public void setNoofcost(int costperunits)
	 {
		 this.costperunit=costperunits;
	 }
	 public int getcostperunit()
	 {
		 return costperunit;
	 }
	 public void setnoofunits(int noofunits)
	 {
		 this.noofunits=noofunits;
	 }
	 public int get()
	 {
		 return noofunits;
	 }
	 public double calculatebill()
	 {
		 return noofunits*costperunit;
	 }
	 
	 public String toString()
	 {
		 return "BillNumber="+billNumber+"Noofunits="+noofunits+"costperunit="+costperunit;
	 }

}
