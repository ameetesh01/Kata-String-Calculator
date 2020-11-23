import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void test1() {
		StringCalculator strcalc1 = new StringCalculator();
		int act = strcalc1.add("1\n1,2");
		int exp = 4;
		assertEquals(exp,act);
	}
	

}
