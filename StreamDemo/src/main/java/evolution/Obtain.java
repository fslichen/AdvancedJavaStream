package evolution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

public class Obtain {
	@Test
	public void test() {
		// Stream can be obtained from collection.
		List<String> list = new LinkedList<>();
		list.stream();
		Set<String> set = new HashSet<>();
		set.stream();
		// Stream can also be obtained from array.
		Arrays.stream(new double[] {3, 4, 5, 6});
		Arrays.stream(new String[] {"Hello", "World"}).forEach(System.out::println);
		// Stream can also be obtained from static factory method.
		IntStream.of(0, 1, 2).forEach(System.out::println);// Don't mess it with .range()
		IntStream.range(0, 100);// A stream of 0 ~ 99.
	}
}
