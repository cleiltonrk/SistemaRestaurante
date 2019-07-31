
package Modelo;

public class Conta {
    private int id_conta;

    public int getId_conta() {
        return id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public int getNumero_mesa() {
        return numero_mesa;
    }

    public void setNumero_mesa(int numero_mesa) {
        this.numero_mesa = numero_mesa;
    }

    public int getId_garcon() {
        return id_garcon;
    }

    public void setId_garcon(int id_garcon) {
        this.id_garcon = id_garcon;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getData() {
        return status;
    }

    public void setData(String data) {
        this.status = status;
    }
    private int numero_mesa;
    private int id_garcon;
    private String hora;
    private String status;
    private String data;
    
}
