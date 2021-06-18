/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import connection.ConnectionFactory;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author WELLINGTON
 */
public class IndexView extends javax.swing.JFrame {

  ConnectionFactory conecta = new ConnectionFactory();
    /**
     * Creates new form IndexView
     */
    public IndexView(String usuario, String empresa) {
        super("MENU CRIATTUS");
        initComponents();
        conecta.conecta();
        pegaUsuario.setText(usuario);
        pegaEmpresa.setText(empresa);

        if (!usuario.equals("mestre")) {
            try {
                conecta.executaSQL("SELECT * FROM User WHERE  NomeUsuario='" + pegaUsuario.getText() + "'");
                conecta.resultset.first();
                if (conecta.resultset.getString("Acesso").equals("Vendedor")) {
                    menuVendedores.setVisible(false);
                    menuCadastrarUsuario.setVisible(false);
                    menuCadastrarEmpresa.setVisible(false);
                    menuVendasListar.setVisible(false);
                    menuListarProduto.setVisible(false);
                } else {
                    menuVendedores.setVisible(true);
                    menuCadastrarUsuario.setVisible(true);
                    menuCadastrarEmpresa.setVisible(true);
                    menuVendasListar.setVisible(true);
                    menuListarProduto.setVisible(true);
                }
            } catch (SQLException sqlex) {
                JOptionPane.showMessageDialog(null, "você não tem permissão para acessar" + sqlex);
            }
        }

    }

    IndexView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        indexDesktopPanel = new javax.swing.JDesktopPane();
        painelImagemFundo1 = new View.PainelImagemFundo();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pegaUsuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pegaEmpresa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        menuUsuario = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuVoltarLogin = new javax.swing.JMenuItem();
        menuCadastrarUsuario = new javax.swing.JMenu();
        menuListarUsuario = new javax.swing.JMenuItem();
        menuListar = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        menuCadastrarProduto = new javax.swing.JMenuItem();
        menuListarProduto = new javax.swing.JMenuItem();
        menuVendedores = new javax.swing.JMenu();
        menuCadastrarVendedor = new javax.swing.JMenuItem();
        menuListarVendedor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuVendasCadastrar = new javax.swing.JMenuItem();
        menuVendasListar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuTransacoesCadastrar = new javax.swing.JMenuItem();
        menuTransacoesListar = new javax.swing.JMenuItem();
        menuCadastrarEmpresa = new javax.swing.JMenu();
        MenuCastrarEmpresa = new javax.swing.JMenuItem();
        MenuListarEmpresa = new javax.swing.JMenuItem();
        menuCadastrarGastos = new javax.swing.JMenuItem();
        menuListarClientes = new javax.swing.JMenu();
        MenuCadastrarCliente = new javax.swing.JMenuItem();
        menuListarCliente = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MenuRelatorioVendas = new javax.swing.JMenuItem();
        MenuRelatorioCondicionais = new javax.swing.JMenuItem();
        MenuRelatorioGastos = new javax.swing.JMenuItem();
        MenuProdutoRelatorio = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        indexDesktopPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        painelImagemFundo1.setImg(new ImageIcon("src/Img/imag.jpg"));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 64)); // NOI18N
        jLabel6.setText("SUTTAIRC");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 64)); // NOI18N
        jLabel7.setText("CRIATTUS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("GESTÃO ADMINISTRATIVA");

        jLabel4.setText("Usuário:");

        jLabel5.setText("Empresa:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pegaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pegaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(pegaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(pegaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)))
                .addContainerGap(291, Short.MAX_VALUE))
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(51, 51, 51)))
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout indexDesktopPanelLayout = new javax.swing.GroupLayout(indexDesktopPanel);
        indexDesktopPanel.setLayout(indexDesktopPanelLayout);
        indexDesktopPanelLayout.setHorizontalGroup(
            indexDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        indexDesktopPanelLayout.setVerticalGroup(
            indexDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        indexDesktopPanel.setLayer(painelImagemFundo1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jRadioButton1.setText("jRadioButton1");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-porta-aberta-24.png"))); // NOI18N
        jMenu1.setText("Logoff");

        MenuVoltarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-porta-aberta-24.png"))); // NOI18N
        MenuVoltarLogin.setText("Voltar Ao Login");
        MenuVoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVoltarLoginActionPerformed(evt);
            }
        });
        jMenu1.add(MenuVoltarLogin);

        menuUsuario.add(jMenu1);

        menuCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-editar-utilizador-24.png"))); // NOI18N
        menuCadastrarUsuario.setText("Usuários");
        menuCadastrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCadastrarUsuarioMouseClicked(evt);
            }
        });

        menuListarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-adicionar-24.png"))); // NOI18N
        menuListarUsuario.setText("Cadastrar");
        menuListarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarUsuarioActionPerformed(evt);
            }
        });
        menuCadastrarUsuario.add(menuListarUsuario);

        menuListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-bookmark-24 (1).png"))); // NOI18N
        menuListar.setText("Listar");
        menuListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarActionPerformed(evt);
            }
        });
        menuCadastrarUsuario.add(menuListar);

        menuUsuario.add(menuCadastrarUsuario);

        menuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-pesquisa-propriedade-24.png"))); // NOI18N
        menuProdutos.setText("Produtos");

        menuCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-adicionar-24.png"))); // NOI18N
        menuCadastrarProduto.setText("Cadastrar");
        menuCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarProdutoActionPerformed(evt);
            }
        });
        menuProdutos.add(menuCadastrarProduto);

        menuListarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-bookmark-24 (1).png"))); // NOI18N
        menuListarProduto.setText("Listar");
        menuListarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarProdutoActionPerformed(evt);
            }
        });
        menuProdutos.add(menuListarProduto);

        menuUsuario.add(menuProdutos);

        menuVendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-revendedor-24.png"))); // NOI18N
        menuVendedores.setText("Vendedores");

        menuCadastrarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-adicionar-24.png"))); // NOI18N
        menuCadastrarVendedor.setText("Cadastrar");
        menuCadastrarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarVendedorActionPerformed(evt);
            }
        });
        menuVendedores.add(menuCadastrarVendedor);

        menuListarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-bookmark-24 (1).png"))); // NOI18N
        menuListarVendedor.setText("Listar");
        menuListarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarVendedorActionPerformed(evt);
            }
        });
        menuVendedores.add(menuListarVendedor);

        menuUsuario.add(menuVendedores);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-performance-de-vendas-24.png"))); // NOI18N
        jMenu4.setText("Vendas");

        menuVendasCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-adicionar-24.png"))); // NOI18N
        menuVendasCadastrar.setText("Cadastrar");
        menuVendasCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendasCadastrarActionPerformed(evt);
            }
        });
        jMenu4.add(menuVendasCadastrar);

        menuVendasListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-bookmark-24 (1).png"))); // NOI18N
        menuVendasListar.setText("Listar");
        menuVendasListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendasListarActionPerformed(evt);
            }
        });
        jMenu4.add(menuVendasListar);

        menuUsuario.add(jMenu4);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-sair-24.png"))); // NOI18N
        jMenu2.setText("Transações");

        menuTransacoesCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-adicionar-24.png"))); // NOI18N
        menuTransacoesCadastrar.setText("Cadastrar");
        menuTransacoesCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransacoesCadastrarActionPerformed(evt);
            }
        });
        jMenu2.add(menuTransacoesCadastrar);

        menuTransacoesListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-bookmark-24 (1).png"))); // NOI18N
        menuTransacoesListar.setText("Listar");
        menuTransacoesListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransacoesListarActionPerformed(evt);
            }
        });
        jMenu2.add(menuTransacoesListar);

        menuUsuario.add(jMenu2);

        menuCadastrarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-empresa-cliente-24.png"))); // NOI18N
        menuCadastrarEmpresa.setText("Empresa");

        MenuCastrarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-adicionar-24.png"))); // NOI18N
        MenuCastrarEmpresa.setText("Cadastrar");
        MenuCastrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCastrarEmpresaActionPerformed(evt);
            }
        });
        menuCadastrarEmpresa.add(MenuCastrarEmpresa);

        MenuListarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-bookmark-24 (1).png"))); // NOI18N
        MenuListarEmpresa.setText("Listar");
        MenuListarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarEmpresaActionPerformed(evt);
            }
        });
        menuCadastrarEmpresa.add(MenuListarEmpresa);

        menuCadastrarGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-cartão-em-uso-24.png"))); // NOI18N
        menuCadastrarGastos.setText("Gastos");
        menuCadastrarGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarGastosActionPerformed(evt);
            }
        });
        menuCadastrarEmpresa.add(menuCadastrarGastos);

        menuUsuario.add(menuCadastrarEmpresa);

        menuListarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-recepção-24.png"))); // NOI18N
        menuListarClientes.setText("Clientes");

        MenuCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-adicionar-24.png"))); // NOI18N
        MenuCadastrarCliente.setText("Cadastrar");
        MenuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarClienteActionPerformed(evt);
            }
        });
        menuListarClientes.add(MenuCadastrarCliente);

        menuListarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-bookmark-24 (1).png"))); // NOI18N
        menuListarCliente.setText("Listar");
        menuListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarClienteActionPerformed(evt);
            }
        });
        menuListarClientes.add(menuListarCliente);

        menuUsuario.add(menuListarClientes);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-termos-e-condições-24.png"))); // NOI18N
        jMenu5.setText("Relatórios");

        MenuRelatorioVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-termos-e-condições-24.png"))); // NOI18N
        MenuRelatorioVendas.setText("Vendas");
        MenuRelatorioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioVendasActionPerformed(evt);
            }
        });
        jMenu5.add(MenuRelatorioVendas);

        MenuRelatorioCondicionais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-termos-e-condições-24.png"))); // NOI18N
        MenuRelatorioCondicionais.setText("Condicionais");
        MenuRelatorioCondicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioCondicionaisActionPerformed(evt);
            }
        });
        jMenu5.add(MenuRelatorioCondicionais);

        MenuRelatorioGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-termos-e-condições-24.png"))); // NOI18N
        MenuRelatorioGastos.setText("Gastos");
        MenuRelatorioGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioGastosActionPerformed(evt);
            }
        });
        jMenu5.add(MenuRelatorioGastos);

        MenuProdutoRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-termos-e-condições-24.png"))); // NOI18N
        MenuProdutoRelatorio.setText("Produtos");
        MenuProdutoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProdutoRelatorioActionPerformed(evt);
            }
        });
        jMenu5.add(MenuProdutoRelatorio);

        menuUsuario.add(jMenu5);

        setJMenuBar(menuUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(indexDesktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indexDesktopPanel)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuVoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVoltarLoginActionPerformed
        this.dispose();
        LoginView login = new LoginView();
        login.setVisible(true);
    }//GEN-LAST:event_MenuVoltarLoginActionPerformed

    private void menuListarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarProdutoActionPerformed
        PoductSerachView searchProduct = new PoductSerachView(indexDesktopPanel);
        indexDesktopPanel.add(searchProduct);
        searchProduct.setVisible(true);
    }//GEN-LAST:event_menuListarProdutoActionPerformed

    private void menuListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarUsuarioActionPerformed
        User registerUser = new User();
        indexDesktopPanel.add(registerUser);
        registerUser.setVisible(true);
    }//GEN-LAST:event_menuListarUsuarioActionPerformed

    private void menuListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarActionPerformed
        UserSearchView searchUser = new UserSearchView(indexDesktopPanel);
        indexDesktopPanel.add(searchUser);
        searchUser.setVisible(true);

    }//GEN-LAST:event_menuListarActionPerformed

    private void menuCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarProdutoActionPerformed
        Produto registerProduto = new Produto();
        indexDesktopPanel.add(registerProduto);
        registerProduto.setVisible(true);
    }//GEN-LAST:event_menuCadastrarProdutoActionPerformed

    private void menuTransacoesCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransacoesCadastrarActionPerformed
        TransictionView registerTransiction = new TransictionView(indexDesktopPanel);
        indexDesktopPanel.add(registerTransiction);
      registerTransiction.setVisible(true);    }//GEN-LAST:event_menuTransacoesCadastrarActionPerformed

    private void menuCadastrarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarVendedorActionPerformed

        VendedoresVieww vendedores = new VendedoresVieww();
        indexDesktopPanel.add(vendedores);
        vendedores.setVisible(true);

    }//GEN-LAST:event_menuCadastrarVendedorActionPerformed

    private void menuListarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarVendedorActionPerformed
        VendedoresSearchVieww vendedores = new VendedoresSearchVieww(indexDesktopPanel);
        indexDesktopPanel.add(vendedores);
        vendedores.setVisible(true);

    }//GEN-LAST:event_menuListarVendedorActionPerformed

    private void menuVendasCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendasCadastrarActionPerformed
        VendaView vendas = new VendaView();
        indexDesktopPanel.add(vendas);
        vendas.setVisible(true);

    }//GEN-LAST:event_menuVendasCadastrarActionPerformed

    private void menuVendasListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendasListarActionPerformed
        VendaSearchView vendas = new VendaSearchView(indexDesktopPanel);
        indexDesktopPanel.add(vendas);
        vendas.setVisible(true);

    }//GEN-LAST:event_menuVendasListarActionPerformed

    private void menuTransacoesListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransacoesListarActionPerformed
        TransictionSearch searchTransiction = new TransictionSearch(indexDesktopPanel);
        indexDesktopPanel.add(searchTransiction);
        searchTransiction.setVisible(true);
    }//GEN-LAST:event_menuTransacoesListarActionPerformed

    private void menuCadastrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCadastrarUsuarioMouseClicked

    }//GEN-LAST:event_menuCadastrarUsuarioMouseClicked

    private void menuListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarClienteActionPerformed
        ClienteSearchView searchClient = new ClienteSearchView(indexDesktopPanel);
        indexDesktopPanel.add(searchClient);
        searchClient.setVisible(true);
    }//GEN-LAST:event_menuListarClienteActionPerformed

    private void MenuCastrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCastrarEmpresaActionPerformed
        EmpresaView empresa = new EmpresaView();
        indexDesktopPanel.add(empresa);
        empresa.setVisible(true);

    }//GEN-LAST:event_MenuCastrarEmpresaActionPerformed

    private void MenuListarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarEmpresaActionPerformed
        EmpresaSearchView searchEmpresa = new EmpresaSearchView(indexDesktopPanel);
        indexDesktopPanel.add(searchEmpresa);
        searchEmpresa.setVisible(true);
    }//GEN-LAST:event_MenuListarEmpresaActionPerformed

    private void menuCadastrarGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarGastosActionPerformed
        EmpresGastosView gastos = new EmpresGastosView(indexDesktopPanel);
        indexDesktopPanel.add(gastos);
        gastos.setVisible(true);
    }//GEN-LAST:event_menuCadastrarGastosActionPerformed

    private void MenuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarClienteActionPerformed
        ClienteView cliente = new ClienteView();
        indexDesktopPanel.add(cliente);
        cliente.setVisible(true);
    }//GEN-LAST:event_MenuCadastrarClienteActionPerformed

    private void MenuRelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioVendasActionPerformed
        RelatorioVendasView relatorio = new RelatorioVendasView();
        indexDesktopPanel.add(relatorio);
        relatorio.setVisible(true);

    }//GEN-LAST:event_MenuRelatorioVendasActionPerformed

    private void MenuRelatorioCondicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioCondicionaisActionPerformed
        RelatorioTransictionView relatorio = new RelatorioTransictionView();
        indexDesktopPanel.add(relatorio);
        relatorio.setVisible(true);


    }//GEN-LAST:event_MenuRelatorioCondicionaisActionPerformed

    private void MenuRelatorioGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioGastosActionPerformed
        RelatorioGastosView relatorio = new RelatorioGastosView();
        indexDesktopPanel.add(relatorio);
        relatorio.setVisible(true);
    }//GEN-LAST:event_MenuRelatorioGastosActionPerformed

    private void MenuProdutoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProdutoRelatorioActionPerformed
        RelatorioProdutoView relatorio = new RelatorioProdutoView();
        indexDesktopPanel.add(relatorio);
        relatorio.setVisible(true);

    }//GEN-LAST:event_MenuProdutoRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(IndexView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCadastrarCliente;
    private javax.swing.JMenuItem MenuCastrarEmpresa;
    private javax.swing.JMenuItem MenuListarEmpresa;
    private javax.swing.JMenuItem MenuProdutoRelatorio;
    private javax.swing.JMenuItem MenuRelatorioCondicionais;
    private javax.swing.JMenuItem MenuRelatorioGastos;
    private javax.swing.JMenuItem MenuRelatorioVendas;
    private javax.swing.JMenuItem MenuVoltarLogin;
    private javax.swing.JDesktopPane indexDesktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JMenu menuCadastrarEmpresa;
    private javax.swing.JMenuItem menuCadastrarGastos;
    private javax.swing.JMenuItem menuCadastrarProduto;
    private javax.swing.JMenu menuCadastrarUsuario;
    private javax.swing.JMenuItem menuCadastrarVendedor;
    private javax.swing.JMenuItem menuListar;
    private javax.swing.JMenuItem menuListarCliente;
    private javax.swing.JMenu menuListarClientes;
    private javax.swing.JMenuItem menuListarProduto;
    private javax.swing.JMenuItem menuListarUsuario;
    private javax.swing.JMenuItem menuListarVendedor;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenuItem menuTransacoesCadastrar;
    private javax.swing.JMenuItem menuTransacoesListar;
    private javax.swing.JMenuBar menuUsuario;
    private javax.swing.JMenuItem menuVendasCadastrar;
    private javax.swing.JMenuItem menuVendasListar;
    private javax.swing.JMenu menuVendedores;
    private View.PainelImagemFundo painelImagemFundo1;
    private javax.swing.JLabel pegaEmpresa;
    private javax.swing.JLabel pegaUsuario;
    // End of variables declaration//GEN-END:variables
}
