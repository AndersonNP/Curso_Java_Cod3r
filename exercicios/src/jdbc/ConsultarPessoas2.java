package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

    public static void main(String[] args) {
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Scanner entrada = null;
        
        try {
            
            conexao = FabricaConexao.getConexao();
            entrada = new Scanner(System.in);
            
            System.out.print("Insira o nome a ser buscado: ");
            String busca = entrada.nextLine();
            
            String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%" + busca + "%");
            
            rs = stmt.executeQuery();
            
            List<Pessoa> pessoas = new ArrayList<>();
            while(rs.next()) {
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                
                pessoas.add(new Pessoa(codigo, nome));
            }
            
            pessoas.forEach(p -> System.out.println(p.getCodigo() + " => " + p.getNome()));
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs != null) {try{rs.close();}catch (Exception e) {}};
            if(stmt != null) {try{stmt.close();}catch (Exception e) {}};
            if(conexao != null) {try{conexao.close();}catch (Exception e) {}};
            if(entrada != null) {try{entrada.close();}catch (Exception e) {}};
        }
        
        
    }
}
