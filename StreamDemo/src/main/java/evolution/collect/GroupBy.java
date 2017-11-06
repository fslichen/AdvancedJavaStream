package evolution.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Test;

public class GroupBy {
	@Test
	public void test() {
		Map<String, List<AnyEntity>> map = Arrays.asList(new AnyEntity("Chen", "M"), new AnyEntity("Chen", "F"), new AnyEntity("Ling", "M"), new AnyEntity("Ling", "F"))
		.stream().collect(Collectors.groupingBy(AnyEntity::getName));
		System.out.println(map);
	}
}
