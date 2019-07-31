package DAO;

import Modelo.Gerente;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAO.ConexaoDAO;

public class GerenteDAO extends ExecuteSQL {

    public GerenteDAO(Connection con) {
        super(con);
    }

    public boolean Logar(String login, String senha) {
        boolean finalResult = false;
        try {
            String consulta = "select login, senha from tb_gerente "
                    + "where login = '" + login + "' and senha = '" + senha + "'";
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Gerente a = new Gerente();
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

    public String inserir_Gerente(Gerente a) {
        String sql = "insert into tb_gerente values(0,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getNome());
            ps.setString(2, a.getBairro());
            ps.setString(3, a.getRua());
            ps.setInt(4, a.getNumero());
            ps.setString(5, a.getCep());
            ps.setString(6, a.getTelefone());
            ps.setString(7, a.getRg());
            ps.setString(8, a.getEmail());
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

    public List<Gerente> ListarGerente() {
        String sql = "select id_gerente, nome, bairro, rua, numero, cep, telefone, rg, email, cpf, login, senha from tb_gerente";
        List<Gerente> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Gerente a = new Gerente();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setBairro(rs.getString(3));
                    a.setRua(rs.getString(4));
                    a.setNumero(rs.getInt(5));
                    a.setCep(rs.getString(6));
                    a.setTelefone(rs.getString(7));
                    a.setRg(rs.getString(8));
                    a.setEmail(rs.getString(9));
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

    public boolean TestarGerente(int cod) {
        boolean Resultado = false;
        try {
            String sql = "SELECT * FROM tb_gerente where id_gerente = '" + cod + "'";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Resultado = true;
                }
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return Resultado;
    }

    public List<Gerente> CapturarGerente(int cod) {
        String sql = "SELECT * FROM tb_gerente WHERE id_gerente = '" + cod + "'";
        List<Gerente> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Gerente a = new Gerente();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setBairro(rs.getString(3));
                    a.setRua(rs.getString(4));
                    a.setNumero(rs.getInt(5));
                    a.setCep(rs.getString(6));
                    a.setTelefone(rs.getString(7));
                    a.setRg(rs.getString(8));
                    a.setEmail(rs.getString(9));
                    a.setCpf(rs.getString(10));
                    a.setLogin(rs.getString(11));
                    a.setSenha(rs.getString(12));

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

    public String AlterarGerente(Gerente a) {
        String sql = "UPDATE tb_gerente SET nome = ?, rg = ?, cpf = ?"
                + ",email = ?, telefone = ?, bairro = ?, rua = ?, numero = ?, cep = ?, login = ?, senha = ? WHERE id_gerente = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getNome());
            ps.setString(2, a.getRg());
            ps.setString(3, a.getCpf());
            ps.setString(4, a.getEmail());
            ps.setString(5, a.getTelefone());
            ps.setString(6, a.getBairro());
            ps.setString(7, a.getRua());
            ps.setInt(8, a.getNumero());
            ps.setString(9, a.getCep());
            ps.setString(10, a.getLogin());
            ps.setString(11, a.getSenha());
            ps.setInt(12, a.getId());

            if (ps.executeUpdate() > 0) {
                return "Atualizado com Sucesso!";
            } else {
                return "Erro ao Atualizar";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<Gerente> PesquisarCodGerente(int Cod) {
        String sql = "select id_gerente, nome, bairro, rua, numero, cep, telefone, rg, email, cpf, login, senha  FROM tb_gerente WHERE id_gerente =" + Cod;
        List<Gerente> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Gerente a = new Gerente();

                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setBairro(rs.getString(3));
                    a.setRua(rs.getString(4));
                    a.setNumero(rs.getInt(5));
                    a.setCep(rs.getString(6));
                    a.setTelefone(rs.getString(7));
                    a.setRg(rs.getString(8));
                    a.setEmail(rs.getString(9));
                    a.setCpf(rs.getString(10));
                    a.setLogin(rs.getString(11));
                    a.setSenha(rs.getString(12));
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

    public List<Gerente> PesquisarNomeGerente(String nome) {
        String sql = "select id_gerente, nome, bairro, rua, numero, cep, telefone, rg, email, cpf, login, senha FROM tb_Gerente WHERE nome LIKE'%" + nome + "%'";
        List<Gerente> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Gerente a = new Gerente();

                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setBairro(rs.getString(3));
                    a.setRua(rs.getString(4));
                    a.setNumero(rs.getInt(5));
                    a.setCep(rs.getString(6));
                    a.setTelefone(rs.getString(7));
                    a.setRg(rs.getString(8));
                    a.setEmail(rs.getString(9));
                    a.setCpf(rs.getString(10));
                    a.setLogin(rs.getString(11));
                    a.setSenha(rs.getString(12));

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

    public List<Gerente> ListarComboGerente() {
        String sql = "select nome from tb_gerente order by nome";
        List<Gerente> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Gerente a = new Gerente();
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

    public String ExcluirGerente(Gerente a) {
        String sql = "DELETE FROM tb_gerente WHERE id_gerente = ?";

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
     public List<Gerente> ConsultaCodigoGerente(String nome){
        
        String sql = "SELECT id_gerente FROM tb_gerente WHERE nome = '"+nome+"'";
        List<Gerente> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Gerente a = new Gerente();
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
