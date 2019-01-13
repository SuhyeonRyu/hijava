package hijava.practice;

public class ConstLiteral {
	public static final int STU_NUM = 10;
	
	public static void main(String[] args) {
		final String s = "abc";
		add1(s);
		System.out.println(s);
	}		

public static void add1(String x) {
			 x = x + "1";
			 System.out.println(x);
	}
}
