package evolution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class Miscellaneous {
	@Test
	public void test0() {
		Arrays.asList("apple", "ant", "banana", "pear", "cat", "dog")
		.stream().filter(x -> (x.length() > 3)).map(x -> x.toUpperCase())
		.sorted().forEach(System.out::println);
	}
	
	@Test
	public void test1() {
		Arrays.asList("a1", "a2", "b1", "c2", "c1")
		.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted()
		.forEach(System.out::println);
	}
	
	@Test
	public void test2() {
		Arrays.asList("a1", "a2", "b1", "c2", "c1")
		.stream().filter(s -> s.endsWith("1")).map(String::toLowerCase).sorted()
		.forEach(System.out::println);
	}
	
	@Test
	public void test3() {
		List<String> list = Arrays.asList("CA", "IL", "WA")
		.stream().filter(x -> !x.equals("IL")).map(x -> x.toLowerCase()).collect(Collectors.toList());
		list.stream().forEach(System.out::println);
	}
	
	@Test
	public void test4() {
		List<String> newList = new LinkedList<>();
		Arrays.asList("Montereal", "Chicago", "Orlando")
		.stream().forEach(newList::add);
		newList.stream().forEach(System.out::println);
	}
	
	@Test
	public void test5() {
		Arrays.asList("a1", "a2", "a3")
        .stream().findFirst().ifPresent(System.out::println);
	}
	
	@Test
	public void test6() {
		Arrays.asList("a1", "a2", "a3")
        .stream().findFirst().ifPresent(System.out::println);
	}
	
	@Test
	public void test7() {
		Arrays.asList("a", "b", "c", "d", "f")
		.stream().map(String::toUpperCase).sorted((x, y) -> x.compareTo(y))
		.forEach(System.out::println);
	}
	
	@Test
	public void test8() {
		long count = Arrays.asList("a", "bc", "cba").stream().filter(x -> x.length() > 2).count();
		System.out.println(count);
	}
}
