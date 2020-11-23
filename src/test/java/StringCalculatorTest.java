import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void test1() {
		StringCalculator strcalc1 = new StringCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String st = sc.nextLine();
		System.out.print("Enter expected output: ");
		int exp = sc.nextInt();
		int act = strcalc1.add(st);
		sc.close();
		assertEquals(exp,act);
	}
	

}
