package ImpactoExpress;

import static ImpactoExpress.tela.veiculos;
import javax.swing.JOptionPane;

/**
 *
 * @author joao
 * @version 1.0
 * @since 8nov2016
 * 
 */
public class telaCadastrarVeiculo extends javax.swing.JInternalFrame {
    PegaFuncionarios getListaFuncionarios = new PegaFuncionarios();
    PegaClientes getListaClientes = new PegaClientes();
    PegaVeiculos getListaVeiculos = new PegaVeiculos();
    /**
     * Creates new form telaCadastrarCliente
     */
    public telaCadastrarVeiculo() {
        initComponents();
        getListaFuncionarios.getListaFuncionarios();
        getListaClientes.getListaClientes();
        getListaVeiculos.getListaVeiculos();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfMarcaVeiculo = new javax.swing.JTextField();
        tfModeloVeiculo = new javax.swing.JTextField();
        tfPlacaVeiculo = new javax.swing.JTextField();
        tfRenavamVeiculo = new javax.swing.JTextField();
        tfVencimentoVeiculo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfObservacoesVeiculo = new javax.swing.JTextArea();
        btnCadastrarCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbxTipoVeiculo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tfCorVeiculo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbxCategoriaVeiculo = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Veiculo");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Marca:");

        jLabel2.setText("Modelo:");

        jLabel3.setText("Placa:");

        jLabel4.setText("Renavam:");

        jLabel5.setText("Vencimento:");

        jLabel6.setText("Observacoes:");

        tfObservacoesVeiculo.setColumns(20);
        tfObservacoesVeiculo.setRows(4);
        jScrollPane1.setViewportView(tfObservacoesVeiculo);

        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo:");

        cbxTipoVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto", "Caminhao", "Caminhonete", "Van", "Aviao" }));

        jLabel8.setText("Cor:");

        jLabel9.setText("Categoria:");

        cbxCategoriaVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Firma", "Aluguel", "Frete", "Particular" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMarcaVeiculo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfModeloVeiculo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPlacaVeiculo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfRenavamVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfVencimentoVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrarCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(3, 3, 3)
                        .addComponent(tfCorVeiculo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTipoVeiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxCategoriaVeiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfMarcaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCorVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfRenavamVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfVencimentoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCategoriaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarCliente)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        inserirVeiculo();
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed
    public void inserirVeiculo(){
        Veiculo veiculo1=new Veiculo();
        
        veiculo1.setTipoVeiculo(cbxTipoVeiculo.getSelectedItem()+"");
        veiculo1.setModeloVeiculo(tfModeloVeiculo.getText());
        veiculo1.setMarcaVeiculo(tfMarcaVeiculo.getText());
        veiculo1.setCorVeiculo(tfCorVeiculo.getText());
        veiculo1.setPlacaVeiculo(tfPlacaVeiculo.getText());
        veiculo1.setRenavamVeiculo(tfRenavamVeiculo.getText());
        veiculo1.setVencimentoVeiculo(tfVencimentoVeiculo.getText());
        veiculo1.setCategoriaVeiculo(cbxCategoriaVeiculo.getSelectedItem()+"");
        veiculo1.setObservacoesVeiculo(tfObservacoesVeiculo.getText());
        
        // grave nessa conexão!!!
        VeiculoDao dao = new VeiculoDao();
        // método elegante
        dao.adiciona(veiculo1);
        
        veiculos.add(veiculo1);
        
        JOptionPane.showMessageDialog(rootPane,"Veiculo Gravado!");
        limpar();
    }
    public void limpar(){
        cbxTipoVeiculo.setSelectedIndex(0);
        cbxCategoriaVeiculo.setSelectedIndex(0);
        tfModeloVeiculo.setText(null);
        tfMarcaVeiculo.setText(null);
        tfCorVeiculo.setText(null);
        tfPlacaVeiculo.setText(null);
        tfRenavamVeiculo.setText(null);
        tfVencimentoVeiculo.setText(null);
        tfObservacoesVeiculo.setText(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JComboBox<String> cbxCategoriaVeiculo;
    private javax.swing.JComboBox<String> cbxTipoVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfCorVeiculo;
    private javax.swing.JTextField tfMarcaVeiculo;
    private javax.swing.JTextField tfModeloVeiculo;
    private javax.swing.JTextArea tfObservacoesVeiculo;
    private javax.swing.JTextField tfPlacaVeiculo;
    private javax.swing.JTextField tfRenavamVeiculo;
    private javax.swing.JTextField tfVencimentoVeiculo;
    // End of variables declaration//GEN-END:variables
}
