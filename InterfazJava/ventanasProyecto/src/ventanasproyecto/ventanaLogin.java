/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

import LogicaNegocio.TrabajadorBL;
import clases.usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ventanaLogin extends javax.swing.JFrame {

    
    private TrabajadorBL LogicaNegocio;
    public ventanaLogin() {
        
        initComponents();
        //System.out.println("hola");
        LogicaNegocio = new TrabajadorBL();
        this.setLocationRelativeTo(null);
        this.setTitle("Ventana Log In");
        this.getRootPane().setDefaultButton(Login);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        recor = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(391, 536));
        setResizable(false);
        setSize(new java.awt.Dimension(391, 536));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel1.setText("Bienvenido al Sistema Leli");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(17, 13, 360, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 320, 80, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 370, 110, 25);

        pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(pass);
        pass.setBounds(180, 370, 155, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logan.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 30, 256, 290);

        Login.setText("Log In");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(220, 430, 94, 30);

        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(user);
        user.setBounds(180, 320, 155, 28);

        recor.setText("Recuerdame");
        recor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorActionPerformed(evt);
            }
        });
        getContentPane().add(recor);
        recor.setBounds(70, 430, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void log() throws ClassNotFoundException, SQLException{
        usuario u = null;
        //System.out.println("hola");
  
        try {
            u=LogicaNegocio.validarUsuario(user.getText(), pass.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(privi);
        
        if(u.getPriv()==2){
            ventanaAdmin v1 = new ventanaAdmin();
            v1.ventanaHome = this;
            v1.jButton7.setVisible(false);
            v1.setVisible(true);
            v1.nomb.setText(u.getNomb());
            v1.anterior = "Home";
            
            this.setVisible(false);
        }else if( u.getPriv()==1){
            VentanaPrincipal v1 = new VentanaPrincipal();
            v1.ventanaHome = this;
            v1.setLocationRelativeTo(null);
            v1.setVisible(true);
            v1.nomb1.setText(user.getText());
            
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos", "Error Autentificacion", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public void regresar(){
        this.setVisible(true);
        if(!recor.isSelected()){
           this.user.setText("");
           this.pass.setText(""); 
        }
        
        /*if(recor.get){
            
        }*/
    }
    
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        try {
            // TODO add your handling code here:
            Login.setEnabled(false);
            log();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void recorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recorActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pass;
    private javax.swing.JCheckBox recor;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
