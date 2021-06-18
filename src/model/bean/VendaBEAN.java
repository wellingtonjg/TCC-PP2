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
public class VendaBEAN {
    private String Codigo;
    private String Vendedor;
    private String Cliente;
    private String Produto;
    private String Quantidade;
    private String ValorTotal;
    private String Data;

    public VendaBEAN(String Codigo, String Vendedor, String Cliente, String Produto, String Quantidade, String ValorTotal, String Data) {
        this.Codigo = Codigo;
        this.Vendedor = Vendedor;
        this.Cliente = Cliente;
        this.Produto = Produto;
        this.Quantidade = Quantidade;
        this.ValorTotal = ValorTotal;
        this.Data = Data;
    }

    
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(String ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }
   

  
}