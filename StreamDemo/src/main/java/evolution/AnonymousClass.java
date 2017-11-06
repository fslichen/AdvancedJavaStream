package evolution;

import java.util.Arrays;

import org.junit.Test;

public class AnonymousClass {
	@Test
	public void test0() {
		Arrays.asList("a", "b", "c").stream().filter(x -> {
			if (x.equals("a")) {
				return true;
			} 
			return false;
		}).forEach(System.out::println);
	}
	
	@Test
	public void test1() {
		Arrays.asList("a", "b", "c").stream().map(x -> {
			return x + "d";
		}).forEach(System.out::println);
	}
	
	@Test
	public void test2() {
		Arrays.asList("a", "b", "c").parallelStream().forEach(x -> {
			if (x.equals("a")) {
				System.out.println("A is found.");
			}
		});
	}
	
	@Test
	public void test3() {
		Arrays.asList("a", "b", "c").parallelStream().forEach(x -> System.out.println(x));// ParallelStream alters the order.
	}
	
	@Test
	public void test4() {
		Arrays.asList(1, 3, 2).stream().sorted((x, y) -> {// Don't use sort under parallelStream.
			System.out.println("Comparing");
			return x.compareTo(y);
		}).forEach(System.out::println);
	}
}
