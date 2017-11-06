package evolution;

import java.util.Arrays;

import org.junit.Test;

public class Find {
	@Test
	public void test() {
		Arrays.asList("Hello", "World").stream().findFirst().ifPresent(System.out::println);
		Arrays.asList("Hello", "World").stream().findAny().ifPresent(System.out::println);
	}
}
