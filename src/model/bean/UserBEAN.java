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
public class UserBEAN {
   private String nome;
   private String nomeusu;
   private String senha;
   private String acesso;

    public UserBEAN(String nome, String nomeusu, String senha, String acesso) {
        this.nome = nome;
        this.nomeusu = nomeusu;
        this.senha = senha;
        this.acesso = acesso;
    }

   
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeusu() {
        return nomeusu;
    }

    public void setNomeusu(String nomeusu) {
        this.nomeusu = nomeusu;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

   
}
