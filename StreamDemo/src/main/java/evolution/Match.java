package evolution;

import java.util.Arrays;

import org.junit.Test;

public class Match {
	@Test
	public void test8() {
		boolean atLeastOneStringStartsWithA = Arrays.asList("a", "b", "c", "d", "f")
		.stream().anyMatch(x -> x.startsWith("a"));
		System.out.println(atLeastOneStringStartsWithA);
	}
	
	@Test
	public void test9() {
		boolean allStringsStartWithA = Arrays.asList("apple", "abandon", "abnormal", "adjust", "appear")
		.stream().allMatch(x -> x.startsWith("a"));
		System.out.println(allStringsStartWithA);
	}
	
	@Test
	public void test10() {
		boolean noStringStartsWithB = Arrays.asList("apple", "abandon", "abnormal", "adjust", "appear")
		.stream().noneMatch(x -> x.startsWith("b"));
		System.out.println(noStringStartsWithB);
	}
}
