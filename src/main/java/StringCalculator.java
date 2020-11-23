
public class StringCalculator {
	public int add(String num) {
		if(num == "") {
			return 0;
		}
		int sum = 0;
		String[] str = num.split(",\n",0);
		for(String a : str) {
			if(a != "") {
				int x = Integer.parseInt(a);
				sum = sum + x;
			}
		}
		return sum;
	}
}
