
public class StringCalculator {
	public int add(String num) {
		if(num == "") {
			return 0;
		}
		int sum = 0;
		String str[] = num.split(",|\n");
		for(String a : str) {
			int x = Integer.parseInt(a);
			sum = sum + x;
		}
		return sum;
	}
}
