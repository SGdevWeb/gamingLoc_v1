package dao.entities;

public class Type {

	private int id;
	
	private String name;
	
	public Type(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Type(String name) {
		this.name = name;
	}

	//region GETTER/SETTER
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//endregion
}
