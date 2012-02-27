package main;

public class Calculator {

	private int aNumber;
	private int bNumber;
	
	public void setNumbers(int aNumber, int bNumber)
	{
		this.aNumber = aNumber;
		this.bNumber = bNumber;
		
	}
	
	public int getResult()
	{
		return aNumber + bNumber;
	}
}
