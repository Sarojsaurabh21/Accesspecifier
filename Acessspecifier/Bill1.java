package Acessspecifier;


public class Bill1 {
	private int billNumber;
	private int noofunits;
	private int costperunit;
	public Bill1()
	{
		
	}
	public Bill1(int billNumber,int noofunits,int costperunit)
	{
		this.billNumber=billNumber;
		this.noofunits=noofunits;
		this.costperunit=costperunit;
		
	}
	public double calculateBill()
	{
		return noofunits*costperunit;
		
	}
	public String toString()
	{
		return "Bill="+billNumber+"noofunits="+noofunits+"costperunit="+costperunit;
	}

}
