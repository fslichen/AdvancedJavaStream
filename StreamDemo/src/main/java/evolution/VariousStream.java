package evolution;

import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

import org.junit.Test;

public class VariousStream {
	@Test
	public void test() {
		DoubleStream.of(3.0, 4.0, 5.0).count();
		LongStream.of(3l, 4l, 5l).count();
	}
}
