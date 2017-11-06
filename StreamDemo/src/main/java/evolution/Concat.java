package evolution;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

public class Concat {
	@Test
	public void test() {
		Stream.concat(Arrays.asList("Hello", "World").stream(), Arrays.asList("Boy", "Girl").stream()).forEach(System.out::println);
	}
}
