import java.util.ArrayList;

public class exceptionHandle extends Exception {
	String fin = "";
	//public int flag = 0;
	public exceptionHandle(String s, int flag) {
		String substr = s.substring(0,2);
		ArrayList<String> starr = new ArrayList<String>();
		if(substr.equals("//")) {
			String ch = Character.toString(s.charAt(2));
			ch = ch + "|\n";
			String sub = s.substring(3,s.length());
			String str[] = sub.split(ch);
			for(String a : str) {
				if(a != "") {
					int x = Integer.parseInt(a);
					if(x < 0) {
						flag = 1;
						starr.add(a);
					}
				}
			}
		}
		else {
			String str[] = s.split(",|\n");
			for(String a : str) {
				if(a!="") {
					int x = Integer.parseInt(a);
					if(x<0) {
						flag = 1;
						starr.add(a);
					}
				}
			}
		}
		for(String a : starr) {
			fin = fin + a;
		}
	}
	
	public String toString() {
		if(fin.length() > 0) {
			return ("negatives not allowd : " + fin);
		}
		else {
			return "";
		}
	}
}
