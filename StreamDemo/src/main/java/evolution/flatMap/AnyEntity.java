package evolution.flatMap;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnyEntity {
	List<AnotherEntity> anotherEntities;
}
