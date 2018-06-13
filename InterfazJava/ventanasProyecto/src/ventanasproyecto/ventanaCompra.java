/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

import LogicaNegocio.CompraBL;
import clases.Compra;
import clases.LineaxCompra;
import clases.Producto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.isInteger;

/**
 *
 * @author Andres
 */
public class ventanaCompra extends javax.swing.JFrame {
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
    /**
     * Creates new form ventanaCompra
     */
    //public Proveedor prov;
    public float total=0;
    public int counterId=0;
    private CompraBL logicaNegocio;
    public VentanaPrincipal vAnterior;
    public ventanaLogin ventanaHome;
    public Compra comp;
    public Producto prod;
    public int idProv;
    public int idProd;
    public ventanaCompra() {
        initComponents();
        logicaNegocio = new CompraBL();
        buscarProd.setEnabled(false);
        buscarProv.setEnabled(false);
        pu.setEnabled(false);
        cant.setEnabled(false);
        razon.setEnabled(false);
        ruc.setEnabled(false);
        nombreProd.setEnabled(false);
        fecha.setEnabled(false);
        model = (javax.swing.table.DefaultTableModel)dvgDetalle_compra.getModel();
        
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        razon = new javax.swing.JTextField();
        ruc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buscarProv = new javax.swing.JButton();
        buscarProd = new javax.swing.JButton();
        pu = new javax.swing.JTextField();
        cant = new javax.swing.JTextField();
        nombreProd = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dvgDetalle_compra = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Compra");
        setMinimumSize(new java.awt.Dimension(410, 700));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(25, 15, 100, 29);

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(148, 15, 100, 29);

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(270, 15, 100, 29);

        jLabel1.setText("Buscar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 205, 100, 16);

        jLabel2.setText("Ruc:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 143, 26, 16);

        jLabel3.setText("Razon Social:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 113, 78, 16);

        razon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razonActionPerformed(evt);
            }
        });
        getContentPane().add(razon);
        razon.setBounds(110, 110, 200, 22);
        getContentPane().add(ruc);
        ruc.setBounds(110, 140, 140, 22);

        jLabel5.setText("Producto:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 200, 60, 16);

        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 230, 60, 16);

        jLabel7.setText("Precio Unitario:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 260, 100, 16);

        jLabel8.setText("Cantidad:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 290, 70, 16);

        buscarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscarProv.setMargin(new java.awt.Insets(2, 4, 2, 4));
        buscarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProvActionPerformed(evt);
            }
        });
        getContentPane().add(buscarProv);
        buscarProv.setBounds(110, 75, 33, 29);

        buscarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscarProd.setMargin(new java.awt.Insets(2, 4, 2, 4));
        buscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProdActionPerformed(evt);
            }
        });
        getContentPane().add(buscarProd);
        buscarProd.setBounds(90, 200, 33, 29);

        pu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puActionPerformed(evt);
            }
        });
        pu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                puKeyTyped(evt);
            }
        });
        getContentPane().add(pu);
        pu.setBounds(130, 260, 70, 22);

        cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantActionPerformed(evt);
            }
        });
        cant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantKeyTyped(evt);
            }
        });
        getContentPane().add(cant);
        cant.setBounds(130, 290, 70, 22);
        getContentPane().add(nombreProd);
        nombreProd.setBounds(90, 230, 150, 22);

        agregar.setBackground(new java.awt.Color(255, 255, 204));
        agregar.setText("Agregar");
        agregar.setMargin(new java.awt.Insets(2, 4, 2, 4));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar);
        agregar.setBounds(250, 260, 100, 25);

        jButton7.setBackground(new java.awt.Color(255, 255, 204));
        jButton7.setText("Eliminar");
        jButton7.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(250, 290, 100, 25);

        dvgDetalle_compra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cantidad", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(dvgDetalle_compra);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 420, 350, 130);

        jLabel9.setText("Total:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 560, 41, 20);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(250, 560, 110, 22);

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver);
        volver.setBounds(100, 600, 110, 29);

        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout.png"))); // NOI18N
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarSesion);
        cerrarSesion.setBounds(230, 600, 140, 29);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(15, 70, 355, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(15, 368, 355, 2);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(370, 70, 2, 100);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(15, 170, 355, 2);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(15, 70, 20, 20);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(15, 70, 2, 100);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(15, 195, 355, 2);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(370, 195, 2, 170);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(15, 195, 2, 170);

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator10);
        jSeparator10.setBounds(15, 195, 2, 170);

        jLabel4.setText("Fecha de Caducidad:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 330, 130, 16);
        getContentPane().add(fecha);
        fecha.setBounds(150, 330, 200, 22);

        jLabel10.setText("Proveedor:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 80, 63, 16);

        jLabel11.setText("Buscar");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 80, 120, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProdActionPerformed
        // TODO add your handling code here:
        ventanaBusarProd v = new ventanaBusarProd();
        v.setVisible(true);
        this.setEnabled(false);
        v.ventanaAnterior = this;
        
    }//GEN-LAST:event_buscarProdActionPerformed

    private void buscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProvActionPerformed
        // TODO add your handling code here:
        ventanaBuscarProv v = new ventanaBuscarProv();
        v.setVisible(true);
        this.setEnabled(false);
        v.ventanaAnterior = this;
    }//GEN-LAST:event_buscarProvActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        vAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        // TODO add your handling code here:
        ventanaHome.regresar();
        this.dispose();
    }//GEN-LAST:event_cerrarSesionActionPerformed
    javax.swing.table.DefaultTableModel model;
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        String s = this.pu.getText();
        if(s.equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacio", "Error Precio Unitario", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        s = this.cant.getText();
        if(s.equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacio", "Error Cantidad", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        if(!isDouble(pu.getText())){
                JOptionPane.showMessageDialog(null, "Precio Unitario debe ser un valor real", "Error Precio Unitario", JOptionPane.PLAIN_MESSAGE);
                return;
        }
        if(!isInteger(cant.getText())){
                JOptionPane.showMessageDialog(null, "Cantidad debe ser un valor entero", "Error Cantidad", JOptionPane.PLAIN_MESSAGE);
                return;
        }
        if(fecha.getDate()==null && fecha.isEnabled()){
                JOptionPane.showMessageDialog(null, "Fecha de Caducidad no debe ser estar vacio", "Error Fecha de Caducidad", JOptionPane.PLAIN_MESSAGE);
                return;
        }
        Object o[]={prod.getNombre(), pu.getText(), cant.getText(), Float.parseFloat(pu.getText())*Float.parseFloat(cant.getText())};
        for(int i=0;i<comp.getListLineaxProd().size();i++){
            if(comp.getListLineaxProd().get(i).getProducto().getIdProducto()==prod.getIdProducto()){
                total-=(float)comp.getListLineaxProd().get(i).getCantidad()*comp.getListLineaxProd().get(i).getPrecioUnit();
                int aux=comp.getListLineaxProd().get(i).getCantidad()+Integer.parseInt(this.cant.getText());
                comp.getListLineaxProd().get(i).setCantidad(aux);
                comp.getListLineaxProd().get(i).setPrecioUnit(Float.parseFloat(this.pu.getText()));
                comp.getListLineaxProd().get(i).setFechaCaducidad(fecha.getDate());
                model.setValueAt(Float.parseFloat(pu.getText()), i, 1);
                model.setValueAt(aux, i, 2);
                model.setValueAt((float)aux*Float.parseFloat(pu.getText()), i, 3);
                total+=Float.parseFloat(pu.getText())*aux;
                jTextField7.setText(Float.toString(total));
                pu.setText("");
                cant.setText("");
                return;
            }
        }
        counterId++;
        LineaxCompra dCompra = new LineaxCompra();
        dCompra.setProducto(prod);
        dCompra.setIdLineaxCompra(counterId);
        dCompra.setCantidad(Integer.parseInt(this.cant.getText()));
        dCompra.setPrecioUnit(Float.parseFloat(this.pu.getText()));
        dCompra.setFechaCaducidad(fecha.getDate());
        comp.getListLineaxProd().add(dCompra);
        
        model.addRow(o);
        total+=Float.parseFloat(pu.getText())*Float.parseFloat(cant.getText());
        jTextField7.setText(Float.toString(total));
        pu.setText("");
        cant.setText("");
        
    }//GEN-LAST:event_agregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        comp = new Compra();
        prod = new Producto();
        buscarProd.setEnabled(true);
        buscarProv.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String s = this.razon.getText();
        if(s.equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacio", "Error Proveedor", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        if(dvgDetalle_compra.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "No puede compra vacia", "Error Lista de compras", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        comp.setMonto(total);
        try {
            logicaNegocio.registrarCompras(comp);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaMantCli.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaMantCli.class.getName()).log(Level.SEVERE, null, ex);
        }
        razon.setText("");
        ruc.setText("");
        nombreProd.setText("");
        pu.setText("");
        cant.setText("");
        jTextField7.setText("");
        razon.setEnabled(false);
        ruc.setEnabled(false);
        nombreProd.setEnabled(false);
        pu.setEnabled(false);
        cant.setEnabled(false);
        buscarProd.setEnabled(false);
        buscarProv.setEnabled(false);
        fecha.cleanup();
        fecha.setEnabled(false);
        jTextField7.setText("");
        for (int i = 0; i < dvgDetalle_compra.getRowCount(); i++) {
            model.removeRow(i);
            i-=1;
        }
        total=0;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        razon.setText("");
        ruc.setText("");
        nombreProd.setText("");
        pu.setText("");
        cant.setText("");
        fecha.cleanup();
        fecha.setEnabled(false);
        razon.setEnabled(false);
        ruc.setEnabled(false);
        nombreProd.setEnabled(false);
        pu.setEnabled(false);
        cant.setEnabled(false);
        buscarProd.setEnabled(false);
        buscarProv.setEnabled(false);
        for (int i = 0; i < dvgDetalle_compra.getRowCount(); i++) {
            model.removeRow(i);
            i-=1;
        }
        total=0;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void puActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int currentIndex = dvgDetalle_compra.getSelectedRow();
        if(currentIndex==-1){
            JOptionPane.showMessageDialog(null, "No se selecciono producto", "Error Eliminar", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        total-=Float.parseFloat(model.getValueAt(currentIndex, 3).toString());
        jTextField7.setText(Float.toString(total));
        model.removeRow(currentIndex);
        comp.getListLineaxProd().remove(currentIndex);
        counterId--;
        for (int i = 0; i < dvgDetalle_compra.getRowCount(); i++) {
            System.out.println(comp.getListLineaxProd().get(i).getProducto().getNombre());
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantActionPerformed

    private void razonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_razonActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void puKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_puKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!((c>='0' && c<='9') || c == '+' || c == '-' || c == '.')) evt.consume();
    }//GEN-LAST:event_puKeyTyped

    private void cantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!((c>='0' && c<='9') || c == '+' || c == '-' )) evt.consume();
    }//GEN-LAST:event_cantKeyTyped

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
            java.util.logging.Logger.getLogger(ventanaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscarProd;
    private javax.swing.JButton buscarProv;
    public javax.swing.JTextField cant;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JTable dvgDetalle_compra;
    public com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField7;
    public javax.swing.JTextField nombreProd;
    public javax.swing.JTextField pu;
    public javax.swing.JTextField razon;
    public javax.swing.JTextField ruc;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
