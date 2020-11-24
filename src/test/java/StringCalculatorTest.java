import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void test1() {
		StringCalculator strcalc1 = new StringCalculator();
		int act = strcalc1.add("//;\n1;2;7");
		int exp = 10;
		assertEquals(exp,act);
	}
	
	@Test
	void test2() {
		StringCalculator strcalc2 = new StringCalculator();
		int act = strcalc2.add("//-\n1-2-7");
		int exp = 10;
		assertEquals(exp,act);
	}
	
	@Test
	void test3() {
		StringCalculator strcalc3 = new StringCalculator();
		int act = strcalc3.add("2,3\n,5,9");
		int exp = 19;
		assertEquals(exp,act);
	}
	
	@Test
	void testforexception() {
		StringCalculator strcalcn = new StringCalculator();
		strcalcn.add("//;\n-1;-2");
	}

}
