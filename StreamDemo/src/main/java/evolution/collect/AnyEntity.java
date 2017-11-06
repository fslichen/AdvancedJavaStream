package evolution.collect;

public class AnyEntity {
	private String name;
	private String gender;
	public AnyEntity() {

	}
	public AnyEntity(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
