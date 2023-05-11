package dao.repositories;

import dao.entities.Type;
import org.jetbrains.annotations.NotNull;
import singleton.DBManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TypeRepository {
	
	public void create(@NotNull Type type) throws SQLException {
		PreparedStatement stmt;
		stmt = DBManager.getInstance().preparedStatement("INSERT INTO type (name) VALUES(?)");
		stmt.setString(1, type.getName());
		stmt.executeUpdate();
	}

}
