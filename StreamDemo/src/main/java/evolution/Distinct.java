package evolution;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.junit.Test;

public class Distinct {
	@Test
	public void test() {
		IntStream.of(0, 0, 1, 1, 2, 3).distinct().forEach(System.out::println);
		Arrays.asList("Hello", "Hello", "World", "Java", "Developer").stream().distinct().forEach(System.out::println);
	}
}
