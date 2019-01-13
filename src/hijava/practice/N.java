package hijava.practice;

public class N {

	int x = 10;
	int y = 20;
    int c ;
		
	public void swap() {
	
		c = y;
		y = x;
		x = c;
		
	}
		
	public static void main(String[] args) {
		N n = new N();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.x);
		n.swap();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.x);
		}

}
