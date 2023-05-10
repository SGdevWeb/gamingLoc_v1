package dao.repositories;

import dao.entities.Type;

public class TypeRepository {
	
	public Type findById(int id)
	{
		return new Type(id, "fake");
	}
	
	public void update(int id)
	{
		// ...
	}
	
	public void insert(Type type)
	{
		// JDBC	
	}

}
