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
public class VendedorBEAN {
    private String Nome;
    private String Email;
    private String Telefone;
    private String Cpf;

    public VendedorBEAN(String Nome, String Email, String Telefone, String Cpf) {
        this.Nome = Nome;
        this.Email = Email;
        this.Telefone = Telefone;
        this.Cpf = Cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
    
    
         
}
