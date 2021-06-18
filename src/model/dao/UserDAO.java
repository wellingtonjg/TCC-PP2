/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;




import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.UserBEAN;

/**
 *
 * @author WELLINGTON
 */
public class UserDAO {
    public void create(UserBEAN user){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO User (Nome , NomeUsuario , Senha , Acesso) VALUES (?,?,?,?)");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getNomeusu());
            stmt.setString(3, user.getSenha());
            stmt.setString(4, user.getAcesso());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "USUÁRIO SALVO NO BANCO DE DADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR USUÁRIO NO BANCO DE DADOS");
          throw new RuntimeException("ERRO AO INSERIR NA TABELA USER: ", ex);
        
          } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
    
    }
    
public java.util.List<UserBEAN> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<UserBEAN> usuarios = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM User");
           rs = stmt.executeQuery();
           while(rs.next()){
               UserBEAN user = new UserBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
               usuarios.add(user);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR USUÁRIOS: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return usuarios;
    }



public UserBEAN get(String nomeusu){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<UserBEAN> usuarios = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM User WHERE  NomeUsuario LIKE ?");
           stmt.setString(1, nomeusu);
           rs = stmt.executeQuery();
           while(rs.next()){
               UserBEAN user = new UserBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
               usuarios.add(user);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR UM ÚNICO USUÁRIO: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return usuarios.get(0);
       
       
    }
public  java.util.List<UserBEAN> getNome(String nome){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<UserBEAN> usuarios = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM User WHERE  nome LIKE ?");
           stmt.setString(1, "%" + nome +"%");
           rs = stmt.executeQuery();
           while(rs.next()){
               UserBEAN user = new UserBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
               usuarios.add(user);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR UM USUÁRIO PELO NOME: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return usuarios;
       
       
    }

  public void update(UserBEAN user){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE User SET Nome = ? , NomeUsuario = ? , Senha = ? ,Acesso = ? WHERE NomeUsuario LIKE ?");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getNomeusu());
            stmt.setString(3, user.getSenha());
            stmt.setString(4, user.getAcesso());
            stmt.setString(5, "%"+user.getNomeusu()+"%");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "USUÁRIO ATUALIZADO NO BANCO DE DADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO EDITAR USUÁRIO NO BANCO DE DADOS");
          throw new RuntimeException("ERRO AO EDITAR NA TABELA USER: ", ex);
        
          } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
  }
  public void delete(String nomeusu){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
     
       try{
           stmt = con.prepareStatement("DELETE  FROM User WHERE  NomeUsuario LIKE ?");
           stmt.setString(1, nomeusu);
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null,"USUARIO EXCLUIDO DO BANCO DE DADOS");
       }catch (SQLException ex) {
           
       JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR USUARIO");
            throw new RuntimeException("ERRO AO EXCLUIR USUARIO: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
  }
  
  
}



