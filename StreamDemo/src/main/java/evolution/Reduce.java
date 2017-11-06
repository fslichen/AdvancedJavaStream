package evolution;

import java.util.Arrays;

import org.junit.Test;

public class Reduce {
	@Test
	public void test0() {// Concatenate
		Arrays.asList("a", "b", "c")
		.stream().map(x -> x + "d").reduce((x, y) -> x + "," + y).ifPresent(System.out::println);
	}
	
	@Test
	public void test1() {// Factorial
		int product = Arrays.asList(1, 2, 3, 4, 5)
		.parallelStream().reduce((x, y) -> x * y).get();
		System.out.println(product);
	}
}
