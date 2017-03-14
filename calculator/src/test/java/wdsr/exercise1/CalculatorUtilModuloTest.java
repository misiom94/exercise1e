package wdsr.exercise1;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.eq;



import wdsr.exercise1.logic.Calculator;

public class CalculatorUtilModuloTest {
	private Calculator calculator;
	private CalculatorUtil calcUtil;
	

	@Before
	public void init() {
		calculator = Mockito.mock(Calculator.class);
		calcUtil = new CalculatorUtil(calculator);
	}

	@Test(expected=ArithmeticException.class)
	public void testModuloByZero() {
		//given
		doThrow(new ArithmeticException()).when(calculator).modulo(anyInt(),eq(0));
		//when
		calculator.modulo(anyInt(), eq(0));
		//then
		//empty - expected exception
		
		
	}	
}
