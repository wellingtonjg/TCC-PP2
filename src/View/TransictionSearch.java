/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.TransictionBEAN;
import model.dao.TransictionDAO;

/**
 *
 * @author WELLINGTON
 */
public class TransictionSearch extends javax.swing.JInternalFrame {

    /**
     * Creates new form TransictionSearch
     */
    JDesktopPane index;
    DefaultTableModel table;

    public TransictionSearch(JDesktopPane desktop) {
        super("LISTA DE TRANSAÇÕES");
        TransictionDAO dao = new TransictionDAO();
        index = desktop;
        initComponents();
        table = (DefaultTableModel) Transacao.getModel();
        for (TransictionBEAN transacao : dao.read()) {
            Object[] dados = {transacao.getCodigo(), transacao.getData(), transacao.getQuantidade(), transacao.getProduto()};
            table.addRow(dados);

        }
        Transacao.setRowSorter(new TableRowSorter(table));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Transacao = new javax.swing.JTable();
        painelImagemFundo1 = new View.PainelImagemFundo();
        btnAtualizar = new javax.swing.JToggleButton();
        btnBuscar = new javax.swing.JToggleButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);

        Transacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data", "Quantidade", "Produto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Transacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Transacao);

        painelImagemFundo1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listar Transação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 14))); // NOI18N
        painelImagemFundo1.setImg(new ImageIcon("src/Img/img111.jpg"));

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.setText("BUSCAR CÓDIGO");
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
                .addGap(30, 30, 30)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizar))
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel9.setText("BY WELLINGTON");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void LimpaFormBuscar() {
        txtBuscar.setText("");
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String buscar = txtBuscar.getText();
        TransictionDAO dao = new TransictionDAO();
        table.setNumRows(0);
        for (TransictionBEAN transacao : dao.getCodigo(buscar)) {
            Object[] dados = {transacao.getCodigo(), transacao.getData(), transacao.getQuantidade(), transacao.getProduto()};
            table.addRow(dados);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        table.setNumRows(0);
        TransictionDAO dao = new TransictionDAO();
        for (TransictionBEAN transacao : dao.read()) {
            Object[] dados = {transacao.getCodigo(), transacao.getData(), transacao.getQuantidade(), transacao.getProduto()};
            table.addRow(dados);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void TransacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransacaoMouseClicked
        String codigo = (String) Transacao.getValueAt(Transacao.getSelectedRow(), 1);
        TransictionEditView editTransacao = new TransictionEditView(codigo, index);
        editTransacao.setVisible(true);
    }//GEN-LAST:event_TransacaoMouseClicked

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        // TODO add your handling code here:
        LimpaFormBuscar();
    }//GEN-LAST:event_txtBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Transacao;
    private javax.swing.JToggleButton btnAtualizar;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private View.PainelImagemFundo painelImagemFundo1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}