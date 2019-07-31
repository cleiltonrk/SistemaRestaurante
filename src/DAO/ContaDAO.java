
package DAO;

import Modelo.Conta;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAO.ConexaoDAO;
import Modelo.Garcom;
public class ContaDAO extends ExecuteSQL{

    public ContaDAO(Connection con) {
        super(con);
    }
     public String inserir_Conta(Conta a) {
        String sql = "insert into tb_conta values(0,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setInt(1, a.getNumero_mesa());
            ps.setString(2, a.getData());
            ps.setInt(3, a.getId_garcon());
            ps.setString(4, a.getHora());
            ps.setString(5, a.getStatus());
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<Conta> ListarContas() {
        String sql = "select id_conta, numero_mesa, data, id_garcom_id, hora, status  from tb_conta";
        List<Conta> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Conta a = new Conta();
                    a.setId_conta(rs.getInt(1));
                    a.setNumero_mesa(rs.getInt(2));
                    a.setData(rs.getString(3));
                    a.setId_garcon(rs.getInt(4));
                    a.setHora(rs.getString(5));
                    a.setStatus(rs.getString(6));
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

   
}