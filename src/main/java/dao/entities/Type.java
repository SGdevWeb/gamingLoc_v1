package dao.entities;

public class Type {
	
	private int id;
	
	private String type;
	
	public Type(int id, String type) {
		this.id = id;
		this.type = type;
	}
	//region GETTER/SETTER
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	//endregion
}
