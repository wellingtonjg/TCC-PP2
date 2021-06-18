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
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.TransictionBEAN;

/**
 *
 * @author WELLINGTON
 */
public class TransictionDAO {
    public void create(TransictionBEAN transacao){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Transiction (codigo,data,quantidade,produto) VALUES (?,?,?,?)");
            stmt.setString(1, transacao.getCodigo());
            stmt.setString(2, transacao.getData());
            stmt.setString(3, transacao.getQuantidade());
            stmt.setString(4, transacao.getProduto());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "TRANSAÇÃO SALVA NO BANCO DE DADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR TRANSAÇÃO NO BANCO DE DADOS");
          throw new RuntimeException("Erro ao inserir na tabela Transiction: ", ex);
        
          } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
    
    }
    
public List<TransictionBEAN> read(){
        Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<TransictionBEAN> transacoes = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Transiction");
           rs = stmt.executeQuery();
           while(rs.next()){
               TransictionBEAN transacao = new TransictionBEAN(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4));
               transacoes.add(transacao);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar Transação: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return transacoes;
    }



public TransictionBEAN get(String data){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<TransictionBEAN> transacoes = new ArrayList<>();
       try{
        stmt = con.prepareStatement("SELECT * FROM Transiction WHERE data LIKE ?");
        stmt.setString(1, data);
        rs = stmt.executeQuery();
        while(rs.next()){
        TransictionBEAN transacao = new TransictionBEAN(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4));
        transacoes.add(transacao);
        }
        }catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar uma única transação: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return transacoes.get(0);      
        }
public  java.util.List<TransictionBEAN> getCodigo(String codigo){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<TransictionBEAN> transacoes = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Transiction WHERE codigo LIKE ?");
           stmt.setString(1, "%" + codigo +"%");
           rs = stmt.executeQuery();
           while(rs.next()){
               TransictionBEAN transacao = new TransictionBEAN(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4));
               transacoes.add(transacao);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar uma transação pelo código: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return transacoes;
       
       
    }

 public void update(TransictionBEAN transacao){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE Transiction SET  codigo = ?,data = ?, quantidade = ? , produto = ? WHERE codigo LIKE ?");
            stmt.setString(1, transacao.getCodigo());
            stmt.setString(2, transacao.getData());
            stmt.setString(3, transacao.getQuantidade());
            stmt.setString(4, transacao.getProduto());
            stmt.setString(5, "%"+transacao.getCodigo()+"%");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "TRANSAÇÃO ATUALIZADA NO BANCO DE DADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO EDITAR TRANSAÇÃO NO BANCO DE DADOS");
          throw new RuntimeException("Erro ao editar na tabela Transiction: ", ex);
        
          } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
        }
 
  public void delete(String codigo){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
     
       try{
           stmt = con.prepareStatement("DELETE  FROM Transiction WHERE codigo LIKE ?");
           stmt.setString(1,codigo);
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null,"TRANSAÇÃO EXCLUIDA DO BANCO DE DADOS");
       }catch (SQLException ex) {
           
       JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR A TRANSAÇÃO");
            throw new RuntimeException("Erro ao excluir transação: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
        } 
        }



