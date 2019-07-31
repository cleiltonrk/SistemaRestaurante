/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Alterar;

import DAO.ConexaoDAO;
import DAO.GerenteDAO;
import Modelo.Gerente;
import Principal.Menu;
import Visao.Cadastrar.CadastrarGerente;
import Visao.Consultar.ConsultarGerente;
import Visao.Excluir.ExcluirGerente;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class AlterarGerente extends javax.swing.JFrame {

    /**
     * Creates new form alterarcliente
     */
    public AlterarGerente() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIcon();
    }

    private void InserirDados(int cod) {
        Connection con = ConexaoDAO.AbrirConexao();
        GerenteDAO sql = new GerenteDAO(con);
        List<Gerente> lista = new ArrayList<>();
        lista = sql.CapturarGerente(cod);

        for (Gerente a : lista) {
            iptId.setText("" + a.getId());
            iptNome.setText(a.getNome());
            iptBairro.setText(a.getBairro());
            iptRua.setText(a.getRua());
            iptNumero.setText("" + a.getNumero());
            iptCEP.setText(a.getCep());
            iptTelefone.setText(a.getTelefone());
            iptRG.setText(a.getRg());
            iptEmail.setText(a.getEmail());
            iptCPF.setText(a.getCpf());
            iptLogin.setText(a.getLogin());
            iptSenha.setText(a.getSenha());

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator12 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        iptBairro = new javax.swing.JTextField();
        iptNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        iptRua = new javax.swing.JTextField();
        iptTelefone = new javax.swing.JFormattedTextField();
        iptNumero = new javax.swing.JTextField();
        iptCEP = new javax.swing.JFormattedTextField();
        iptEmail = new javax.swing.JTextField();
        iptRG = new javax.swing.JFormattedTextField();
        iptCPF = new javax.swing.JFormattedTextField();
        iptLogin = new javax.swing.JTextField();
        iptSenha = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        attCod = new javax.swing.JTextField();
        labelId = new javax.swing.JLabel();
        iptId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel18 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 49, 38));
        jLabel4.setText("Nome :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 49, 38));
        jLabel6.setText("Telefone :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 228, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 49, 38));
        jLabel7.setText("Email :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 49, 38));
        jLabel8.setText("RG :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 307, -1, -1));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 49, 38));
        jLabel9.setText("CPF :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 343, -1, -1));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 49, 38));
        jLabel10.setText("Login :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 386, -1, -1));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 49, 38));
        jLabel11.setText("Senha :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 422, -1, -1));

        iptBairro.setBackground(new java.awt.Color(0, 51, 51));
        iptBairro.setForeground(new java.awt.Color(255, 255, 255));
        iptBairro.setBorder(null);
        jPanel2.add(iptBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, 20));

        iptNome.setBackground(new java.awt.Color(0, 51, 51));
        iptNome.setForeground(new java.awt.Color(255, 255, 255));
        iptNome.setBorder(null);
        iptNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                iptNomeFocusGained(evt);
            }
        });
        iptNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptNomeActionPerformed(evt);
            }
        });
        jPanel2.add(iptNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 280, 20));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 49, 38));
        jLabel5.setText("Bairro :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(238, 49, 38));
        jLabel13.setText("Rua :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel17.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(238, 49, 38));
        jLabel17.setText("Nº :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 229, -1, -1));

        jLabel18.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(238, 49, 38));
        jLabel18.setText("CEP :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 129, -1, -1));

        iptRua.setBackground(new java.awt.Color(0, 51, 51));
        iptRua.setForeground(new java.awt.Color(255, 255, 255));
        iptRua.setBorder(null);
        jPanel2.add(iptRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 70, 20));

        iptTelefone.setBackground(new java.awt.Color(0, 51, 51));
        iptTelefone.setBorder(null);
        iptTelefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            iptTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(iptTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 151, 20));

        iptNumero.setBackground(new java.awt.Color(0, 51, 51));
        iptNumero.setForeground(new java.awt.Color(255, 255, 255));
        iptNumero.setBorder(null);
        iptNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptNumeroActionPerformed(evt);
            }
        });
        jPanel2.add(iptNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 70, 20));

        iptCEP.setBackground(new java.awt.Color(0, 51, 51));
        iptCEP.setBorder(null);
        iptCEP.setForeground(new java.awt.Color(255, 255, 255));
        try {
            iptCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(iptCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 107, 20));

        iptEmail.setBackground(new java.awt.Color(0, 51, 51));
        iptEmail.setForeground(new java.awt.Color(255, 255, 255));
        iptEmail.setBorder(null);
        jPanel2.add(iptEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 284, 20));

        iptRG.setBackground(new java.awt.Color(0, 51, 51));
        iptRG.setBorder(null);
        iptRG.setForeground(new java.awt.Color(255, 255, 255));
        try {
            iptRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(iptRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 284, 20));

        iptCPF.setBackground(new java.awt.Color(0, 51, 51));
        iptCPF.setBorder(null);
        iptCPF.setForeground(new java.awt.Color(255, 255, 255));
        try {
            iptCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(iptCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 284, 20));

        iptLogin.setBackground(new java.awt.Color(0, 51, 51));
        iptLogin.setForeground(new java.awt.Color(255, 255, 255));
        iptLogin.setBorder(null);
        jPanel2.add(iptLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 391, 284, 20));

        iptSenha.setBackground(new java.awt.Color(0, 51, 51));
        iptSenha.setForeground(new java.awt.Color(255, 255, 255));
        iptSenha.setBorder(null);
        jPanel2.add(iptSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 284, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rotate.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 181, -1, -1));

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(238, 49, 38));
        jLabel15.setText("Código:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 49, -1, -1));

        attCod.setBackground(new java.awt.Color(51, 255, 255));
        attCod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                attCodFocusGained(evt);
            }
        });
        attCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attCodActionPerformed(evt);
            }
        });
        jPanel2.add(attCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 44, 40));

        labelId.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        labelId.setForeground(new java.awt.Color(238, 49, 38));
        labelId.setText("Id :");
        jPanel2.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 130, -1, -1));

        iptId.setBackground(new java.awt.Color(0, 51, 51));
        iptId.setForeground(new java.awt.Color(255, 255, 255));
        iptId.setBorder(null);
        iptId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptIdActionPerformed(evt);
            }
        });
        jPanel2.add(iptId, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 70, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 280, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 110, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 70, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 150, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 60, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 60, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 280, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 280, 10));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 280, 10));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 280, 10));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 280, 10));

        jPanel18.setBackground(new java.awt.Color(255, 0, 0));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cancelar");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel20)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, 40));

        jPanel8.setBackground(new java.awt.Color(240, 240, 27));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Limpar");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel9.setBackground(new java.awt.Color(240, 240, 27));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Limpar");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 90, 40));

        jPanel16.setBackground(new java.awt.Color(240, 240, 27));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Limpar");
        jPanel16.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel17.setBackground(new java.awt.Color(240, 240, 27));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Limpar");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 90, 40));

        jPanel8.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 90, 40));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 100, 40));

        jPanel4.setBackground(new java.awt.Color(0, 255, 0));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Alterar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, 40));

        jPanel5.setBackground(new java.awt.Color(51, 255, 0));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier-tool.png"))); // NOI18N
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 40, 40));

        jLabel25.setFont(new java.awt.Font("Baking Lion - Personal Use", 2, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("Restaurante 2019");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 150, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 64, 770, 620));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rubbish-bin.png"))); // NOI18N
        jLabel26.setText("Excluir");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        jLabel27.setText("Cadastrar");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pencil-edit-button.png"))); // NOI18N
        jLabel28.setText("Consultar");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home-icon-silhouette (1).png"))); // NOI18N
        jLabel19.setText("Início");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jLabel29.setText("Alterar Gerente");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel19)
                .addGap(12, 12, 12)
                .addComponent(jLabel28)
                .addGap(22, 22, 22)
                .addComponent(jLabel27)
                .addGap(11, 11, 11)
                .addComponent(jLabel26)
                .addGap(98, 98, 98)
                .addComponent(jLabel29)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jLabel29)))
                .addGap(18, 18, 18))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 630, 60));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/remove-button.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 30, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/remove.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 796, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iptNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptNomeActionPerformed

    }//GEN-LAST:event_iptNomeActionPerformed

    private void iptNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iptNomeFocusGained

    }//GEN-LAST:event_iptNomeFocusGained

    private void iptNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptNumeroActionPerformed

    private void attCodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_attCodFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_attCodFocusGained

    private void attCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attCodActionPerformed

    private void iptIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptIdActionPerformed

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
        new Menu().setVisible(true);
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
           String nome = iptNome.getText();
        String cep = iptCEP.getText();
        String rua = iptRua.getText();
        String numero = iptNumero.getText();
        String bairro = iptBairro.getText();
        String email = iptEmail.getText();
        String fone = iptTelefone.getText();
        String cpf = iptCPF.getText();
        String rg = iptRG.getText();
        String login = iptLogin.getText();
        String senha = iptSenha.getText();
        String id = iptId.getText();
        int idN = Integer.parseInt(id);
       

        if (nome.equals("") || cep.equals("") || rua.equals("") || numero.equals("") || bairro.equals("") || fone.equals("") || cpf.equals("") || rg.equals("") || login.equals("") || senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum Campo pode Estar Vazio!", "Sistema Restaurante", JOptionPane.WARNING_MESSAGE);
        } else {
            Connection con = ConexaoDAO.AbrirConexao();
            GerenteDAO sql = new GerenteDAO(con);
            int n = Integer.parseInt(numero);

            Gerente a = new Gerente();

            a.setBairro(bairro);
            a.setCep(cep);
            a.setCpf(cpf);
            a.setEmail(email);
            a.setNome(nome);
            a.setNumero(n);
            a.setRg(rg);
            a.setRua(rua);
            a.setTelefone(fone);
            a.setLogin(login);
            a.setSenha(senha);
            a.setId(idN);

            String resultado = sql.AlterarGerente(a);

            System.out.println(resultado);
            ConexaoDAO.FecharConexao(con);

            iptNome.setText("");
            iptCEP.setText("");
            iptNumero.setText("");
            iptBairro.setText("");
            iptEmail.setText("");
            iptTelefone.setText("");
            iptRua.setText("");
            iptRG.setText("");
            iptCPF.setText("");
            iptLogin.setText("");
            iptSenha.setText("");
            iptId.setText("");

            JOptionPane.showMessageDialog(null, "Alteração Realizada com Sucesso!", "Video Locadora", JOptionPane.INFORMATION_MESSAGE);

            dispose();

        }
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
         String codigo = attCod.getText();
        Connection con = ConexaoDAO.AbrirConexao();
        GerenteDAO sql = new GerenteDAO(con);

        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite um Código para Atualizar", "Sistema Restaurante", JOptionPane.WARNING_MESSAGE);
        } else {
            int cod = Integer.parseInt(codigo);
            if (sql.TestarGerente(cod) == false) {
                JOptionPane.showMessageDialog(null, "Código não encontrado no Banco", "Sistema Restaurante", JOptionPane.ERROR_MESSAGE);
                ConexaoDAO.FecharConexao(con);
            }

            iptNome.setText("");
            iptBairro.setText("");
            iptCEP.setText("");
            iptCPF.setText("");
            iptEmail.setText("");
            iptRua.setText("");
            iptNumero.setText("");
            iptRG.setText("");
            iptRua.setText("");
            iptTelefone.setText("");
            iptLogin.setText("");
            iptSenha.setText("");
            iptId.setText("");

            InserirDados(cod);
            attCod.setText("");
        }
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        new ExcluirGerente().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        new CadastrarGerente().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        new ConsultarGerente().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
     dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
       dispose();
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
            iptNome.setText("");
            iptBairro.setText("");
            iptCEP.setText("");
            iptCPF.setText("");
            iptEmail.setText("");
            iptRua.setText("");
            iptNumero.setText("");
            iptRG.setText("");
            iptRua.setText("");
            iptTelefone.setText("");
            iptLogin.setText("");
            iptSenha.setText("");
            iptId.setText("");
    }//GEN-LAST:event_jPanel8MouseClicked
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
            java.util.logging.Logger.getLogger(AlterarGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attCod;
    private javax.swing.JTextField iptBairro;
    private javax.swing.JFormattedTextField iptCEP;
    private javax.swing.JFormattedTextField iptCPF;
    private javax.swing.JTextField iptEmail;
    private javax.swing.JTextField iptId;
    private javax.swing.JTextField iptLogin;
    private javax.swing.JTextField iptNome;
    private javax.swing.JTextField iptNumero;
    private javax.swing.JFormattedTextField iptRG;
    private javax.swing.JTextField iptRua;
    private javax.swing.JPasswordField iptSenha;
    private javax.swing.JFormattedTextField iptTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelId;
    // End of variables declaration//GEN-END:variables
}
