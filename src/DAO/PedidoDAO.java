/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modelo.Comissao;
import Modelo.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cleil
 */
public class PedidoDAO extends ExecuteSQL{

    public PedidoDAO(Connection con) {
        super(con);
    }
    public String inserir_Pedido(Pedido a) {
        String sql = "insert into tb_pedidos values(0,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getHora_pedido());
            ps.setString(2, a.getData_pedido());
            ps.setInt(3, Integer.parseInt(a.getNomeProd()));
            ps.setInt(4,a.getId_mesa());
            ps.setInt(5, a.getIdgarcom());
            ps.setString(6, "Pagar");
            ps.setString(7, "Pendente");
            
            
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<Pedido> ListarPedido(int id) {
        String sql = "select id_pedido, hora_pedido, data_pedido, tb_produto.nome,tb_produto.preco, tb_mesa_id_mesa, tb_garcom_id from tb_pedidos"
                + " INNER JOIN tb_produto ON tb_produto.id_produto = tb_produto_id_produto INNER JOIN tb_mesa ON tb_mesa.id_mesa = tb_pedidos.tb_mesa_id_mesa  WHERE  tb_pedidos.tb_mesa_id_mesa ="+id+" AND tb_mesa.status = 'Pendente' AND tb_pedidos.status = 'Pagar'  ";
        List<Pedido> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Pedido a = new Pedido();
                    a.setId_pedido(rs.getInt(1));
                    a.setData_pedido(rs.getString(2));
                    a.setHora_pedido(rs.getString(3));
                    a.setNomeProd(rs.getString(4));
                    a.setPrecoProd(rs.getDouble(5));
                    a.setIdgarcom(rs.getInt(6));
                    a.setId_mesa(rs.getInt(7));
                    
                    
                   
                  
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
     public String StatusPedidoPago(Pedido a) {
        String sql = "UPDATE  tb_pedidos SET status = ? WHERE tb_mesa_id_mesa = ?";
         try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getStatus());
            ps.setInt(2, a.getId_mesa());
            
            if(ps.executeUpdate() > 0){
                return "Atualizado com Sucesso!";
            }else{
                return "Erro ao Atualizar";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
      public String StatusPedidoPagar(Pedido a) {
        String sql = "UPDATE  tb_pedidos SET status = ? WHERE tb_mesa_id_mesa = ?";
         try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getStatus());
            ps.setInt(2, a.getId_mesa());
            
            if(ps.executeUpdate() > 0){
                return "Atualizado com Sucesso!";
            }else{
                return "Erro ao Atualizar";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
        public String ExcluirPedido(Pedido a) {
        String sql = "DELETE FROM tb_pedidos WHERE id_pedido = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getId_pedido());

            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso!";
            } else {
                return "Erro ao Excluir!";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
     public List<Pedido> ConsultaPrecoPedido(int id){
        
        String sql = "tb_produto.preco, tb_mesa_id_mesa, tb_garcom_id from tb_pedidos"
                + " INNER JOIN tb_produto ON tb_produto.id_produto = tb_produto_id_produto WHERE tb_pedidos.tb_mesa_id_mesa ="+id;;
        List<Pedido> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Pedido a = new Pedido();
                    a.setId_mesa(rs.getInt(1));
                    a.setPrecoProd(rs.getInt(2));
                    a.setIdgarcom(rs.getInt(3));
                    
                    lista.add(a);
                }
                
                return lista;
            }else{
                return null;
            }
        }catch(Exception e){
            return null;
        }
        
     }
           public List<Pedido> CapturarPedido(int cod){
        String sql = "select * from tb_pedidos where id_pedido = " + cod + "";
        List<Pedido> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Pedido a = new Pedido();
                    a.setId_pedido(rs.getInt(1));
                    a.setData_pedido(rs.getString(2));
                    a.setHora_pedido(rs.getString(3));
                    a.setNomeProd(rs.getString(4));
                    a.setPrecoProd(rs.getDouble(5));
                    a.setIdgarcom(rs.getInt(6));
                    a.setStatus(rs.getString(7));
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
     public List<Pedido> CapturarComissões(int id){
        String sql = "SELECT SUM(tb_produto.preco) FROM tb_pedidos INNER JOIN tb_produto ON tb_produto.id_produto = tb_pedidos.tb_produto_id_produto"
                + " WHERE status = 'Pago' AND tb_garcom_id = "+id;
        List<Pedido> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Pedido a = new Pedido();
                    a.setIdgarcom(rs.getInt(1));
                    
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    
      public List<Comissao> ListarComissoes(){
        String sql = "SELECT tb_garcom.id, tb_garcom.nome, SUM(tb_produto.preco), status_comissao FROM tb_pedidos "
                + "INNER JOIN tb_garcom ON tb_garcom.id = tb_garcom_id "
                + "INNER JOIN tb_produto ON tb_produto.id_produto = tb_produto_id_produto WHERE status_comissao = 'Pendente' GROUP BY tb_garcom_id";
        List<Comissao> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Comissao a = new Comissao();
                    a.setId_garcom(rs.getInt(1));
                    a.setNome_garcom(rs.getString(2));
                    a.setValor(rs.getDouble(3));
                    
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
      public String StatusComissaoPaga(int idGarcom) {
        String sql = "UPDATE  tb_pedidos SET status_comissao = ? WHERE tb_garcom_id = ?";
         try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1,"Paga");
            ps.setInt(2, idGarcom);
            if(ps.executeUpdate() > 0){
                return "Atualizado com Sucesso!";
            }else{
                return "Erro ao Atualizar";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
         
         
         
         
      
         
         
         
         
         
         
         
      
    }
    
}
