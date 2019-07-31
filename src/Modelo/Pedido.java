
package Modelo;

public class Pedido {
    private int id_pedido;
    private String hora_pedido;
    private String data_pedido;

    public String getStatus_comissao() {
        return status_comissao;
    }

    public void setStatus_comissao(String status_comissao) {
        this.status_comissao = status_comissao;
    }
    private String NomeProd;  
    private double precoProd;
    private int idgarcom;
    private String status_comissao;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private String status;

    
    
    public int getIdgarcom() {
        return idgarcom;
    }

    public void setIdgarcom(int idgarcom) {
        this.idgarcom = idgarcom;
    }


    public String getNomeProd() {
        return NomeProd;
    }

    public void setNomeProd(String NomeProd) {
        this.NomeProd = NomeProd;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }
    private int id_mesa;

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getHora_pedido() {
        return hora_pedido;
    }

    public void setHora_pedido(String hora_pedido) {
        this.hora_pedido = hora_pedido;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

   
    
}
