/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class ConnectionFactory {
   
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://db4free.net:3306/gestaocriattus";
    private static final String USER = "gestaocriattus";
    private static final String PASS = "luciane1";
    public Statement statement;
    public ResultSet resultset;
    private Connection conexao;
    
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Erro na conexão: ", ex);
        }  
    }
    
    public static void closeConnection(Connection con){
        try {
            if(con != null){
                con.close();
            }
        } catch (SQLException ex) {
           throw new RuntimeException("Erro ao fechar conexão: ", ex);
        } 
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con);
        try {
            if(stmt != null){
                stmt.close();
            }
        } catch (SQLException ex) {
           throw new RuntimeException("Erro ao fechar conexão: ", ex);
        } 
    }
        
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con,stmt);
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException ex) {
           throw new RuntimeException("Erro ao fechar conexão: ", ex);
        } 
    }
    
    public boolean conecta() {
        boolean result = true;
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, USER, PASS);
            //JOptionPane.showMessageDialog(null, "conectou!");

        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver não localizado: " + Driver);
            result = false;
        } catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados: " + Fonte);
        }
        return result;
    }
    
      public void executaSQL (String sql){
          
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar o comando sql, "+sqlex+", o sql passado foi "+sql);
        }
    }
}
