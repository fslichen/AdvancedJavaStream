package evolution.collect;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class Average {
	@Test
	public void test() {
		double average = Arrays.asList(new AnyEntity("Chen", "M"), new AnyEntity("Chen", "F"), new AnyEntity("Ling", "M"), new AnyEntity("Ling", "F"))
		.stream().collect(Collectors.averagingDouble(x -> x.getName().length()));
		System.out.println(average);
		long count = Stream.of(0, 3, 7, 5, 4, 2, 3).collect(Collectors.counting());
		System.out.println(count);
	}
}
