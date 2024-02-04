package calculator.calculatordemo;

import org.junit.jupiter.api.Test;

import static calculator.calculatordemo.CalculatorDemoApplicationTestsServ.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorDemoApplicationTests {
    private final CalculatorServis out = new CalculatorServis();


	@Test
	public void returnPlusTest1() {
		assertEquals(t3, out.plus(w1, t2));
	}
	@Test
	public void returnPlusTest2() {
		assertEquals(t2, out.plus(z0, t2));
	}
	@Test
	public void returnMultiplyTest1() {
		assertEquals(t2, out.multiply(t2, w1));
	}
	@Test
	public void returnMultiplyTest2() {
		assertEquals(t3, out.multiply(t3, w1));
	}
	@Test
	public void returnDivideTest1() {
		assertEquals(t2, out.divide(f4, t2));
	}
	@Test
	public void returnDivideTest2() {
		assertEquals(w1, out.divide(t2, t2));
	}
	@Test
	public void returnDivideZeroDivideExceptionTest3() {
		assertThrows(ZeroDivideException.class, () -> out.divide(t3, z0));
	}



}
