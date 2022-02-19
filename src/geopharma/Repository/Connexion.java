package geopharma.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

    private static Connection connex = null;
    private String url = "jdbc:postgresql://localhost:5432/geopharma_db";
    private String user = "postgres";
    private String pwd = "postgres";

    public Connexion() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur de driver: " + e.getMessage());
        }
        try {
            connex = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            System.out.println("Erreur de connexion: " + e.getMessage());
        }
    }

    public static Connection seConnecter() {
        if (connex == null) {
            new Connexion();
        }
        return connex;
    }
}
