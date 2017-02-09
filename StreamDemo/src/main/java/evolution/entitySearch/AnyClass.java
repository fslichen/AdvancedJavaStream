package evolution.entitySearch;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class AnyClass {
	@Test
	public void test0() {// Ascending Salary by Comparable
		List<AnyEntity> anyEntities = new LinkedList<>();
		anyEntities.add(new AnyEntity("Chen", 27, 8000d));
		anyEntities.add(new AnyEntity("Li", 26, 7000d));
		anyEntities.add(new AnyEntity("Ling", 25, 6000d));
		anyEntities.stream().sorted((x, y) -> x.getSalary().compareTo(y.getSalary())).forEach(System.out::println);
	}
	
	@Test
	public void test1() {// Descending Salary by Comparable
		List<AnyEntity> anyEntities = new LinkedList<>();
		anyEntities.add(new AnyEntity("Chen", 27, 8000d));
		anyEntities.add(new AnyEntity("Li", 26, 7000d));
		anyEntities.add(new AnyEntity("Ling", 25, 6000d));
		anyEntities.stream().sorted((x, y) -> y.getSalary().compareTo(x.getSalary())).forEach(System.out::println);
	}
	
	@Test
	public void test2() {// Ascending Salary by Comparator
		List<AnyEntity> anyEntities = new LinkedList<>();
		anyEntities.add(new AnyEntity("Chen", 27, 8000d));
		anyEntities.add(new AnyEntity("Li", 26, 7000d));
		anyEntities.add(new AnyEntity("Ling", 25, 6000d));
		anyEntities.stream().sorted(Comparator.comparing(AnyEntity::getSalary)).forEach(System.out::println);
	}
	
	@Test
	public void test3() {// Descending Salary by Comparator
		List<AnyEntity> anyEntities = new LinkedList<>();
		anyEntities.add(new AnyEntity("Chen", 27, 8000d));
		anyEntities.add(new AnyEntity("Li", 26, 7000d));
		anyEntities.add(new AnyEntity("Ling", 25, 6000d));
		anyEntities.stream().sorted(Comparator.comparing(AnyEntity::getSalary).reversed()).forEach(System.out::println);
	}
	
	@Test
	public void test4() {// Descending Salary and Ascending Age by Comparator
		List<AnyEntity> anyEntities = new LinkedList<>();
		anyEntities.add(new AnyEntity("Chen", 27, 8000d));
		anyEntities.add(new AnyEntity("Elsa", 26, 8000d));
		anyEntities.add(new AnyEntity("Li", 26, 7000d));
		anyEntities.add(new AnyEntity("Anna", 25, 7000d));
		anyEntities.add(new AnyEntity("Ling", 25, 6000d));
		anyEntities.add(new AnyEntity("Cinderella", 24, 6000d));
		anyEntities.stream().sorted(Comparator.comparing(AnyEntity::getSalary).reversed().thenComparing(AnyEntity::getAge))
		.forEach(System.out::println);
	}
}
