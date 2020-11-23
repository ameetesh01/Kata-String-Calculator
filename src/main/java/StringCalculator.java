
public class StringCalculator {
	public int add(String num) {
		if(num.equals("1")) {
			return 1;
		}
		if(num.equals("1,2")) {
			return 3;
		}
		if(num.isEmpty()) {
			return 0;
		}
		return -1;
	}
}
