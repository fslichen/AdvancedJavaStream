package evolution.entitySort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class AnyClass {
	@Test
	public void test() {
		AnyEntity anyEntity0 = new AnyEntity("Chen", 27, 8000d);
		AnyEntity anyEntity1 = new AnyEntity("Ling", 26, 7000d);
		AnyEntity anyEntity2 = new AnyEntity("Bob", 39, 4000d);
		AnyEntity anyEntity3 = new AnyEntity("Ann", 43, 15000d);
		AnyEntity anyEntity4 = new AnyEntity("", 52, 3000d);
		AnyEntity anyEntity5 = new AnyEntity("Li", 27, 9000d);
		List<AnyEntity> anyEntities = Arrays.asList(anyEntity0, anyEntity1, anyEntity2, anyEntity3, anyEntity4, anyEntity5);
		List<AnyEntity> sortedEntities = anyEntities.stream().filter(x -> x.getSalary() > 5000d)
		.sorted((x, y) -> Integer.compare(y.getAge(), x.getAge()))// Descending Order
		.collect(Collectors.toList());
		System.out.println(sortedEntities);
	}
}
