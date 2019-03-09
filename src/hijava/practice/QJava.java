package hijava.practice;

public class QJava {

	public static void main(String[] args) {
	       int total = 0;
	       
	       for (int num = 2; num <= 100; num++) {
			   boolean isPrime = true;
			   //  나누어 떨어는 경우 목이 없는 경우 = true  or 나머지가 생기는 경우 소수
			   for (int j = 2; j < num; j++) {
				    if (num % j == 0) {
					 isPrime = false;
					 break;
			   // 조건문 반복 중단 
				 }  
			 }
			 
			 if (isPrime)
				 total += num;
			 else
				System.out.println(num + " is Prime Number!!");
		       }
	
	       System.out.println("Total is : " + total);

	}
}
