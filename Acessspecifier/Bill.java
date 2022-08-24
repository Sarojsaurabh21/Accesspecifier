package Acessspecifier;

public class Bill {
	private int billnumber;
	private int noofunits;
	private int costperunit;
	public Bill()
	{
		
	}
	
	public Bill(int billnumber,int noofunits,int costperunit)
	{
		this.billnumber=billnumber;
		this.noofunits=noofunits;
		this.costperunit=costperunit;
	}
	public double calculateBill()
	{
		return noofunits*costperunit;
	}
	public String toString()
	{
		return "Bill="+billnumber+"noofunits="+noofunits+"costperunit="+costperunit;
	}

}
