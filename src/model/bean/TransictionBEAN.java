/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.bean;

/**
 *
 * @author WELLINGTON
 */
public class TransictionBEAN {
   private String codigo;
   private String data ;
   private String quantidade;
   private String produto;

    public TransictionBEAN(String codigo, String data, String quantidade, String produto) {
        this.codigo = codigo;
        this.data = data;
        this.quantidade = quantidade;
        this.produto = produto;
    }
   
   

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    
  
  
   
}