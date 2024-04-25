package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {

    public static void main(String[] args) {
        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            System.out.print("Informe o ID desejado: ");
            int idBuscado = entrada.nextInt();
            
            String sql = "SELECT * FROM pessoas WHERE codigo = ?";
            
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idBuscado);
            
            rs = stmt.executeQuery();
            
            Pessoa pessoa = null;
            if(rs.next()) {
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                
                pessoa = new Pessoa(codigo, nome);
            }
            
            
            if(pessoa != null) {
                
                System.out.println(pessoa.getCodigo() + " => " + pessoa.getNome());
                entrada.nextLine();
                System.out.print("Informe o novo nome para o registro: ");
                String novoNome = entrada.nextLine();
                
                String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
                stmt.close();
                stmt = conexao.prepareStatement(update);
                stmt.setString(1, novoNome);
                stmt.setInt(2, idBuscado);
                
                stmt.execute();
                System.out.println();
                System.out.println(pessoa.getCodigo() + " => " + novoNome);
            }else {
                System.out.println("Registro não encontrado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs != null) {try{rs.close();}catch(Exception e) {}};
            if(stmt != null) {try{stmt.close();}catch(Exception e) {}};
            if(entrada != null) {try{entrada.close();}catch(Exception e) {}};
            if(conexao != null) {try{conexao.close();}catch(Exception e) {}};
        }
        
        
    }
}
