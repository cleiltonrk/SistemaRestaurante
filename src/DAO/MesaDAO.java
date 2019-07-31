/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import DAO.ExecuteSQL;
import java.sql.Connection;
import Modelo.Mesas;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author cleil
 */
public class MesaDAO extends ExecuteSQL{
     public MesaDAO(Connection con) {
        super(con);
    }
    public String inserir_Mesas(Mesas a) {
        String sql = "insert into tb_mesa values(0,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getNome());
            ps.setString(2, "Disponível");

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
     public List<Mesas> ListarMesas() {
        String sql = "select id_mesa, nome, status from tb_mesa";
        List<Mesas> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Mesas a = new Mesas();
                    a.setId_mesa(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setStatus(rs.getString(3));
              
                    
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
       public List<Mesas> CapturarMesa(int cod){
        String sql = "select * from tb_mesa where id_mesa = " + cod + "";
        List<Mesas> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Mesas a = new Mesas();
                    a.setId_mesa(rs.getInt(1));
                    a.setNome(rs.getString(2));
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
        public List<Mesas> ConsultaCodigoMesa(String nome){
        
        String sql = "SELECT id_mesa FROM tb_mesa WHERE nome = '"+nome+"'";
        List<Mesas> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Mesas a = new Mesas();
                    a.setId_mesa(rs.getInt(1));
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
         public String ExcluirMesa(Mesas a) {
        String sql = "DELETE FROM tb_mesa WHERE id_mesa = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getId_mesa());

            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso!";
            } else {
                return "Erro ao Excluir!";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
          public List<Mesas> ListarComboMesa() {
        String sql = "select nome from tb_mesa order by nome";
        List<Mesas> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Mesas a = new Mesas();
                    a.setNome(rs.getString(1));
                    lista.add(a);
                }

                return lista;
            } else {
                return lista;
            }
        } catch (SQLException e) {
            return null;
        }
    }
     
   public String StatusMesaDisponivel(Mesas a) {
        String sql = "UPDATE  tb_mesa SET status = ? WHERE id_mesa = ?";
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
    public String StatusMesaPendente(Mesas a) {
        String sql = "UPDATE  tb_mesa SET status = ? WHERE id_mesa = ?";
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
     public List<Mesas> PesquisarCodMesa(int Cod) {
          String sql = "select id_mesa, nome from tb_mesa WHERE id_mesa="+Cod;
        List<Mesas> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Mesas a = new Mesas();
                    
                    a.setId_mesa(rs.getInt(1));
                    a.setNome(rs.getString(2));
                 
                    lista.add(a);
                }
                
                return lista;
            }else{
                return lista;
            }
        }catch(SQLException e){
            return null;
        }
    }    
     public List<Mesas> PesquisarNomeMesa(String nome){
        String sql = "select id_mesa, nome FROM tb_mesa WHERE nome LIKE'%"+nome+"%'";
        List<Mesas> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Mesas a = new Mesas();
                    
                    a.setId_mesa(rs.getInt(1));
                    a.setNome(rs.getString(2));
                   
                    
                    lista.add(a);
                }
                
                return lista;
            }else{
                return lista;
            }
        }catch(SQLException e){
            return null;
        }
    }
       public boolean TestarMesa(int cod){
        boolean Resultado = false;
        try{
            String sql = "SELECT * FROM tb_mesa where id_mesa = '"+cod+"'";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Resultado = true;
                }
            }
            
        }catch(SQLException ex){
            ex.getMessage();
        }
        return Resultado;
    }
          
     
}

