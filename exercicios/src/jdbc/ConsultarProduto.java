package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarProduto {

    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:oracle:thin:@128.1.0.40:1523/TBM19C.TBM.COM";
      String usuario = "treina";
      String senha = "treina";
      
      Connection conexao = DriverManager.getConnection(
              url, usuario,
              senha);
        
        String sql = "SELECT * FROM TGFPRO WHERE CODPROD = 1502";
        
        Statement stmt = null;
        ResultSet rs = null;
        try {
            
            
            stmt = conexao.createStatement();
            rs = stmt.executeQuery(sql);
            
            List<Pessoa> pessoas = new ArrayList<>();
            while(rs.next()) {
                int codigo = rs.getInt("CODPROD");
                String nome = rs.getString("DESCRPROD");
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



