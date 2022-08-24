package Acessspecifier;

public class Mathoperation {
	int x;
	int y;
	int addtion()
	{
		int sum=x+y;
		return sum;
		
	}
	int subtraction()
	{
		int sub=x-y;
		return sub;
	}
	int multifilcation()
	{
		int mul=x*y;
		return mul;
	}
	int divtion()
	{
		int div=x/y;
		return div;
	}
	 public String toString()
	{
		//return "ADD="+sub+"SUB="+sub+"MUL="+mul+"DIV="+div;
		return "ADD="+addtion()+"SUB="+subtraction()+"MUL="+multifilcation()+"DIV="+divtion();
	
	}

}
