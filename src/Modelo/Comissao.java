/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author cleil
 */
public class Comissao {
    private int id_garcom;
    private String nome_garcom;
    private double valor;
    private String status_comissao;

    public String getStatus_comissao() {
        return status_comissao;
    }

    public void setStatus_comissao(String status_comissao) {
        this.status_comissao = status_comissao;
    }

   

    public int getId_garcom() {
        return id_garcom;
    }

    public void setId_garcom(int id_garcom) {
        this.id_garcom = id_garcom;
    }

    public String getNome_garcom() {
        return nome_garcom;
    }

    public void setNome_garcom(String nome_garcom) {
        this.nome_garcom = nome_garcom;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
