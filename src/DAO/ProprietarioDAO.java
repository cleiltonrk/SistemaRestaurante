
package DAO;


import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAO.ConexaoDAO;
import Modelo.Proprietario;

public class ProprietarioDAO extends ExecuteSQL {

    public ProprietarioDAO(Connection con) {
        super(con);
    }

    public boolean Logar(String login, String senha) {
        boolean finalResult = false;
        try {
            String sql = "select login, senha from tb_proprietario "
                    + "where login = '" + login + "' and senha = '" + senha + "'";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Proprietario a = new Proprietario();
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

   
}