package hijava.practice;

public class QJava {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 100; i++) {
		
			boolean isPrime = true;
			
			int total = 0;
			for(int j = 2; j <= (i-1); j++) {
				
					if (i % j == 0) {
					isPrime = false;
					break;
					
					}
					
					if (isPrime) total += i;
					
			}
			
		System.out.println( );
	}
}
}