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
import model.bean.ClienteBEAN;

/**
 *
 * @author WELLINGTON
 */
public class ClienteDAO {
    public void create(ClienteBEAN clie){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Clientes (codigo,nome,cpf,endereco,estado,logradouro,telefone,bairro) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1, clie.getCodigo());
            stmt.setString(2, clie.getNome());
            stmt.setString(3, clie.getCpf());
            stmt.setString(4, clie.getEndereco());
            stmt.setString(5, clie.getEstado());
            stmt.setString(6, clie.getLogradouro());
            stmt.setString(7, clie.getTelefone());
            stmt.setString(8, clie.getBairro());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "CLIENTE SALVO NO BANCO DE DADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR CLIENTE NO BANCO DE DADOS");
          throw new RuntimeException("ERRO AO INSERIR NA TABELA CLIENTES: ", ex);
        
          } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
    
    }
    
public java.util.List<ClienteBEAN> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<ClienteBEAN> clientes = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Clientes");
           rs = stmt.executeQuery();
           while(rs.next()){
               ClienteBEAN clie = new ClienteBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
               clientes.add(clie);
              
           }
       }catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR CLIENTES!: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return clientes;
    }



public ClienteBEAN get(String codigo){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<ClienteBEAN> clientes = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Clientes WHERE  codigo LIKE ?");
           stmt.setString(1, codigo);
           rs = stmt.executeQuery();
           while(rs.next()){
               ClienteBEAN clie = new ClienteBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
               clientes.add(clie);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR UM ÚNICO CLIENTE !: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return clientes.get(0);
       
       
    }
public  java.util.List<ClienteBEAN> getNome(String nome){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<ClienteBEAN> clientes = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Clientes WHERE  nome LIKE ?");
           stmt.setString(1, "%" + nome +"%");
           rs = stmt.executeQuery();
           while(rs.next()){
               ClienteBEAN clie = new ClienteBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
               clientes.add(clie);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCA UM CLIENTE PELO NOME! ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return clientes;
       
       
    }

  public void update(ClienteBEAN clie){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE Clientes SET codigo= ?, nome = ? ,cpf = ?,endereco = ?,estado = ?, logradouro = ? ,telefone = ? ,bairro = ? WHERE  codigo LIKE ?");
            stmt.setString(1, clie.getCodigo());
            stmt.setString(2, clie.getNome());
            stmt.setString(3, clie.getCpf());
            stmt.setString(4, clie.getEndereco());
            stmt.setString(5, clie.getEstado());
            stmt.setString(6, clie.getLogradouro());
            stmt.setString(7, clie.getTelefone());
            stmt.setString(8, clie.getBairro());
            stmt.setString(9, "%"+clie.getCodigo()+"%");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "CLIENTE ATUALIZADO NO BANCO DE DADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO EDITAR CLIENTE NO BANCO DE DADOS");
          throw new RuntimeException("ERRO AO EDITAR NA TABELA CLIENTE: ", ex);
        
          } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
  }
  public void delete(String codigo){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
     
       try{
           stmt = con.prepareStatement("DELETE  FROM Clientes WHERE  codigo LIKE ?");
           stmt.setString(1, codigo);
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null,"CLIENTE EXCLUIDO DO BANCO DE DADOS");
       }catch (SQLException ex) {
           
       JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR CLIENTE");
            throw new RuntimeException("ERRO AO EXCLUIR CLIENTE: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
  }
  
  
}



