package evolution.order;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;

public class OrderDemo {
	@Test
	public void test() {
		List<Integer> list = new LinkedList<>();
		IntStream.range(0, 1000).forEach(x -> list.add(x));// The order is guaranteed.
		for (int i = 0; i < 1000; i++) {
			if (list.get(i) != i) {
				System.out.println("The order is ruined.");
			}
		}
		list.parallelStream().forEach(System.out::println);// The order is not guaranteed.
		list.stream().forEach(System.out::println);// The order is guaranteed.
	}
}
