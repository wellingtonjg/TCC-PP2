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
import model.bean.EmpresaBEAN;

/**
 *
 * @author WELLINGTON
 */
public class EmpresaDAO {
    public void create(EmpresaBEAN emp){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Empresa (Codigo , Nome , Cnpj , Telefone , Estado , Endereco , Bairro, Logradouro ) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1, emp.getCodigo());
            stmt.setString(2, emp.getNome());
            stmt.setString(3, emp.getCnpj());
            stmt.setString(4, emp.getTelefone());
            stmt.setString(5, emp.getEstado());
            stmt.setString(6, emp.getEndereco());
            stmt.setString(7, emp.getBairro());
            stmt.setString(8, emp.getLogradouro());
           
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "EMPRESA SALVA NO BANCO DE DADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR EMPRESA NO BANCO DE DADOS");
          throw new RuntimeException("ERRO AO INSERIR NA TABELA EMPRESA: ", ex);
        
          } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
    
    }
    
public java.util.List<EmpresaBEAN> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<EmpresaBEAN> empresas = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Empresa");
           rs = stmt.executeQuery();
           while(rs.next()){
               EmpresaBEAN emp = new EmpresaBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)
                       ,rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
               empresas.add(emp);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR EMPRESA: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return empresas;
    }



public EmpresaBEAN get(String codigo){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<EmpresaBEAN> empresas = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Empresa WHERE  Codigo LIKE ?");
           stmt.setString(1, codigo);
           rs = stmt.executeQuery();
           while(rs.next()){
               EmpresaBEAN emp = new EmpresaBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)
                       ,rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
               empresas.add(emp);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR UMA ÚNICA EMPRESA: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return empresas.get(0);
       
       
    }
public  java.util.List<EmpresaBEAN> getNome(String nome){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<EmpresaBEAN> empresas = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Empresa WHERE  Nome LIKE ?");
           stmt.setString(1, "%" + nome +"%");
           rs = stmt.executeQuery();
           while(rs.next()){
               EmpresaBEAN emp = new EmpresaBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)
                       ,rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
               empresas.add(emp);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR UMA EMPRESA PELO NOME: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return empresas;
       
       
    }



  public void update(EmpresaBEAN emp){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE Empresa SET Codigo = ?, Nome = ? , Cnpj = ? , Telefone = ? , Estado = ? , Endereco = ? , Bairro = ? , Logradouro = ?  WHERE  Codigo LIKE ?");
            stmt.setString(1, emp.getCodigo());
            stmt.setString(2, emp.getNome());
            stmt.setString(3, emp.getCnpj());
            stmt.setString(4, emp.getTelefone());
            stmt.setString(5, emp.getEstado());
            stmt.setString(6, emp.getEndereco());
            stmt.setString(7, emp.getBairro());
            stmt.setString(8, emp.getLogradouro());
            stmt.setString(9, "%"+emp.getCodigo()+"%");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "EMPRESA ATUALIZADA NO BANCO DE DADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO EDITAR EMPRESA NO BANCO DE DADOS");
          throw new RuntimeException("ERRO AO EDITAR NA TABELA EMPRESA: ", ex);
        
          } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
  }
  public void delete(String codigo){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
     
       try{
           stmt = con.prepareStatement("DELETE  FROM Empresa WHERE  Codigo LIKE ?");
           stmt.setString(1, codigo);
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null,"EMPRESA EXCLUIDA DO BANCO DE DADOS");
       }catch (SQLException ex) {
           
       JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR EMPRESA");
            throw new RuntimeException("ERRO AO EXCLUIR EMPRESA: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
  }
  
  
}



