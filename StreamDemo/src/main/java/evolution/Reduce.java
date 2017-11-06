package evolution;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
	
	@Test
	public void test2() {
		Stream.of(0, 1, 2, 3, 4, 5).mapToInt(x -> x).sum();// Special case of reduce.
		IntStream.of(1, 2, 3, 4, 5).average().getAsDouble();
		IntStream.of(1, 2, 3, 4, 5).max().getAsInt();
		IntStream.of(1, 2, 3, 4, 5).min().getAsInt();
	}
	
	@Test
	public void test3() {
		Integer result = Stream.of(1, 2, 3, 4, 5, 6).reduce(0, Integer::sum);
		result = Stream.of(1, 2, 3, 4, 5, 6).reduce(0, (y, x) -> y + x);
		result = Stream.of(1, 2, 3, 4, 5, 6).reduce(0, new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		});
		System.out.println(result);
	}
}
