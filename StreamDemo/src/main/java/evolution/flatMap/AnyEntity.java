package evolution.flatMap;

import java.util.List;

public class AnyEntity {
	List<AnotherEntity> anotherEntities;
	
	public AnyEntity(List<AnotherEntity> anotherEntities) {
		super();
		this.anotherEntities = anotherEntities;
	}

	public List<AnotherEntity> getAnotherEntities() {
		return anotherEntities;
	}

	public void setAnotherEntities(List<AnotherEntity> anotherEntities) {
		this.anotherEntities = anotherEntities;
	}
}
