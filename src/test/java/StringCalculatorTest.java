import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	StringCalculator strcalc = new StringCalculator();
	

	@Test
	void test1() {
		int act = strcalc.add("//;\n1;2;7");
		int exp = 10;
		assertEquals(exp,act);
	}
	
	@Test
	void test2() {
		int act = strcalc.add("//-\n1-2-7");
		int exp = 10;
		assertEquals(exp,act);
	}
	
	@Test
	void test3() {
		int act = strcalc.add("2,3\n,5,9");
		int exp = 19;
		assertEquals(exp,act);
	}
	
	@Test
	void testforexception() {
		strcalc.add("//;\n-1;-2");
	}
	
	@Test
	void getCount() {
		int act = strcalc.getCalledCount();
		int exp = 4;
		assertEquals(exp,act);
	}

}
