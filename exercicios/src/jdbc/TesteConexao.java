package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException{
        
//        String url = "jdbc:mysql://localhost?verifyCertificate=false&useSSL=true";
//        String usuario = "root";
//        String senha = "123456";
//        
//        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        String url = "jdbc:oracle:thin:@128.1.0.40:1523/TBM19C.TBM.COM";
//        String url = "jdbc:oracle:thin:@128.1.0.40:1521:ORCL";
        String usuario = "treina";
        String senha = "treina";
        
        Connection conexao = DriverManager.getConnection(
                url, usuario,
                senha);
        
        //Connection conexao = FabricaConexao.getConexao();
        
        System.out.println("Conexão efetuada com sucesso!");
        
        conexao.close();
        
    }
}
