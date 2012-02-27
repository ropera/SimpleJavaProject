package test;

import junit.framework.TestCase;
import main.Calculator;

public class CalculatorTest extends TestCase{

	public Calculator aCalculator;
	
	public void setUp(){
		aCalculator = new Calculator();
	}
	
	public void testCalculateResult()
	{
		aCalculator.setNumbers(2,5	);
		aCalculator.getResult();
		
		assertEquals(4, aCalculator.getResult());
		
	}
	
	public void testCalculateResult2()
	{
		aCalculator.setNumbers(3,5);
		
		assertEquals(8, aCalculator.getResult());
	}
	
}
