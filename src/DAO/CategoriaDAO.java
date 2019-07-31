/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Categoria;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAO.ConexaoDAO;
import DAO.ExecuteSQL;
import Modelo.Mesas;
public class CategoriaDAO extends ExecuteSQL{

    public CategoriaDAO(Connection con) {
        super(con);
    }
     public String inserir_Categoria(Categoria a) {
        String sql = "insert into tb_categoria values(0,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getNome());
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
     public String AlterarCategoria(Categoria a){
        String sql = "UPDATE tb_categoria SET nome = ? WHERE id_categoria = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setInt(2, a.getId_categoria());
       
            
           
            
            if(ps.executeUpdate() > 0){
                return "Atualizado com Sucesso!";
            }else{
                return "Erro ao Atualizar";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
     
     public String ExcluirCategoria(Categoria a) {
        String sql = "DELETE FROM tb_categoria WHERE id_categoria = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getId_categoria());

            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso!";
            } else {
                return "Erro ao Excluir!";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
      public List<Categoria> CapturarCategoria(int cod){
        String sql = "SELECT * FROM tb_categoria WHERE id_categoria = '"+cod+"'";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    a.setId_categoria(rs.getInt(1));
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
     public List<Categoria> ListarComboCategoria(){
        String sql = "select nome from tb_categoria order by nome";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    a.setNome(rs.getString(1));
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
     public List<Categoria> ConsultaCodigoCategoria(String nome){
        
        String sql = "SELECT id_categoria FROM tb_categoria WHERE nome = '"+nome+"'";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    a.setId_categoria(rs.getInt(1));
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
     public List<Categoria> ListarCategoria(){
        String sql = "SELECT id_categoria, nome from tb_categoria";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    
                    a.setId_categoria(rs.getInt(1));
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
     public List<Categoria> PesquisarCodCategoria(int Cod) {
          String sql = "select id_categoria, nome from tb_categoria WHERE id_categoria="+Cod;
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    
                    a.setId_categoria(rs.getInt(1));
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
      public boolean TestarCategoria(int cod){
        boolean Resultado = false;
        try{
            String sql = "SELECT * FROM tb_categoria where id_categoria = '"+cod+"'";
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
     public List<Categoria> PesquisarNomeCategoria(String nome){
        String sql = "select id_categoria, nome FROM tb_categoria WHERE nome LIKE'%"+nome+"%'";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    
                    a.setId_categoria(rs.getInt(1));
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
     
}
