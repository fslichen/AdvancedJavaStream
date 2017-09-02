package evolution.flatMap;

import java.util.Arrays;

import org.junit.Test;

public class AnyClass {
	@Test
	public void test() {
		AnyEntity anyEntity0 = new AnyEntity(Arrays.asList(new AnotherEntity("Chen"), new AnotherEntity("Ling")));
		AnyEntity anyEntity1 = new AnyEntity(Arrays.asList(new AnotherEntity("Bob"), new AnotherEntity("Ann")));
		// Flat map handles the one to many relationship
		// Flat map becomes useful when there are embedded lists.
		Arrays.asList(anyEntity0, anyEntity1).stream().flatMap(x -> x.getAnotherEntities().stream()).forEach(System.out::println);
	}
}
