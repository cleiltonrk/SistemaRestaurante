
package DAO;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.Garcom;



public class GarcomDAO extends ExecuteSQL{
     public GarcomDAO(Connection con) {
        super(con);
    }

    public boolean Logar(String login, String senha) {
        boolean finalResult = false;
        try {
            String consulta = "select login, senha from tb_garcom "
                    + "where login = '" + login + "' and senha = '" + senha + "'";
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Garcom a = new Garcom();
                    a.setLogin(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    finalResult = true;
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return finalResult;
    }

    public String inserir_Garcom(Garcom a) {
        String sql = "insert into tb_garcom values(0,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getNome());
            ps.setString(2, a.getData_nasc());
            ps.setString(3, a.getTelefone());
            ps.setString(4, a.getRua());
            ps.setString(5, a.getBairro());
            ps.setString(6, a.getCep());
            ps.setInt(7, a.getNumero());
            ps.setString(8, a.getGrau_escolaridade());
            ps.setString(9, a.getCpf());
            ps.setString(10, a.getLogin());
            ps.setString(11, a.getSenha());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<Garcom> ListarGarcom() {
        String sql = "select id, nome, data_nasc, telefone, rua, bairro, cep, numero,grau_escolaridade, cpf, login, senha from tb_garcom";
        List<Garcom> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Garcom a = new Garcom();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setData_nasc(rs.getString(3));
                    a.setTelefone(rs.getString(4));
                    a.setRua(rs.getString(5));
                    a.setBairro(rs.getString(6));
                    a.setCep(rs.getString(7));
                    a.setNumero(rs.getInt(8));
                    a.setGrau_escolaridade(rs.getString(9));
                    a.setCpf(rs.getString(10));
                    a.setLogin(rs.getString(11));
                    a.setSenha(rs.getString(12));
                    
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
    public List<Garcom> CapturarGarcom(int cod){
        String sql = "SELECT * FROM tb_garcom WHERE id = '"+cod+"'";
        List<Garcom> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Garcom a = new Garcom();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setData_nasc(rs.getString(3));
                    a.setTelefone(rs.getString(4));
                    a.setRua(rs.getString(5));
                    a.setBairro(rs.getString(6));
                    a.setCep(rs.getString(7));
                    a.setNumero(rs.getInt(8));
                    a.setGrau_escolaridade(rs.getString(9));
                    a.setCpf(rs.getString(10));
                    a.setLogin(rs.getString(11));
                    a.setSenha(rs.getString(12));
                    
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
     public String AlterarGarcom(Garcom a){
        String sql = "UPDATE tb_garcom SET nome = ?, data_nasc = ?, telefone = ?"
                + ",rua = ?, bairro = ?, cep = ?, numero = ?, grau_escolaridade = ?, cpf = ?, login = ?, senha = ? WHERE id = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getData_nasc());
            ps.setString(3, a.getTelefone());
            ps.setString(4, a.getRua());
            ps.setString(5, a.getBairro());
            ps.setString(6, a.getCep());
            ps.setInt(7, a.getNumero());
            ps.setString(8, a.getGrau_escolaridade());
            ps.setString(9, a.getCpf());
            ps.setString(10, a.getLogin());
            ps.setString(11, a.getSenha());
            ps.setInt(12, a.getId());
            
           
            
            if(ps.executeUpdate() > 0){
                return "Atualizado com Sucesso!";
            }else{
                return "Erro ao Atualizar";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
     public boolean TestarGarcom(int cod){
        boolean Resultado = false;
        try{
            String sql = "SELECT * FROM tb_garcom where id = '"+cod+"'";
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
       public List<Garcom> PesquisarCodGarcom(int Cod) {
          String sql = "select id, nome, data_nasc, telefone, rua, bairro, cep, numero,grau_escolaridade, cpf, login, senha from tb_garcom WHERE id="+Cod;
        List<Garcom> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Garcom a = new Garcom();
                    
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setData_nasc(rs.getString(3));
                    a.setTelefone(rs.getString(4));
                    a.setRua(rs.getString(5));
                    a.setBairro(rs.getString(6));
                    a.setCep(rs.getString(7));
                    a.setNumero(rs.getInt(8));
                    a.setGrau_escolaridade(rs.getString(9));
                    a.setCpf(rs.getString(10));
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
     public List<Garcom> PesquisarNomeGarcom(String nome){
        String sql = "select id, nome, data_nasc, telefone, rua, bairro, cep, numero,grau_escolaridade, cpf, login, senha FROM tb_garcom WHERE nome LIKE'%"+nome+"%'";
        List<Garcom> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Garcom a = new Garcom();
                    
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setData_nasc(rs.getString(3));
                    a.setTelefone(rs.getString(4));
                    a.setRua(rs.getString(5));
                    a.setBairro(rs.getString(6));
                    a.setCep(rs.getString(7));
                    a.setNumero(rs.getInt(8));
                    a.setGrau_escolaridade(rs.getString(9));
                    a.setCpf(rs.getString(10));
                    
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
 public List<Garcom> ListarComboGarcom() {
        String sql = "select nome from tb_garcom order by nome";
        List<Garcom> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Garcom a = new Garcom();
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

    public String ExcluirGarcom(Garcom a) {
        String sql = "DELETE FROM tb_garcom WHERE id = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getId());

            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso!";
            } else {
                return "Erro ao Excluir!";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
     public List<Garcom> ConsultaCodigoGarcom(String nome){
        
        String sql = "SELECT id FROM tb_garcom WHERE nome = '"+nome+"'";
        List<Garcom> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Garcom a = new Garcom();
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
}

