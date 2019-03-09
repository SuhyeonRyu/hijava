package hijava.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamMain {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(100, "Hong100"));
		students.add(new Student(20, "Lim20"));
		students.add(new Student(5, "Lee5"));
		
		students.stream().map(s -> s.getName()).forEach(n -> System.out.println("s=" + n));
		
		students.stream().mapToInt(s -> s.getId()).sum();
		
		System.out.println(students);
		System.out.println("----------------------------");
		Collections.sort(students, new Sorting());
		System.out.println(students);

		
			
	}
}