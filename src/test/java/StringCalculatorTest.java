import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void test1() {
		StringCalculator strcalc1 = new StringCalculator();
		int act = strcalc1.add("//;\n1;2");
		int exp = 3;
		assertEquals(exp,act);
	}
	

}
