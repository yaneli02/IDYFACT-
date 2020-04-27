/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnecom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Hash;
import modelo.SqlUsuarios;


public class LoginRegistrar extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
PreparedStatement ps;
ResultSet rs;
Connection con;
    
private void limpiar() {
        email.setText("");
        rfc.setText("");
        Password.setText("");
           }
    public LoginRegistrar() {
        initComponents();
        setLocationRelativeTo(null);//para aparecer en el centro de la pantalla
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
        email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rfc = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo Registro");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Nuevo Resgitro");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Correo Electrónico ");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("RFC");

        rfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfcActionPerformed(evt);
            }
        });
        rfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rfcKeyTyped(evt);
            }
        });

        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Contraseña");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cancelar)
                                .addComponent(jLabel2))
                            .addGap(8, 8, 8)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(jButton1))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void rfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfcActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
LOGIN G= new LOGIN();
      G.setVisible(true);
       dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

   
@SuppressWarnings({"deprecation", "deprecation", "deprecation"})
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 SqlUsuarios modSql = new SqlUsuarios();
 String pass = new String(Password.getText());
 
 if(email.getText().length()>0 && rfc.getText().length()>0 && Password.getText().length()>0){  
     if (modSql.existeEmail(email.getText()) == 0){
        if (modSql.existeRFC(rfc.getText()) == 0){
            if (modSql.esEmail(email.getText())){
           if (modSql.esRFC(rfc.getText())){
           try { 
            Connection con;
            con = Db.connect();
            String nuevoPass = Hash.sha1(pass);
            ps = con.prepareStatement ("INSERT INTO user(contra,rfc,email) VALUES (?,?,?)");
            ps.setString(1, nuevoPass);
            ps.setString(2, rfc.getText());
            ps.setString(3, email.getText());
            int res;
           res = ps.executeUpdate();
           if(res > 0){
               JOptionPane.showMessageDialog(rootPane, "Registro exitoso");
               limpiar();
           }else{
               JOptionPane.showMessageDialog(rootPane, "Error al guardar");
               limpiar();
           }       
        }catch (SQLException ex) {
            Logger.getLogger(LoginRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERORO!!!");
        }  
           }else {
           JOptionPane.showMessageDialog(null, "El RFC es incorrecto"); 
                }
            }else {
           JOptionPane.showMessageDialog(null, "El email es incorrecto"); 
                }
          }else {
                 JOptionPane.showMessageDialog(null, "El RFC ya existe");
                }
     }else {
           JOptionPane.showMessageDialog(null, "El email ya en uso"); 
                }
   
         }else{
            JOptionPane.showMessageDialog(rootPane, "No debes dejar campos vacios !!");        
        }    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rfcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rfcKeyTyped
        // TODO add your handling code here:
        char t = evt.getKeyChar();

        if((t<'A'||t>'Z')&(t<'0'||t>'9')) evt.consume();  
    }//GEN-LAST:event_rfcKeyTyped

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_PasswordKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginRegistrar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField rfc;
    // End of variables declaration//GEN-END:variables
}
