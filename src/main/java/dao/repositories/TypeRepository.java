package dao.repositories;

import dao.entities.Type;
import org.jetbrains.annotations.NotNull;
import singleton.DBManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TypeRepository {
	
	public void create(@NotNull Type type) throws SQLException {
		PreparedStatement stmt;
		stmt = DBManager.getInstance().preparedStatement("INSERT INTO type VALUES(?,?)");
		stmt.setInt(1, type.getId());
		stmt.setString(2, type.getType());
		stmt.executeUpdate();
	}

}
