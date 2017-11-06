package evolution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class ParallelStream {
	@Test
	public void test0() {// Parallels stream is faster.
		List<String> strings = Arrays.asList("b", "c", "a").parallelStream().sorted().collect(Collectors.toList());
		System.out.println(strings);
	}
}
