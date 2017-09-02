package evolution.entitySort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnyEntity {
	private String name;
	private Integer age;
	private Double salary;
	public int compare(AnyEntity anyEntity) {
		return this.age - anyEntity.getAge();
	}
}
