import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void test1() {
		StringCalculator strcalc1 = new StringCalculator();
		strcalc1.add("");
	}
	
	@Test
	void test2() {
		StringCalculator strcalc2 = new StringCalculator();
		strcalc2.add("1");
	}
	
	@Test
	void test3() {
		StringCalculator strcalc3 = new StringCalculator();
		strcalc3.add("2");
	}
	
	@Test
	void test4() {
		StringCalculator strcalc4 = new StringCalculator();
		strcalc4.add("1,2");
	}
	
	@Test
	void test5() {
		StringCalculator strcalc5 = new StringCalculator();
		strcalc5.add("1\n1,2");
	}

}
