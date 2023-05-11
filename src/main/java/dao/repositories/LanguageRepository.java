package dao.repositories;

import dao.entities.Languages;
import org.jetbrains.annotations.NotNull;
import singleton.DBManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LanguageRepository {

    public void create(@NotNull Languages language) throws SQLException {
        PreparedStatement stmt;
        stmt = DBManager.getInstance().preparedStatement("INSERT INTO languages VALUES(?,?)");
        stmt.setString(1,language.getAcronym());
        stmt.setString(2,language.getName());
        stmt.executeUpdate();
    }
}
