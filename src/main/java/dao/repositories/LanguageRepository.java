package dao.repositories;

import dao.entities.Languages;
import org.jetbrains.annotations.NotNull;
import singleton.DBManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LanguageRepository {

    public void create(@NotNull Languages language) throws SQLException {
        PreparedStatement stmt;
        stmt = DBManager.getInstance().preparedStatement("INSERT INTO languages VALUES(?,?)");
        stmt.setString(1,language.getAcronym());
        stmt.setString(2,language.getName());
        stmt.executeUpdate();
    }

    public void update(Languages language) throws SQLException {
        PreparedStatement stmt;
        stmt = DBManager.getInstance().preparedStatement("UPDATE languages SET name = ? WHERE acronym = ?");
        stmt.setString(1, language.getName());
        stmt.setString(2,language.getAcronym());
        stmt.executeUpdate();
    }

    public void delete(Languages language) throws SQLException {
        PreparedStatement stmt;
        stmt = DBManager.getInstance().preparedStatement("DELETE FROM languages WHERE acronym = ?");
        stmt.setString(1,language.getAcronym());
        stmt.executeUpdate();
    }

    public ResultSet read(Languages language) throws SQLException {
        PreparedStatement stmt;
        stmt = DBManager.getInstance().preparedStatement("SELECT * FROM languages WHERE acronym = ?");
        stmt.setString(1,language.getAcronym());
        return stmt.executeQuery();
    }
}
