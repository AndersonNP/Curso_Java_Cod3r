package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) {
        Scanner entrada = null;
        Connection conexao = null;
        PreparedStatement stmt = null;
        
        try {
            entrada = new Scanner(System.in);
            
            System.out.print("Insira o código que deseja excluir: ");
            int valor = entrada.nextInt();
            
            conexao = FabricaConexao.getConexao();
            
            String sql = "DELETE FROM pessoas WHERE codigo = ?";
            
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, valor);
            
            int contador = stmt.executeUpdate();
            if(contador > 0) {
                System.out.println("Registro excluido");
            }else {
                System.out.println("Nada feito");
            }
            
            System.out.println("Linhas afetadas: " + contador);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(stmt != null) {try{stmt.close();}catch(Exception e) {}};
            if(entrada != null) {try{entrada.close();}catch(Exception e) {}};
            if(conexao != null) {try{conexao.close();}catch(Exception e) {}};
        }
        
        
    }
}
