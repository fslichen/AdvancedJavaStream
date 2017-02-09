package evolution.stream;

import java.util.Arrays;

import org.junit.Test;

public class Statistics {
	@Test
	public void test0() {// Sum 
		int sum = Arrays.asList(1, 2, 5, 3).stream().mapToInt(x -> x).sum();
		System.out.println(sum);
	}
	
	@Test
	public void test1() {// Sum 
		int sum = Arrays.asList(1, 2, 5, 3).stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
	
	@Test
	public void test2() {// Sum 
		double avg = Arrays.asList(1.0, 2.3, 5.2, 3.5).stream().mapToInt(Double::intValue).average().getAsDouble();
		System.out.println(avg);
	}
}
