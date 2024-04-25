package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o nome: ");
        String nome = entrada.next();
        
        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        
        Connection conexao = FabricaConexao.getConexao();
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.execute();
        
        stmt.close();
        conexao.close();
        entrada.close();
        
        System.out.println("Registro inserido");
    }
}
