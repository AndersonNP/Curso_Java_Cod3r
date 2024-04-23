package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao() {
        
        try {
            final String url = "jdbc:mysql://localhost/curso_java";
            final String usuario = "root";
            final String senha = "123456";
            
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            
            return conexao;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
