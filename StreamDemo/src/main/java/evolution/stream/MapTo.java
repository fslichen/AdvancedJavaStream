package evolution.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

public class MapTo {
	@Test
	public void test0() {
		Stream.of("a1", "a2", "a3")
		.map(x -> x.substring(1))
		.mapToInt(Integer::parseInt)
		.max()
		.ifPresent(System.out::println);
	}

	@Test
	public void test1() {
		IntStream.range(1, 4)
		.mapToObj(x -> "a" + x)
		.forEach(System.out::println);
	}

	@Test
	public void test2() {
		Arrays.stream(new int[] {1, 2, 3})
		.map(n -> 2 * n + 1)
		.average()
		.ifPresent(System.out::println);
	}
	
	@Test
	public void test3() {
		Stream.of(1.0, 2.0, 3.0)
		.mapToInt(Double::intValue)
		.mapToObj(x -> "a" + x)
		.forEach(System.out::println);
	}
	
	@Test
	public void test4() {
		Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue).forEach(System.out::println);
	}
}
