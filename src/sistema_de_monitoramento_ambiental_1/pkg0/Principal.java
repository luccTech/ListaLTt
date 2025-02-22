/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema_de_monitoramento_ambiental_1.pkg0;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Principal extends javax.swing.JFrame {

    NovaAreaProtegida area = new NovaAreaProtegida();
    NovoRelatorio relat = new NovoRelatorio();
    NovoVoluntario volun = new NovoVoluntario();
    NovaEspecie esp = new NovaEspecie();
    ProjetoAmbiental projeto = new ProjetoAmbiental();
    TelaProjetoAmbiental p = new TelaProjetoAmbiental();
    
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        seletor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela inicial");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 100, -1));

        seletor.setBackground(new java.awt.Color(0, 153, 102));
        seletor.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        seletor.setForeground(new java.awt.Color(255, 255, 255));
        seletor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cadastrar Area Protegida", "Cadastrar Voluntario", "Cadastrar Relatorio", "Cadastrar Especie", "Calcular Orçamento" }));
        getContentPane().add(seletor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 210, -1));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Escolha uma opção:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 102));
        jButton2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 100, -1));

        jButton3.setBackground(new java.awt.Color(0, 153, 102));
        jButton3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ver Projeto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 100, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 230, 190));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema_de_monitoramento_ambiental_1/pkg0/imagens/Captura de tela 2024-10-28 232641.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String opcao = String.valueOf(seletor.getSelectedItem().toString()); // pegar valores do comboBox
        if (opcao == "Cadastrar Area Protegida"){
            area.setVisible(true);
        }else{
            if (opcao == "Cadastrar Voluntario"){
                volun.setVisible(true);
            }else{
                if (opcao == "Cadastrar Relatorio"){
                    relat.setVisible(true);
                }else{
                    if(opcao == "Cadastrar Especie"){
                        esp.setVisible(true);
                    }else{
                        
                    }if(opcao == "Calcular Orçamento"){
                        if(area.getOr() == 0.0){
                            JOptionPane.showMessageDialog(null, "Ainda não existe áreas protegidas cadastradas.\n Cadastre-as para ver o orçamento", "Erro", 2);
                        }else{
                            ImageIcon icon = new ImageIcon(getClass().getResource("\\imagens\\real_brasileiro.png"));
                        
                            JOptionPane.showMessageDialog(null, "O orçamento total do prejeto é :"+area.getOr()+ "R$", "Orçamento", HEIGHT, icon);
                        }             
                    }
                }
            }
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        p.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> seletor;
    // End of variables declaration//GEN-END:variables
}
