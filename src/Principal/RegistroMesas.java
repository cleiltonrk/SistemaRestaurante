/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import DAO.ConexaoDAO;
import DAO.GarcomDAO;
import DAO.MesaDAO;
import DAO.PedidoDAO;
import DAO.ProdutoDAO;
import Modelo.Garcom;
import Modelo.Mesas;
import Modelo.Pedido;
import Modelo.Produto;
import java.awt.Toolkit;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class RegistroMesas extends javax.swing.JFrame {

    public void botarID(int cod) {
        mesaCod.setText("" + cod);

    }

    public RegistroMesas() {
        initComponents();
        AtualizaCombo();
        AtualizaCombo2();
        AtualizaDate();
        this.setLocationRelativeTo(null);
        setIcon();

    }

    public void InserirDados(int cod) {
        Connection con = ConexaoDAO.AbrirConexao();
        MesaDAO sql = new MesaDAO(con);
        List<Mesas> lista = new ArrayList<>();
        lista = sql.CapturarMesa(cod);

        for (Mesas a : lista) {
            mesaCod.setText("" + a.getId_mesa());
        }
        ConexaoDAO.FecharConexao(con);
    }

    private void AtualizaCombo2() {
        Connection con = ConexaoDAO.AbrirConexao();
        ProdutoDAO sql = new ProdutoDAO(con);
        List<Produto> lista = new ArrayList<>();
        lista = sql.ListarComboProduto();
        for (Produto b : lista) {
            ComboProd.addItem(b.getNome());
        }

        ConexaoDAO.FecharConexao(con);
    }

    public void AtualizaDate() {
        Date date = new Date();
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat hora = new SimpleDateFormat("hh:mm");
        txtData.setText(data.format(date));
        txtHora.setText(hora.format(date));
    }

    private void AtualizaCombo() {
        Connection con = ConexaoDAO.AbrirConexao();
        GarcomDAO sql = new GarcomDAO(con);
        List<Garcom> lista = new ArrayList<>();
        lista = sql.ListarComboGarcom();
        for (Garcom b : lista) {
            ComboGarcom.addItem(b.getNome());
        }

        ConexaoDAO.FecharConexao(con);
    }
    double totalzera = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboGarcom = new javax.swing.JComboBox();
        qtd = new javax.swing.JTextField();
        ComboProd = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        mesaCod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        codGarcom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        codProd = new javax.swing.JTextField();
        btnOP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_pedido", "Produto", "Data", "Hora", "Preço R$", "Id_mesa", "Garçom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 490, 430));

        total.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        total.setForeground(new java.awt.Color(255, 0, 0));
        total.setText("R$ 000");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantidade:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        ComboGarcom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        ComboGarcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboGarcomActionPerformed(evt);
            }
        });
        jPanel1.add(ComboGarcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 30));

        qtd.setEditable(false);
        qtd.setText("1");
        qtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdActionPerformed(evt);
            }
        });
        jPanel1.add(qtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 80, 30));

        ComboProd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));
        ComboProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboProdActionPerformed(evt);
            }
        });
        jPanel1.add(ComboProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 270, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Garçom");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora do Pedido :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 30));

        txtHora.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 270, 31));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data do Pedido :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 30));

        txtData.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 270, 30));

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cancelar");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 90, 40));

        jPanel4.setBackground(new java.awt.Color(0, 255, 0));
        jPanel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Realizar");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 100, 40));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/remove.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/remove-button.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Baking Lion - Personal Use", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Sistema de Restaurante");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Registros de Mesas");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        mesaCod.setEditable(false);
        mesaCod.setBackground(new java.awt.Color(0, 51, 51));
        mesaCod.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        mesaCod.setForeground(new java.awt.Color(255, 255, 255));
        mesaCod.setBorder(null);
        mesaCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaCodActionPerformed(evt);
            }
        });
        jPanel2.add(mesaCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 60, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Mesa:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 890, 60));

        jPanel3.setBackground(new java.awt.Color(0, 204, 0));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pagar");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 130, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Produto");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        codGarcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codGarcomActionPerformed(evt);
            }
        });
        jPanel1.add(codGarcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 40, 30));

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 50, 30));

        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 50, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Total");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));

        codProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProdActionPerformed(evt);
            }
        });
        jPanel1.add(codProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 40, 30));

        btnOP.setBackground(new java.awt.Color(255, 255, 255));
        btnOP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOPMouseClicked(evt);
            }
        });
        btnOP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Opções");
        btnOP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(btnOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdActionPerformed

    private void ComboGarcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboGarcomActionPerformed
        Connection con = ConexaoDAO.AbrirConexao();
        GarcomDAO sql = new GarcomDAO(con);
        List<Garcom> lista = new ArrayList<>();
        String nome = ComboGarcom.getSelectedItem().toString();
        lista = sql.ConsultaCodigoGarcom(nome);
        for (Garcom b : lista) {
            int a = b.getId();
            codGarcom.setText("" + a);
        }

        ConexaoDAO.FecharConexao(con);
    }//GEN-LAST:event_ComboGarcomActionPerformed
    
    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        new MenuGarcom().setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked

        if (ComboProd.getSelectedItem().toString() == "Selecione..") {
            JOptionPane.showMessageDialog(null, "Por favor, selecione o produto", "Sistema Restaurante", JOptionPane.ERROR_MESSAGE);
        }
        if (ComboGarcom.getSelectedItem().toString() == "Selecione..") {
            JOptionPane.showMessageDialog(null, "Por favor, selecione o garçom que realiza o pedido", "Sistema Restaurante", JOptionPane.ERROR_MESSAGE);
        }

        String data = txtData.getText();
        String hora = txtHora.getText();
        String produto = codProd.getText();
        String mesa = mesaCod.getText();
        String garcom = codGarcom.getText();
        int quantidade = Integer.parseInt(qtd.getText());

        Pedido pedido = new Pedido();

        pedido.setData_pedido(data);
        pedido.setHora_pedido(hora);
        pedido.setId_mesa(Integer.parseInt(mesa));
        pedido.setNomeProd(produto);
        pedido.setIdgarcom(Integer.parseInt(garcom));

        Connection con = ConexaoDAO.AbrirConexao();
        PedidoDAO sql = new PedidoDAO(con);
       
        for (int i = 0; i < quantidade; i++) {
            sql.inserir_Pedido(pedido);
        }
        
        
        
        JOptionPane.showMessageDialog(null, "Sistema de Restaurante", "Pedido Realizado com Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        PedidoDAO muda = new PedidoDAO(con);
        Pedido b = new Pedido();
        b.setStatus("Pagar");
        b.setId_mesa(Integer.parseInt(mesaCod.getText()));
        MesaDAO bd = new MesaDAO(con);
        
        
        Mesas a = new Mesas();
        a.setStatus("Pendente");
        a.setId_mesa(Integer.parseInt(mesaCod.getText()));
       

        String resultado = bd.StatusMesaPendente(a);
        AtualizaTablePedido(Integer.parseInt(mesaCod.getText()));
        
        
        
        
       
    }//GEN-LAST:event_jPanel4MouseClicked
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
                        Logger.getLogger(MenuGarcom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  
                }
            }

        }.start();
    }
    
    public void AtualizaTablePedido(int id) {

        Connection con = ConexaoDAO.AbrirConexao();
        PedidoDAO bd = new PedidoDAO(con);
        List<Pedido> lista = new ArrayList<>();
        lista = bd.ListarPedido(id);

        DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();

        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }

        int i = 0;

        for (Pedido tab : lista) {
            tbm.addRow(new String[i]);
            jTable1.setValueAt(tab.getId_pedido(), i, 0);
            jTable1.setValueAt(tab.getNomeProd(), i, 1);
            jTable1.setValueAt(tab.getHora_pedido(), i, 2);
            jTable1.setValueAt(tab.getData_pedido(), i, 3);
            jTable1.setValueAt(tab.getPrecoProd(), i, 4);
            totalzera += tab.getPrecoProd();
            jTable1.setValueAt(tab.getIdgarcom(), i, 5);
            jTable1.setValueAt(tab.getId_mesa(), i, 6);

            i++;
        }
        total.setText(totalzera + "");
        ConexaoDAO.FecharConexao(con);

    }
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jPanel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4AncestorAdded

    private void mesaCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesaCodActionPerformed

    private void ComboProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboProdActionPerformed
        Connection con = ConexaoDAO.AbrirConexao();
        ProdutoDAO sql = new ProdutoDAO(con);
        List<Produto> lista = new ArrayList<>();
        String nome = ComboProd.getSelectedItem().toString();
        lista = sql.ConsultaCodigoProduto(nome);
        for (Produto b : lista) {
            int a = b.getId();
            codProd.setText("" + a);
        }

        ConexaoDAO.FecharConexao(con);
    }//GEN-LAST:event_ComboProdActionPerformed

    private void codGarcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codGarcomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codGarcomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int quant = Integer.parseInt(qtd.getText());
        qtd.setText((quant + 1) + "");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        int quant = Integer.parseInt(qtd.getText());

        if (quant == 1) {
            JOptionPane.showMessageDialog(null, "Mínimo 1 pedido", "Restaurante", JOptionPane.WARNING_MESSAGE);
        } else {
            qtd.setText((quant - 1) + "");
        }

    }//GEN-LAST:event_btnMenosActionPerformed

    private void codProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codProdActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Pagar p = new Pagar();
        p.Pagar(totalzera, Integer.parseInt(mesaCod.getText()));

        p.setVisible(true);
        dispose();

    }//GEN-LAST:event_jPanel3MouseClicked

    private void btnOPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOPMouseClicked
        Connection con = ConexaoDAO.AbrirConexao();
        PedidoDAO sql = new PedidoDAO(con);
        String cod = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        System.out.println(cod); 
        
        int convertido = Integer.parseInt(cod);
        int Id_mesa = Integer.parseInt(mesaCod.getText());
        System.out.println(mesaCod);
        
        opPedido a = new opPedido();
        a.InserirDados(convertido, Id_mesa);
        
        a.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnOPMouseClicked
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

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
            java.util.logging.Logger.getLogger(RegistroMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboGarcom;
    private javax.swing.JComboBox ComboProd;
    private javax.swing.JButton btnMenos;
    private javax.swing.JPanel btnOP;
    private javax.swing.JTextField codGarcom;
    private javax.swing.JTextField codProd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mesaCod;
    private javax.swing.JTextField qtd;
    private javax.swing.JLabel total;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
