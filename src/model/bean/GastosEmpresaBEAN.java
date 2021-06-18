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
public class GastosEmpresaBEAN {
    String codigo ;
    String tipo;
    String valor;
    String Quantidade;
    String observacao;

    public GastosEmpresaBEAN(String codigo, String tipo, String valor, String Quantidade, String observacao) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.valor = valor;
        this.Quantidade = Quantidade;
        this.observacao = observacao;
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
   
   

    
}