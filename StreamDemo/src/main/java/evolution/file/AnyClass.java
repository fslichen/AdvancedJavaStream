package evolution.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.Test;

public class AnyClass {
	@Test
	public void test() {
		String filePath = "/home/chen/Desktop/application.properties";
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			// Filter out the line that starts with #
			reader.lines().filter(x -> !x.startsWith("#")).map(x -> x.toLowerCase())
			.flatMap(x -> Arrays.asList(x.split(" ")).stream()).collect(Collectors.toList()).forEach(System.out::println);;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
