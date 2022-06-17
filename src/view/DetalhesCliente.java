package view;

import Model.Caso;
import Model.Cliente;
import Service.CasoService;
import Service.ClienteService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Cecília
 */
public class DetalhesCliente extends javax.swing.JFrame {

    /**
     * @return the cpf
     */


    /**
     * Creates new form DetalhesCliente
     * @param cpf
     */
  
    public DetalhesCliente(String cpf) {
      
        initComponents();
       
        ClienteService clienteService = new ClienteService();
        Cliente cliente = clienteService.buscaCliente(cpf);
        CasoService casoService = new CasoService();
        Caso caso = casoService.buscarCaso(cliente.getId());
      nomeDetCliente.setText(cliente.getNome()+"\n");
      lblDadosCliente.setText(cliente.ToString());
      descricaoDetPagamento.setText(caso.getDescicao());
      honorariosDetPagamento.setText(String.valueOf(caso.getValorHonorarios()));
      parcelasDetPagamento.setText(String.valueOf(caso.getParcelas()));
      vencimentoDetPagamento.setText(String.valueOf(caso.getDiaVencimento()));
      lblDadosCliente1.setText(cliente.getCpf());
        
    
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nomeDetCliente = new javax.swing.JLabel();
        lblDadosCliente = new javax.swing.JLabel();
        lblDadosCliente1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoDetPagamento = new javax.swing.JTextPane();
        jLabel17 = new javax.swing.JLabel();
        honorariosDetPagamento = new javax.swing.JLabel();
        parcelasDetPagamento = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        vencimentoDetPagamento = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnEditarDetPagamento = new javax.swing.JButton();
        btnVoltarDetPagamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dota & Dotinha Advogados Associados");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nomeDetCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nomeDetCliente.setText("Nome do cliente");

        lblDadosCliente.setText("Dados do cliente");

        lblDadosCliente1.setText("Dados do cliente");
        lblDadosCliente1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeDetCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDadosCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeDetCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(lblDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDadosCliente1)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        descricaoDetPagamento.setEditable(false);
        descricaoDetPagamento.setText("Descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso, descrição do caso.");
        jScrollPane1.setViewportView(descricaoDetPagamento);

        jLabel17.setText("Valor dos honorários:");

        honorariosDetPagamento.setText("xxxxxxxxxxxxx");

        parcelasDetPagamento.setText("xxx");

        jLabel20.setText("Parcelas:");

        vencimentoDetPagamento.setText("xx/xx/xxxx");

        jLabel26.setText("Dia do vencimento");

        btnEditarDetPagamento.setText("Editar");
        btnEditarDetPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDetPagamentoActionPerformed(evt);
            }
        });

        btnVoltarDetPagamento.setText("Voltar");
        btnVoltarDetPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarDetPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnVoltarDetPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditarDetPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(honorariosDetPagamento)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parcelasDetPagamento)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vencimentoDetPagamento)
                        .addGap(0, 253, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(honorariosDetPagamento)
                    .addComponent(jLabel20)
                    .addComponent(parcelasDetPagamento)
                    .addComponent(jLabel26)
                    .addComponent(vencimentoDetPagamento))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarDetPagamento)
                    .addComponent(btnVoltarDetPagamento))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarDetPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarDetPagamentoActionPerformed
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarDetPagamentoActionPerformed

    private void btnEditarDetPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDetPagamentoActionPerformed
        
        ClienteService clienteService = new ClienteService();
        Cliente cliente = clienteService.buscaCliente(lblDadosCliente1.getText());
        CasoService casoService = new CasoService();
        Caso caso = casoService.buscarCaso(cliente.getId());
        
        EditarCliente editarCliente = new EditarCliente(cliente,caso);
        
        editarCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarDetPagamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarDetPagamento;
    private javax.swing.JButton btnVoltarDetPagamento;
    private javax.swing.JTextPane descricaoDetPagamento;
    private javax.swing.JLabel honorariosDetPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDadosCliente;
    private javax.swing.JLabel lblDadosCliente1;
    private javax.swing.JLabel nomeDetCliente;
    private javax.swing.JLabel parcelasDetPagamento;
    private javax.swing.JLabel vencimentoDetPagamento;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the cpf
     */
  
}