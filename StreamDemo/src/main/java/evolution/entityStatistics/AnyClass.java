package evolution.entityStatistics;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Test;

public class AnyClass {
	public static List<AnyEntity> anyEntities;
	
	public void initialize() {
		anyEntities = new ArrayList<>();
		anyEntities.add(new AnyEntity("Chen", 25, 8000d));
		anyEntities.add(new AnyEntity("Peter", 25, 8000d));
		anyEntities.add(new AnyEntity("Li", 26, 7000d));
		anyEntities.add(new AnyEntity("Anna", 26, 7000d));
		anyEntities.add(new AnyEntity("Ling", 24, 6000d));
		anyEntities.add(new AnyEntity("Elsa", 24, 6000d));
	}
	
	@Test
	public void test0() {
		initialize();
		anyEntities = anyEntities.stream().collect(Collectors.toList());
		System.out.println(anyEntities);
	}
	
	@Test
	public void test1() {
		initialize();
		Map<Integer, List<AnyEntity>> map = anyEntities.stream().collect(Collectors.groupingBy(x -> x.getAge()));
		System.out.println(map);
	}
	
	@Test
	public void test2() {
		initialize();
		double averageSalary = anyEntities.stream().collect(Collectors.averagingDouble(AnyEntity::getSalary));
		System.out.println(averageSalary);
	}
	
	@Test
	public void test3() {
		initialize();
		DoubleSummaryStatistics statistics = anyEntities.stream().collect(Collectors.summarizingDouble(AnyEntity::getSalary));
		System.out.println(statistics);
	}
	
	@Test
	public void test4() {
		initialize();
		Map<String, Double> map = anyEntities.stream().collect(Collectors.toMap(x -> x.getName(), x -> x.getSalary()));
		System.out.println(map);
	}
}
