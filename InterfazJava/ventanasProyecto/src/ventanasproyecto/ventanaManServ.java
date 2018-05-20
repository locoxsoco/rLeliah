/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

import LogicaNegocio.ServicioBL;
import clases.Servicio;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class ventanaManServ extends javax.swing.JFrame {

    /**
     * Creates new form ventanaManServ
     */
    public ventanaManServ() {
        initComponents();
        LogicaNegocio = new ServicioBL();
        tabla.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(210);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(30);
        //tabla.getColumnModel().getColumn(3).setPreferredWidth(30);
        this.setLocationRelativeTo(null);
        this.setTitle("Ventana Manejar Servicios");
        registrar.setEnabled(true);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        idU = 0;
    }
    int idU;
    private ServicioBL LogicaNegocio;
    ventanaAdmin ventanaAnterior;
    ventanaLogin ventanaHome;
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
        nombre = new javax.swing.JTextField();
        pu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        moneda = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mantener Servicios");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 13, 173, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(15, 57, 60, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Precio Unitario:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(15, 85, 110, 16);
        getContentPane().add(nombre);
        nombre.setBounds(135, 55, 200, 22);
        getContentPane().add(pu);
        pu.setBounds(135, 82, 70, 22);

        tabla.setBackground(new java.awt.Color(255, 255, 204));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "P.U.", "Tipo de Moneda"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 410, 179);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanasproyecto/logout.png"))); // NOI18N
        jButton1.setText("Cerrar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 380, 117, 29);

        volver.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanasproyecto/volver.png"))); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver);
        volver.setBounds(190, 380, 90, 29);

        modificar.setBackground(new java.awt.Color(255, 255, 204));
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar);
        modificar.setBounds(180, 150, 90, 25);

        registrar.setBackground(new java.awt.Color(255, 255, 204));
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar);
        registrar.setBounds(60, 150, 90, 25);

        eliminar.setBackground(new java.awt.Color(255, 255, 204));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar);
        eliminar.setBounds(300, 150, 90, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Tipo de Moneda:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(15, 110, 110, 16);

        moneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja..", "Soles", "Dólares" }));
        getContentPane().add(moneda);
        moneda.setBounds(135, 110, 70, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private boolean isDouble(String cadena) {

        boolean resultado;

        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    
    private boolean validarInput(){
        String s = this.nombre.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        for (int i=0; i<s.length(); i++){
            if(!((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z') || s.charAt(i) == 'ñ' || s.charAt(i) == 'Ñ' || s.charAt(i)== ' ')){
                JOptionPane.showMessageDialog(null, "campo nombre solo puede contener letras", "Error Nombre", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
        }
        s = this.pu.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        if(!isDouble(s)){
            JOptionPane.showMessageDialog(null, "Precio Unitario debe ser un valor real", "Error Sueldo", JOptionPane.PLAIN_MESSAGE);
            return false;
        }              
        return true;
    }
    
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        ventanaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed
    javax.swing.table.DefaultTableModel model;
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        boolean a = validarInput();
        if (!a) return;
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        Servicio s = new Servicio();
        s.setNombre(nombre.getText());
        s.setprecioxUnit(Double.parseDouble(pu.getText()));
        s.SetMoneda(moneda.getSelectedItem().toString());
        try {
            LogicaNegocio.registrarServicio(s);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManServ.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManServ.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object o[] = {s.getId(), s.getNombre(), s.getprecioxUnit(), s.getMoneda()};
        model.addRow(o);
        nombre.setText("");
        pu.setText("");
    }//GEN-LAST:event_registrarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        nombre.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 1)));
        pu.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 2)));
        registrar.setEnabled(true);
        modificar.setEnabled(true);
        eliminar.setEnabled(true);
        //dni.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 6)));
        
        //tipoUser.setSelectedItem(model.getValueAt(tabla.getSelectedRow(), 7));
        
        
    }//GEN-LAST:event_tablaMouseClicked

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        boolean a = validarInput();
        if(!a) return;
        model.setValueAt(nombre.getText(), tabla.getSelectedRow(), 1);
        model.setValueAt(pu.getText(), tabla.getSelectedRow(), 2);
        
        nombre.setText("");
        pu.setText("");
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        model.removeRow(tabla.getSelectedRow());
        eliminar.setEnabled(false);
        modificar.setEnabled(false);
        nombre.setText("");
        pu.setText("");
    }//GEN-LAST:event_eliminarActionPerformed
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ventanaHome.regresar();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JComboBox<String> moneda;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pu;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tabla;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
