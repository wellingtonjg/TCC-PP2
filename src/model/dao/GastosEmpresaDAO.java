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
import model.bean.GastosEmpresaBEAN;

/**
 *
 * @author WELLINGTON
 */
public class GastosEmpresaDAO {
    public void create(GastosEmpresaBEAN emp){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Gempresa (Codigo,Tipo, Valor , Quantidade,Observacao) VALUES (?,?,?,?,?)");
            stmt.setString(1, emp.getCodigo());
            stmt.setString(2, emp.getTipo());
            stmt.setString(3, emp.getValor());
            stmt.setString(4, emp.getQuantidade());
            stmt.setString(5, emp.getObservacao());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "GASTOS DA EMPRESA SALVA NO BANCO DE DADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR O GASTO DA EMPRESA NO BANCO DE DADOS");
          throw new RuntimeException("ERRO AO INSERIR NA TABELA GASTOEMPRESA: ", ex);
        
          } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
    
    }
    
public java.util.List<GastosEmpresaBEAN> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<GastosEmpresaBEAN> empresas = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Gempresa");
           rs = stmt.executeQuery();
           while(rs.next()){
               GastosEmpresaBEAN gaemp = new GastosEmpresaBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5));
               empresas.add(gaemp);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR GASTOS DA EMPRESA: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return empresas;
    }



public GastosEmpresaBEAN get(String codigo){
    Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<GastosEmpresaBEAN> gempresas = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Gempresa WHERE  Codigo LIKE ?");
           stmt.setString(1, codigo);
           rs = stmt.executeQuery();
           while(rs.next()){
                GastosEmpresaBEAN emp = new GastosEmpresaBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)
                       ,rs.getString(5));
               gempresas.add(emp);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR UM ÚNICO GASTO: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return gempresas.get(0);
       
       
    }
public  java.util.List<GastosEmpresaBEAN> getTipo(String tipo){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       java.util.List<GastosEmpresaBEAN> empresas = new ArrayList<>();
       try{
           stmt = con.prepareStatement("SELECT * FROM Gempresa WHERE  Tipo LIKE ?");
           stmt.setString(1, "%" + tipo +"%");
           rs = stmt.executeQuery();
           while(rs.next()){
               GastosEmpresaBEAN emp = new GastosEmpresaBEAN(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5)
                       );
               empresas.add(emp);
           }
       }catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR UM GASTO DA EMPRESA PELO TIPO: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       return empresas;
       
       
    }


  public void update(GastosEmpresaBEAN emp){
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE Gempresa SET Codigo = ?, Tipo = ?, Valor = ? , Quantidade = ? , Observacao = ?   WHERE  Codigo LIKE ?");
            stmt.setString(1, emp.getCodigo());
            stmt.setString(2, emp.getTipo());
            stmt.setString(3, emp.getValor());
            stmt.setString(4, emp.getQuantidade());
            stmt.setString(5, emp.getObservacao());
            stmt.setString(6, "%"+emp.getCodigo()+"%");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " GASTO DA EMPRESA ATUALIZADA NO BANCO DE DADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO EDITAR GASTO DA EMPRESA NO BANCO DE DADOS");
          throw new RuntimeException("ERRO AO EDITAR NA TABELA GASTOEMPRESA: ", ex);
        
          } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
  }
 public void delete(String codigo){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
     
       try{
           stmt = con.prepareStatement("DELETE  FROM Gempresa WHERE  Codigo LIKE ?");
           stmt.setString(1, codigo);
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null,"GASTO DA EMPRESA EXCLUIDA DO BANCO DE DADOS");
       }catch (SQLException ex) {
           
       JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR GASTO DA EMPRESA");
            throw new RuntimeException("ERRO AO EXCLUIR GASTO DA EMPRESA: ", ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
  }
  
  
}



