package dao.repositories;

import dao.entities.Type;
import org.jetbrains.annotations.NotNull;
import singleton.DBManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TypeRepository {
	
	public void create(@NotNull Type type) throws SQLException {
		PreparedStatement stmt;
		stmt = DBManager.getInstance().preparedStatement("INSERT INTO type (name) VALUES(?)");
		stmt.setString(1, type.getName());
		stmt.executeUpdate();
	}

	public void update(Type type) throws SQLException {
		PreparedStatement stmt;
		stmt = DBManager.getInstance().preparedStatement("UPDATE type SET name = ? WHERE type_id = ?");
		stmt.setString(1, type.getName());
		stmt.setInt(2, type.getId());
		stmt.executeUpdate();
	}

	public void delete(Type type) throws SQLException {
		PreparedStatement stmt;
		stmt = DBManager.getInstance().preparedStatement("DELETE FROM type WHERE type_id = ?");
		stmt.setInt(1,type.getId());
		stmt.executeUpdate();
	}

	public ResultSet read(Type type) throws SQLException {
		PreparedStatement stmt;
		stmt = DBManager.getInstance().preparedStatement("SELECT * FROM type WHERE type_id = ?");
		stmt.setInt(1,type.getId());
		return stmt.executeQuery();
	}
}
