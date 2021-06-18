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
import model.bean.ProductBEAN;

/**
 *
 * @author WELLINGTON
 */
public class ProductDAO {

    public void create(ProductBEAN Product) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Product (codigo, tipo, descricao, entrada, custo, venda, quantidade,observacoes) VALUES (? , ?, ?, ?, ?, ?, ?, ? )");
            stmt.setString(1, Product.getCodigo());
            stmt.setString(2, Product.getTipo());
            stmt.setString(3, Product.getDescricao());
            stmt.setString(4, Product.getEntrada());
            stmt.setString(5, Product.getCusto());
            stmt.setString(6, Product.getVenda());
            stmt.setString(7, Product.getQuantidade());
            stmt.setString(8, Product.getOberservacoes());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "PRODUTO SALVO NO BANCO DE DADOS!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR PRODUTO NO BANCO DE DADOS!");
            throw new RuntimeException("ERRO AO INSERIR NA TABELA PRODUCT:", ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<ProductBEAN> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ProductBEAN> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Product");
            rs = stmt.executeQuery();
            while (rs.next()) {
                ProductBEAN product = new ProductBEAN(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                if (rs.getString(8) != null) {
                    product.setOberservacoes(rs.getString(8));
                }
                produtos.add(product);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR PRODUTOS: ", ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produtos;
    }

    public ProductBEAN get(String codigo) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ProductBEAN> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Product WHERE codigo LIKE ?");
            stmt.setString(1, codigo);
            rs = stmt.executeQuery();
            while (rs.next()) {
                ProductBEAN product = new ProductBEAN(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                if (rs.getString(8) != null) {
                    product.setOberservacoes(rs.getString(8));
                }
                produtos.add(product);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR UM ÚNICO PRODUTO: ", ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produtos.get(0);

    }

    public List<ProductBEAN> getCodigo(String codigo) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ProductBEAN> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Product WHERE codigo LIKE ?");
            stmt.setString(1, "%" + codigo + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                ProductBEAN product = new ProductBEAN(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                if (rs.getString(8) != null) {
                    product.setOberservacoes(rs.getString(8));
                }
                produtos.add(product);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("ERRO AO BUSCAR UM PRODUTO PELA DESCRIÇÃO: ", ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produtos;

    }

    public void update(ProductBEAN Product) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE Product SET codigo = ?, tipo = ?, descricao = ?, entrada = ? , custo = ?, venda = ?, quantidade = ? ,observacoes = ? WHERE  codigo LIKE ?");
            stmt.setString(1, Product.getCodigo());
            stmt.setString(2, Product.getTipo());
            stmt.setString(3, Product.getDescricao());
            stmt.setString(4, Product.getEntrada());
            stmt.setString(5, Product.getCusto());
            stmt.setString(6, Product.getVenda());
            stmt.setString(7, Product.getQuantidade());
            stmt.setString(8, Product.getOberservacoes());
            stmt.setString(9, "%" + Product.getCodigo() + "%");

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "PRODUTO EDITADO NO BANCO DE DADOS!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO EDITAR PRODUTO NO BANCO DE DADOS!");
            throw new RuntimeException("ERRO AO EDITAR NA TABELA PRODUCT: ", ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(String codigo) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE  FROM Product WHERE codigo LIKE ?");
            stmt.setString(1, codigo);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "PRODUTO EXCLUIDO DO BANCO DE DADOS");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR PRODUTO");
            throw new RuntimeException("ERRO EXCLUIR PRODUTO: ", ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
         
   

