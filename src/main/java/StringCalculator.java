
public class StringCalculator {
	public int add(String num) {
		if(num == "") {
			return 0;
		}
		int sum = 0;
		int flag = 0;
		try {
			String substr = num.substring(0,2);
			if(substr.equals("//")) {
				String ch = Character.toString(num.charAt(2));
				ch = ch + "|\n";
				String sub = num.substring(3,num.length());
				String str[] = sub.split(ch);
				for(String a : str) {
					if(!a.equals("")) {
						int x = Integer.parseInt(a);
						sum = sum + x;
					}
				}
			}
			else {
				String str[] = num.split(",|\n");
				for(String a : str) {
					if(a != "") {
						int x = Integer.parseInt(a);
						sum = sum + x;
					}
				}
			}
			throw new exceptionHandle(num,flag);
		}
		catch(exceptionHandle e) {
			System.out.println(e);
		}
		if(flag == 0) {
			return sum;
		}
		else {
			return -1;
		}
	}
}
