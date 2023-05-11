package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


// METTEZ VOTRE MDP ICI
public class DBManager {
    private static DBManager instance;
    private static Connection connection;
    private String serveur = "localhost/";
    private String dataBase = "gamesloc";
    private String username = "postgres";
    private String password = "";

    private DBManager() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException var3) {
            System.out.println("Le driver n'a pas été trouvé");
            System.exit(1);
        }

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://" + this.serveur + this.dataBase, this.username, this.password);
        } catch (SQLException var2) {
            System.out.println(var2.getMessage());
        }

    }

    public static DBManager getInstance() {
        if (instance == null) {
            instance = new DBManager();
        }

        return instance;
    }

    public PreparedStatement preparedStatement(String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
