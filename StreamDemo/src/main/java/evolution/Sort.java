package evolution;

import java.util.Comparator;
import java.util.stream.Stream;

import org.junit.Test;

public class Sort {
	@Test
	public void test() {
		Stream.of(0, 1, 2, 3).sorted((x, y) -> Integer.compare(y, x)).forEach(System.out::println);// Descending Order
		Stream.of(0, 1, 2, 3).sorted(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}}).forEach(System.out::println);
		Comparator<Integer> comparable = (x, y) -> Integer.compare(y, x);// Comparator is a functional interface.
		Stream.of(0, 1, 2, 3).sorted(comparable).forEach(System.out::println);
	}
}
