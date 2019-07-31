
package DAO;
import Modelo.Garcom;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.Produto;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ProdutoDAO extends ExecuteSQL{
     public ProdutoDAO(Connection con) {
        super(con);
    }



    public String inserir_Produto(Produto a) {
        String sql = "insert into tb_produto values(0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getNome());
            ps.setString(2, a.getPreco());
            ps.setInt(3, a.getCategoria());
           
            
           
           

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<Produto> ListarProduto() {
        String sql = "select id_produto, nome, preco, tb_categoria_id_categoria from tb_produto";
        List<Produto> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Produto a = new Produto();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setPreco(rs.getString(3));
                    a.setCategoria(rs.getInt(4));
                  
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
     public List<Produto> CapturarProduto(int cod){
        String sql = "SELECT * FROM tb_produto WHERE id_produto = '"+cod+"'";
        List<Produto> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Produto a = new Produto();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setPreco(rs.getString(3));
                    a.setCategoria(rs.getInt(4));
                  
                    
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
     public String AlterarProduto(Produto a){
        String sql = "UPDATE tb_produto SET nome = ?, preco = ?,  tb_categoria_id_categoria= ?"
                + " WHERE id_produto = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getPreco());  
            ps.setInt(3, a.getCategoria());  
            ps.setInt(4, a.getId());
          
            
           
            
            if(ps.executeUpdate() > 0){
                return "Atualizado com Sucesso!";
            }else{
                return "Erro ao Atualizar";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
     
     public boolean TestarProduto(int cod){
        boolean Resultado = false;
        try{
            String sql = "SELECT * FROM tb_produto where id_produto = '"+cod+"'";
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
       public List<Produto> PesquisarCodProduto(int Cod) {
        String sql = "select id_produto, nome, preco, tb_categoria_id_categoria FROM tb_produto WHERE id_produto ="+Cod;
        List<Produto> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Produto a = new Produto();
                    
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setPreco(rs.getString(3));
                    a.setCategoria(rs.getInt(4));
                 
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
     public List<Produto> PesquisarNomeProduto(String nome){
        String sql = "select id_produto, nome, preco, tb_categoria_id_categoria FROM tb_produto WHERE nome LIKE'%"+nome+"%'";
        List<Produto> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Produto a = new Produto();
                    
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setPreco(rs.getString(3));
                    a.setCategoria(rs.getInt(4));
                   
                    
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
      public List<Produto> ListarComboProduto(){
        String sql = "select nome from tb_produto order by nome";
        List<Produto> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Produto a = new Produto();
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
       public List<Produto> ConsultaCodigoProduto(String nome){
        
        String sql = "SELECT id_produto FROM tb_produto WHERE nome = '"+nome+"'";
        List<Produto> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Produto a = new Produto();
                    a.setId(rs.getInt(1));
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
        public String ExcluirProduto(Produto a){
        String sql = "DELETE FROM tb_produto WHERE id_produto = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getId());
            
            if(ps.executeUpdate() > 0){
                return "Excluído com sucesso!";
            }else{
                return "Erro ao Excluir!";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
         public List<Produto> ConsultaPrecoProduto(String id_produto){
        
        String sql = "SELECT preco FROM tb_produto WHERE id_produto = '"+id_produto+"'";
        List<Produto> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Produto a = new Produto();
                    a.setPreco(rs.getString(1));
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
         
    public int CapturaId(String nome){
        int id = 0;
        String sql = "SELECT id_produto FROM tb_produto WHERE nome = ?";
        
        PreparedStatement ps;
         try {
             ps = getCon().prepareStatement(sql);
             ps.setString(1, nome);
              
            ResultSet rs = ps.executeQuery();
              
             if (rs != null) {
                 id = rs.getInt(1);
             }
  
              
         } catch (SQLException ex) {
             return id;
         }
       
        
        
        return id;
        
    }
         
         
       
        
  
}
