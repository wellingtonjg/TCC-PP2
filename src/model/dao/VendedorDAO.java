/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;

import connection.ConnectionFactory;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.UserBEAN;
import model.bean.VendedorBEAN;

/**
 *
 * @author WELLINGTON
 */
public class VendedorDAO {
    public void create(VendedorBEAN vendedor){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Vendedores (Nome , Email , Cpf , Telefone) VALUES (?,?,?,?)");
            stmt.setString(1, vendedor.getNome());
            stmt.setString(2, vendedor.getEmail());
            stmt.setString(3, vendedor.getCpf());
            stmt.setString(4, vendedor.getTelefone());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "VENDEDOR SALVO NO BANCO DE DADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR VENDEDOR NO BANCO DE DADOS");
          throw new RuntimeException("Erro ao inserir na tabela Vendedor: ", ex);
        
          } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
    
    }
    
public java.util.List<VendedorBEAN> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<VendedorBEAN> vendedores = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Vendedores");
           rs = stmt.executeQuery();
           while(rs.next()){
               VendedorBEAN vendedor = new VendedorBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
               vendedores.add(vendedor);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar Vendedores: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return vendedores;
    }



public VendedorBEAN get(String email){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<VendedorBEAN> vendedores = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Vendedores WHERE  email LIKE ?");
           stmt.setString(1, email);
           rs = stmt.executeQuery();
           while(rs.next()){
               VendedorBEAN vendedor = new VendedorBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
               vendedores.add(vendedor);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar um unico vendedor: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return vendedores.get(0);
       
       
    }
public  java.util.List<VendedorBEAN> getNome(String nome){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<VendedorBEAN> vendedores = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Vendedores WHERE  nome LIKE ?");
           stmt.setString(1, "%" + nome +"%");
           rs = stmt.executeQuery();
           while(rs.next()){
               VendedorBEAN user = new VendedorBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
               vendedores.add(user);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar um vendedor pelo nome: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return vendedores;
       
       
    }

  public void update(VendedorBEAN user){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE Vendedores SET Nome = ? , Email = ? , Cpf = ? , Telefone = ? WHERE  email LIKE ? ");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getCpf());
            stmt.setString(4, user.getTelefone());
            stmt.setString(5, "%"+user.getEmail()+"%");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "VENDEDOR ATUALIZADO NO BANCO DE DADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO EDITAR VENDEDOR NO BANCO DE DADOS");
          throw new RuntimeException("Erro ao editar na tabela Vendedor: ", ex);
        
          } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
  }
  public void delete(String email){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
     
       try{
           stmt = con.prepareStatement("DELETE  FROM Vendedores WHERE   Email LIKE ?");
           stmt.setString(1, email);
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null,"VENDEDOR EXCLUIDO DO BANCO DE DADOS");
       }catch (SQLException ex) {
           
       JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR VENDEDOR");
            throw new RuntimeException("Erro ao excluir vendedor: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
  }
  
  
}

