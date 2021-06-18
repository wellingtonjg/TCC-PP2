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
public class ProductBEAN {
 
    private String codigo;
    private String descricao;
    private String tipo;
    private String Entrada;
    private String Venda;
    private String custo;
    private String quantidade;
    private String oberservacoes;
    private String data ;
    

    public ProductBEAN(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
    public ProductBEAN(String codigo, String descricao, String tipo, String Entrada, String Venda, String custo, String quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.Entrada = Entrada;
        this.Venda = Venda;
        this.custo = custo;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEntrada() {
        return Entrada;
    }

    public void setEntrada(String Entrada) {
        this.Entrada = Entrada;
    }

    public String getVenda() {
        return Venda;
    }

    public void setVenda(String Venda) {
        this.Venda = Venda;
    }

    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getOberservacoes() {
        return oberservacoes;
    }

    public void setOberservacoes(String oberservacoes) {
        this.oberservacoes = oberservacoes;
    }

    @Override
    public String toString() {
        return getDescricao();
    }

   
    
    
}
