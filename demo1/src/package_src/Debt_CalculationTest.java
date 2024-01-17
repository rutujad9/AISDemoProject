package package_src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Debt_CalculationTest {

	@Test
	public void testMonthly_amount() {
		Debt_Calculation dc = new Debt_Calculation();
		assertEquals(0.0,dc.monthly_amount(0, 0));
		assertEquals(0.0,dc.monthly_amount(-100000, -12));
		assertEquals(1000.0,dc.monthly_amount(100000, 12));	
	}
	
	@Test
	public void testTotal_amount() {
		Debt_Calculation dc = new Debt_Calculation();
		assertEquals(0.0, dc.total_amount(0, 0, 0));
		assertEquals(0.0, dc.total_amount(-100000, -12, -16));
		assertEquals(116000.0, dc.total_amount(100000, 12, 16));
	}

}
