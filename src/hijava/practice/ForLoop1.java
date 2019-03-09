package hijava.practice;

public class ForLoop1 {

	public static void main(String[] args) {
		// 2 ~ 9 Loop
		// 1 ~ 9 Loop
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + " 단 ------ ");
			for (int j = 1; j <= 9; i++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

}
