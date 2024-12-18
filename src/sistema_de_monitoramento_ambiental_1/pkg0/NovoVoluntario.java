/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema_de_monitoramento_ambiental_1.pkg0;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class NovoVoluntario extends javax.swing.JFrame {

    ProjetoAmbiental pa = new ProjetoAmbiental();
    String nome;
    int idade;
    String cidade;
    
    public NovoVoluntario() {
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

        btnSalvarV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaV = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TfNomeV = new javax.swing.JTextField();
        TfIdadeV = new javax.swing.JTextField();
        TfCidade = new javax.swing.JTextField();
        btnSairV = new javax.swing.JButton();
        btnDadosV = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Voluntarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalvarV.setBackground(new java.awt.Color(0, 153, 102));
        btnSalvarV.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnSalvarV.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarV.setText("Salvar");
        btnSalvarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarVActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 103, -1));

        TextAreaV.setEditable(false);
        TextAreaV.setColumns(20);
        TextAreaV.setRows(5);
        jScrollPane1.setViewportView(TextAreaV);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 230, 200));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Nome: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Idade:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Cidade:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 80, -1));
        getContentPane().add(TfNomeV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 270, -1));
        getContentPane().add(TfIdadeV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 270, -1));
        getContentPane().add(TfCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 270, -1));

        btnSairV.setBackground(new java.awt.Color(0, 153, 102));
        btnSairV.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnSairV.setForeground(new java.awt.Color(255, 255, 255));
        btnSairV.setText("Sair");
        btnSairV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairVActionPerformed(evt);
            }
        });
        getContentPane().add(btnSairV, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 150, -1));

        btnDadosV.setBackground(new java.awt.Color(0, 153, 102));
        btnDadosV.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnDadosV.setForeground(new java.awt.Color(255, 255, 255));
        btnDadosV.setText("Mostar Voluntarios");
        btnDadosV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosVActionPerformed(evt);
            }
        });
        getContentPane().add(btnDadosV, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 150, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 290, 60));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 290, 60));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 290, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema_de_monitoramento_ambiental_1/pkg0/imagens/Captura de tela 2024-10-28 232641.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarVActionPerformed
        nome = String.valueOf(TfNomeV.getText());
        idade = Integer.parseInt(TfIdadeV.getText());
        cidade = String.valueOf(TfCidade.getText());
        TextAreaV.append("Nome: \t" + nome + "\n");
        TextAreaV.append("Idade: \t" + idade + "\n");
        TextAreaV.append("Cidade: \t" + cidade + "\n \n" );
        pa.adicionarVoluntario(nome, idade, cidade);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("\\imagens\\verificar.png"));
        JOptionPane.showMessageDialog(null, "Voluntario cadastrado com sucesso.","",HEIGHT, icon);
        
        TfNomeV.setText("");
        TfIdadeV.setText("");
        TfCidade.setText("");
        TfNomeV.requestFocus(); // para voltar o cursor

    }//GEN-LAST:event_btnSalvarVActionPerformed

    private void btnSairVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairVActionPerformed
        //System.exit(0);
        this.dispose();
    }//GEN-LAST:event_btnSairVActionPerformed

    private void btnDadosVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosVActionPerformed
        pa.listarVoluntarios();
        
        ImageIcon icon = new ImageIcon(getClass().getResource("\\imagens\\comunidade.png"));
        JOptionPane.showMessageDialog(rootPane, TextAreaV.getText(), "Especies", HEIGHT, icon);
    }//GEN-LAST:event_btnDadosVActionPerformed

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
            java.util.logging.Logger.getLogger(NovoVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoVoluntario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAreaV;
    private javax.swing.JTextField TfCidade;
    private javax.swing.JTextField TfIdadeV;
    private javax.swing.JTextField TfNomeV;
    private javax.swing.JButton btnDadosV;
    private javax.swing.JButton btnSairV;
    private javax.swing.JButton btnSalvarV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
