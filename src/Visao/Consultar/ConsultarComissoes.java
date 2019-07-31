/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Consultar;

import DAO.ConexaoDAO;
import DAO.GarcomDAO;
import DAO.PedidoDAO;
import Modelo.Comissao;
import Modelo.Garcom;
import Principal.MenuGerente;
import Principal.PagarComissao;
import Visao.Alterar.AlterarProduto;
import Visao.Cadastrar.CadastrarProduto;
import Visao.Excluir.ExcluirProduto;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cleil
 */
public class ConsultarComissoes extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarComissoes
     */
    public ConsultarComissoes() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIcon();
         AtualizaTable();
       
    }
     private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
     
     public void Atualizando() {
        

        new Thread() {
            public void run() {
                while (true) {
                   AtualizaTable();
                            
                   
                    
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        
                    }
                  
                }
            }

        }.start();
    }
     
       public void VerificaSelecao() {
        

        new Thread() {
            public void run() {
                while (true) {
                   
                            
                    if(jTable1.getSelectedRow() != -1){
                        btnOP.setEnabled(true);
                    }else{
                        btnOP.setEnabled(false);
                    }
                    
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ConsultarComissoes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  
                }
            }

        }.start();
    }
     private void AtualizaTable(){
         System.out.println("Listando Comissoes");
        Connection con = ConexaoDAO.AbrirConexao();
        PedidoDAO bd = new PedidoDAO(con);
        List<Comissao> lista = new ArrayList<>();
        lista = bd.ListarComissoes();
        
        DefaultTableModel tbm =  (DefaultTableModel) jTable1.getModel();
        
        while(tbm.getRowCount() > 0){
            tbm.removeRow(0);
        }
        
        int i = 0;
        double valor = 0;
        int idgarcom = 0;
        for(Comissao tab : lista){
           
            tbm.addRow(new String[i]);
            jTable1.setValueAt(tab.getId_garcom(), i, 0);
            jTable1.setValueAt(tab.getNome_garcom(), i, 1);
            jTable1.setValueAt("R$"+(tab.getValor()/10), i, 2);
            
           
                       
            i++;
        }
        
        ConexaoDAO.FecharConexao(con);
        
    }
      private void BuscaCod(int Cod){
        Connection con = ConexaoDAO.AbrirConexao();
         String codigo = txtCod.getText();
        GarcomDAO bd = new GarcomDAO(con);
        List<Garcom> lista = new ArrayList<>();
        lista = bd.PesquisarCodGarcom(Cod);
          if (txtCod.equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum Campo pode Estar Vazio!", "Sistema Restaurante", JOptionPane.WARNING_MESSAGE);
        } else {
            int cod = Integer.parseInt(codigo);
            if (bd.TestarGarcom(cod) == false) {
                JOptionPane.showMessageDialog(null, "Código não encontrado no Banco", "Sistema Restaurante", JOptionPane.ERROR_MESSAGE);
                ConexaoDAO.FecharConexao(con);
                
            }
            
         }
        DefaultTableModel tbm =  (DefaultTableModel) jTable1.getModel();
        while(tbm.getRowCount() > 0){
            tbm.removeRow(0);
        }
         int i = 0;
        for(Garcom tab : lista){
            tbm.addRow(new String[i]);
            jTable1.setValueAt(tab.getId(), i, 0);
            jTable1.setValueAt(tab.getNome(), i, 1);
            jTable1.setValueAt("",i,2);
            i++;
      
        }
    }
     private void BuscaNome(String nome){
        
        Connection con = ConexaoDAO.AbrirConexao();
        GarcomDAO bd = new GarcomDAO(con);
        List<Garcom> lista = new ArrayList<>();
        lista = bd.PesquisarNomeGarcom(nome);
        
        DefaultTableModel tbm =  (DefaultTableModel) jTable1.getModel();
        
        while(tbm.getRowCount() > 0){
            tbm.removeRow(0);
        }
        
        int i = 0;
        for(Garcom tab : lista){
            tbm.addRow(new String[i]);
            jTable1.setValueAt(tab.getId(), i, 0);
            jTable1.setValueAt(tab.getNome(), i, 1);
            jTable1.setValueAt("", i, 2);
         
                       
            i++;
        }
        
        
        
        ConexaoDAO.FecharConexao(con);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnOP = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setBackground(new java.awt.Color(0, 51, 51));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier-tool.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 10));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pesquisar por Nome");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("SIstema de Restaurante");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        txtCod.setBackground(new java.awt.Color(0, 51, 51));
        txtCod.setForeground(new java.awt.Color(255, 255, 255));
        txtCod.setBorder(null);
        jPanel2.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier-tool.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, 10));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pesquisar por Código");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 255, 0));
        jPanel3.setForeground(new java.awt.Color(0, 255, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Exibir Todos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 120, 40));

        jLabel2.setFont(new java.awt.Font("Baking Lion - Personal Use", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Restaurante 2019");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        btnOP.setBackground(new java.awt.Color(51, 255, 0));
        btnOP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOPMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pagar");

        javax.swing.GroupLayout btnOPLayout = new javax.swing.GroupLayout(btnOP);
        btnOP.setLayout(btnOPLayout);
        btnOPLayout.setHorizontalGroup(
            btnOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOPLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        btnOPLayout.setVerticalGroup(
            btnOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(btnOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, 40));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 500));

        jScrollPane1.setBorder(null);

        jTable1.setBackground(new java.awt.Color(255, 0, 0));
        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Comissão(10%)"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setName(""); // NOI18N
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(255, 102, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 630, 410));

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home-icon-silhouette (1).png"))); // NOI18N
        jLabel19.setText("Início");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Comissões");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/remove.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/remove-button.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel19)
                .addGap(209, 209, 209)
                .addComponent(jLabel13)
                .addGap(188, 188, 188)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(397, 397, 397))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel13)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 630, 60));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        new MenuGerente().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void btnOPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOPMouseClicked
         
       
        String cod = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        System.out.println(cod); 
        
        int convertido = Integer.parseInt(cod);
        
        PagarComissao a = new PagarComissao();
        a.InserirDados(convertido);
        
        a.setVisible(true);
         Atualizando();
        
    }//GEN-LAST:event_btnOPMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarComissoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarComissoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarComissoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarComissoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarComissoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnOP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
