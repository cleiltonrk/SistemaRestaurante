/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import DAO.*;
import java.sql.Connection;
public class TestaConexao {
    public static void main(String[] args) {
        
        Connection a = ConexaoDAO.AbrirConexao();
        
        if(a != null){
            System.out.println("Conexão ok!");
        }else{
            System.out.println("Prestou não");
        }
    }
}
