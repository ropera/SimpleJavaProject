package fit;

import fit.ColumnFixture;
import main.Calculator;

public class CalculationResultFixture extends ColumnFixture {

	public int aNumber;
	public int bNumber;
	public Calculator aCalculator;
	
	public int calcResult()
	{
		
		aCalculator = new Calculator();
		
		int result;
		
		aCalculator.setNumbers(aNumber, bNumber);
		result = aCalculator.getResult();
		return result;	
		
	}
	
	
}
