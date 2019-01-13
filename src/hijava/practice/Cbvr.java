package hijava.practice;

// test

public class Cbvr {
	int m = 2;
	
	public static void main(String[] args) {
	
		int i = 1;
		System.out.println("i1=" + i); // 1
		
		change1(i);
		System.out.println("i2=" + i); // 1
		
		Cbvr cb1 = new Cbvr();
		System.out.println("cb1=" + cb1.m); 
		
		change2(cb1);
		System.out.println("cb2=" + cb1.m);
	}

	private static void change2(Cbvr cb) {
		cb.m = 100;
		}

	private static void change1(int x) {
		System.out.println("x=" + x);
		
		x = 100;
	}
	
}
