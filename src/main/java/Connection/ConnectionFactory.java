package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String url;
    private String usuario;
    private String senha;

    public ConnectionFactory(){
        this.url = "jdbc:postgresql://localhost:5432/BancoFichasAvaliacao";
        this.usuario = "postgres";
        this.senha = "postgres";
    }
    public Connection getConnection() throws ClassNotFoundException,
            SQLException {
        Class.forName("org.postgresql.Driver");

        return DriverManager.getConnection(url, usuario, senha);

    }
}
