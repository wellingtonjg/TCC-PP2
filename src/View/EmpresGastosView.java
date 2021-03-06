/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.GastosEmpresaBEAN;
import model.dao.GastosEmpresaDAO;
/**
 *
 * @author WELLINGTON
 */
public class EmpresGastosView extends javax.swing.JInternalFrame {

    /**
     * Creates new form EmpresGastosView
     */
        JDesktopPane index;
    DefaultTableModel table;

    public EmpresGastosView(JDesktopPane desktop) {
        super("GASTOS EMPRESA");
        GastosEmpresaDAO dao = new GastosEmpresaDAO();
        index = desktop;
        initComponents();
        table = (DefaultTableModel) Tabela.getModel();
        for (GastosEmpresaBEAN gastos : dao.read()) {
            Object[] dados = {gastos.getCodigo(), gastos.getTipo(), gastos.getValor(), gastos.getQuantidade(), gastos.getObservacao()};
            table.addRow(dados);
        }
        Tabela.setRowSorter(new TableRowSorter(table));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        painelImagemFundo1 = new View.PainelImagemFundo();
        btnBuscar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        painelImagemFundo2 = new View.PainelImagemFundo();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JFormattedTextField();
        txtValor = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("jMenu3");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setClosable(true);

        painelImagemFundo1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gastos Empresa - Filtragem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 14))); // NOI18N
        painelImagemFundo1.setImg(new ImageIcon("src/Img/12.png"));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        txtBuscar.setText("BUSCAR TIPO");
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        painelImagemFundo2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gastos Empresa - Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 14))); // NOI18N
        painelImagemFundo2.setImg(new ImageIcon("src/Img/12.png"));

        jLabel2.setText("Valor:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantidade:");

        jLabel1.setText("Tipo:");

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        jScrollPane1.setViewportView(txtObservacao);

        jLabel3.setText("Observa????o:");

        txtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValor.setText("R$ 0,00");
        txtValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtValorMouseClicked(evt);
            }
        });

        jLabel5.setText("Codigo Gasto:");

        txtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout painelImagemFundo2Layout = new javax.swing.GroupLayout(painelImagemFundo2);
        painelImagemFundo2.setLayout(painelImagemFundo2Layout);
        painelImagemFundo2Layout.setHorizontalGroup(
            painelImagemFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelImagemFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelImagemFundo2Layout.createSequentialGroup()
                        .addGroup(painelImagemFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelImagemFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(txtCodigo))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelImagemFundo2Layout.setVerticalGroup(
            painelImagemFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo2Layout.createSequentialGroup()
                .addGroup(painelImagemFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelImagemFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnCadastrar))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3)
        );

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo", "Tipo", "Valor", "Quantidade", "Observa????o"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabela);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel12.setText("BY WELLINGTON");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelImagemFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelImagemFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void LimpaFormBuscar() {
        txtBuscar.setText("");
    }

    private void LimpaFormValor() {
        txtValor.setText("");
    }

    private void LimpaForm() {
        txtCodigo.setText("");
        txtTipo.setText("");
        txtValor.setText("");
        txtQuantidade.setText("");
        txtObservacao.setText("");

    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String desc = txtBuscar.getText();
        GastosEmpresaDAO dao = new GastosEmpresaDAO();
        table.setNumRows(0);
        for (GastosEmpresaBEAN gastos : dao.getTipo(desc)) {
            Object[] dados = {gastos.getCodigo(), gastos.getTipo(), gastos.getValor(), gastos.getQuantidade(), gastos.getObservacao()};
            table.addRow(dados);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String codigo = txtCodigo.getText();
        String tipo = txtTipo.getText();
        String valor = txtValor.getText();
        String quantidade = txtQuantidade.getText();
        String observacao = txtObservacao.getText();

        GastosEmpresaDAO dao = new GastosEmpresaDAO();

        if (!codigo.equals("") && !tipo.equals("") && !valor.equals("") && (!observacao.equals(""))&&(!quantidade.equals(""))) {

            GastosEmpresaBEAN usuario = new GastosEmpresaBEAN(codigo, tipo, valor, quantidade, observacao);
            dao.create(usuario);
            LimpaForm();

        } else {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR GASTO! CAMPOS EM BRANCO ");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        table.setNumRows(0);
        GastosEmpresaDAO dao = new GastosEmpresaDAO();
        for (GastosEmpresaBEAN gastos : dao.read()) {
            Object[] dados = {gastos.getCodigo(), gastos.getTipo(), gastos.getValor(), gastos.getQuantidade(), gastos.getObservacao()};
            table.addRow(dados);

        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        String tipo = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 0);
        EmpresGastosEditView edigas = new EmpresGastosEditView(tipo, index);
        edigas.setVisible(true);
    }//GEN-LAST:event_TabelaMouseClicked

    private void txtValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorMouseClicked
        LimpaFormValor();
    }//GEN-LAST:event_txtValorMouseClicked

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        // TODO add your handling code here:
        LimpaFormBuscar();
    }//GEN-LAST:event_txtBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private View.PainelImagemFundo painelImagemFundo1;
    private View.PainelImagemFundo painelImagemFundo2;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JTextArea txtObservacao;
    private javax.swing.JFormattedTextField txtQuantidade;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
