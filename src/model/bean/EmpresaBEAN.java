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
public class EmpresaBEAN {
    private String codigo;
    private String nome;
    private String cnpj;
    private String telefone;
    private String estado;
    private String endereco;
    private String bairro;
    private String logradouro;

    public EmpresaBEAN(String codigo, String nome, String cnpj, String telefone, String estado, String endereco, String bairro, String logradouro) {
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.estado = estado;
        this.endereco = endereco;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    @Override
    public String toString() {
        return getNome();
    }


}