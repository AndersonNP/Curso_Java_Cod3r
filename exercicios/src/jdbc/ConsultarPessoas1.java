package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

    public static void main(String[] args) {
        
        Connection conexao = FabricaConexao.getConexao();
        
        String sql = "SELECT * FROM pessoas";
        
        Statement stmt = null;
        ResultSet rs = null;
        try {
            
            
            stmt = conexao.createStatement();
            rs = stmt.executeQuery(sql);
            
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
            if(rs != null) {try {rs.close();} catch (SQLException e) {}};
            if(stmt != null) {try {stmt.close();} catch (SQLException e) {}};
            if(conexao != null) {try {conexao.close();} catch (SQLException e) {}};
        }
        
        
    }
}
