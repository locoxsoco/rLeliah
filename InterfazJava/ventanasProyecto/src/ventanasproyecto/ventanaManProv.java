/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

import LogicaNegocio.ProveedorBL;
import clases.Departamento;
import clases.DiaSemana;
import clases.Distrito;
import clases.Proveedor;
import clases.Provincia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class ventanaManProv extends javax.swing.JFrame {

    /**
     * Creates new form ventanaManProv
     */
    ventanaAdmin ventanaAnterior;
    private ProveedorBL LogicaNegocio;
    private ArrayList<Proveedor> lista;
    
    public ventanaManProv() throws ClassNotFoundException, SQLException {
        this.setTitle("ventana Mantener Proveedores");
        this.setLocationRelativeTo(null);
        initComponents();
        LogicaNegocio = new ProveedorBL();
        lista = new ArrayList<Proveedor>();
        llenarComboBoxDia();
        llenarComboBoxDep();
        listarProveedores();
        provincia.setVisible(false);
        distrito.setVisible(false);
        dir.setVisible(false);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabla.getColumnModel().getColumn(6).setPreferredWidth(200);
        registrar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        idU = 0;
    }
    int idU;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dir = new javax.swing.JTextField();
        ruc = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        tlf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        dia = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        departamento = new javax.swing.JComboBox<>();
        provincia = new javax.swing.JComboBox<>();
        distrito = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 540));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mantener Proveedores");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 13, 206, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 43, 80, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("RUC:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 73, 80, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Dirección:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 133, 80, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Correo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 103, 80, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Telefono:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 133, 80, 16);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Día Visita:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 163, 80, 16);

        dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirActionPerformed(evt);
            }
        });
        getContentPane().add(dir);
        dir.setBounds(500, 130, 200, 22);
        getContentPane().add(ruc);
        ruc.setBounds(120, 70, 200, 22);
        getContentPane().add(nombre);
        nombre.setBounds(120, 40, 200, 22);
        getContentPane().add(tlf);
        tlf.setBounds(120, 130, 200, 22);

        tabla.setBackground(new java.awt.Color(255, 255, 204));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "RUC", "Correo", "Telefono", "Dia Visita", "Direccion"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 250, 680, 180);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout.png"))); // NOI18N
        jButton1.setText("Cerrar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(570, 450, 140, 29);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(460, 450, 100, 29);

        registrar.setBackground(new java.awt.Color(255, 255, 204));
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.setMargin(new java.awt.Insets(2, 4, 2, 4));
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar);
        registrar.setBounds(30, 205, 100, 29);

        eliminar.setBackground(new java.awt.Color(255, 255, 204));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setMargin(new java.awt.Insets(2, 4, 2, 4));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar);
        eliminar.setBounds(405, 205, 100, 29);

        modificar.setBackground(new java.awt.Color(255, 255, 204));
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.setMargin(new java.awt.Insets(2, 4, 2, 4));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar);
        modificar.setBounds(280, 205, 100, 29);

        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });
        getContentPane().add(dia);
        dia.setBounds(120, 160, 118, 22);
        getContentPane().add(email);
        email.setBounds(120, 100, 200, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Departamento:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 40, 100, 16);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Provincia:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 70, 90, 16);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Distrito:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 100, 70, 16);

        departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentoActionPerformed(evt);
            }
        });
        getContentPane().add(departamento);
        departamento.setBounds(500, 40, 200, 22);

        provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciaActionPerformed(evt);
            }
        });
        getContentPane().add(provincia);
        provincia.setBounds(500, 70, 200, 22);

        distrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distritoActionPerformed(evt);
            }
        });
        getContentPane().add(distrito);
        distrito.setBounds(500, 100, 200, 22);

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButton3.setText("Buscar");
        jButton3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        getContentPane().add(jButton3);
        jButton3.setBounds(155, 205, 100, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarInput(){
        String s = this.nombre.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        for (int i=0; i<s.length(); i++){
            if(!((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z') || s.charAt(i) == 'ñ' || s.charAt(i) == 'Ñ' || s.charAt(i)== ' ')){
                JOptionPane.showMessageDialog(null, "campo nombre solo puede contener letras", "Error Direccion", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
        }
        s = this.ruc.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        for (int i=0; i<s.length(); i++){
            if(!(s.charAt(i)>='0' && s.charAt(i)<='9')){
                JOptionPane.showMessageDialog(null, "campo ruc solo puede contener numeros", "Error Telefono", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
        }
        
        s = this.tlf.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        for (int i=0; i<s.length(); i++){
            if(!(s.charAt(i)>='0' && s.charAt(i)<='9')){
                JOptionPane.showMessageDialog(null, "campo telefono solo puede contener numeros", "Error Telefono", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
        }
        
        s = this.dir.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        for (int i=0; i<s.length(); i++){
            if(!((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z') || s.charAt(i) == 'ñ' || s.charAt(i) == 'Ñ' || s.charAt(i)== ' ' || (s.charAt(i)>='0' && s.charAt(i)<='9'))){
                JOptionPane.showMessageDialog(null, "campo direccion solo puede contener letras", "Error Nombre", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
        }
        s = this.email.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        
        
        return true;
    }
    
    private void listarProveedores() throws ClassNotFoundException, SQLException{
        lista = LogicaNegocio.listarProveedores();
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        int n = lista.size();
        int r = model.getRowCount();
        for (int j=0; j<r; j++){
            model.removeRow(0);
        }
        for (int i=0; i<n; i++){
            Object o[] = {lista.get(i).getId(), lista.get(i).getNombre(), lista.get(i).getRuc(), lista.get(i).getCorreo(), lista.get(i).getTelefono(),lista.get(i).getDiaSemana().toString(), lista.get(i).getDireccion()+", "+lista.get(i).getDistrito().toString()+", "+lista.get(i).getProvincia().toString()+", "+lista.get(i).getDepartamento().toString()};
            model.addRow(o);
        }
    
    }
    
    private void llenarComboBoxDia() throws ClassNotFoundException, SQLException{
        ArrayList<DiaSemana> dias = LogicaNegocio.listarDias();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        int n = dias.size();
        for(int i=0; i<n; i++){
            modelo.addElement(dias.get(i));
        }
        dia.setModel(modelo);
    }
    
    private void llenarComboBoxDep() throws ClassNotFoundException, SQLException{
        ArrayList<Departamento> dep = LogicaNegocio.listarDepartamentos();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        int n = dep.size();
        for(int i=0; i<n; i++){
            modelo.addElement(dep.get(i));
        }
        departamento.setModel(modelo);
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int YesOrNo = JOptionPane.showConfirmDialog(null, "¿Desea volver a la ventana anterior?","Volver", JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0){
            this.ventanaAnterior.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    javax.swing.table.DefaultTableModel model;
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        int YesOrNo = JOptionPane.showConfirmDialog(null, "¿Desea registrar el proveedor?","Registrar Proveedor", JOptionPane.YES_NO_OPTION);
        if(YesOrNo != 0){
            return;
        }
        
        boolean a = validarInput();
        if(!a) return;
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        
        Proveedor p = new Proveedor();
        p.setNombre(nombre.getText());
        p.setRuc(ruc.getText());
        p.setCorreo(email.getText());
        p.setTelefono(tlf.getText());
        p.setDiaSemana((DiaSemana)dia.getSelectedItem());
        p.setDepartamento((Departamento)departamento.getSelectedItem());
        p.setProvincia((Provincia) provincia.getSelectedItem());
        p.setDistrito((Distrito) distrito.getSelectedItem());
        p.setDireccion(dir.getText());
        
        try {
            LogicaNegocio.registrarProveedor(p);
            listarProveedores();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProv.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProv.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        nombre.setText("");
        ruc.setText("");
        dir.setText("");
        email.setText("");
        tlf.setText("");
        dia.setSelectedItem(dia.getItemAt(0));
        departamento.setSelectedItem(departamento.getItemAt(0));
        provincia.setVisible(false);
        distrito.setVisible(false);
        dir.setVisible(false);
    }//GEN-LAST:event_registrarActionPerformed

    private void dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dirActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
        if (this.dia.getSelectedItem().toString() == "Escoja..."){
            registrar.setEnabled(false);
            modificar.setEnabled(false);
            eliminar.setEnabled(false);
        }else{
            registrar.setEnabled(true);
        }
    }//GEN-LAST:event_diaActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        int YesOrNo = JOptionPane.showConfirmDialog(null, "¿Desea modificar la linea seleccionada?","Modificar Proveedor", JOptionPane.YES_NO_OPTION);
        if(YesOrNo != 0){
            return;
        }
        
        boolean a = validarInput();
        if(!a) return;
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        
        Proveedor p = new Proveedor();
        p.setNombre(nombre.getText());
        p.setRuc(ruc.getText());
        p.setCorreo(email.getText());
        p.setTelefono(tlf.getText());
        p.setDiaSemana((DiaSemana)dia.getSelectedItem());
        p.setDepartamento((Departamento)departamento.getSelectedItem());
        p.setProvincia((Provincia) provincia.getSelectedItem());
        p.setDistrito((Distrito) distrito.getSelectedItem());
        p.setDireccion(dir.getText());
        
        try {
            LogicaNegocio.modificarProveedor(p);
            listarProveedores();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProv.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProv.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        nombre.setText("");
        ruc.setText("");
        dir.setText("");
        email.setText("");
        tlf.setText("");
        dia.setSelectedItem(dia.getItemAt(0));
        departamento.setSelectedItem(departamento.getItemAt(0));
        provincia.setVisible(false);
        distrito.setVisible(false);
        dir.setVisible(false);
    }//GEN-LAST:event_modificarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        int n = tabla.getSelectedRow();
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        
        
        nombre.setText(lista.get(n).getNombre());
        ruc.setText(lista.get(n).getRuc());
        dir.setText(lista.get(n).getDireccion());
        email.setText(lista.get(n).getCorreo());
        tlf.setText(lista.get(n).getTelefono());
        dia.setSelectedItem(lista.get(n).getDiaSemana());
        departamento.setSelectedItem(lista.get(n).getDepartamento());
        provincia.setSelectedItem(lista.get(n).getProvincia());
        distrito.setSelectedItem(lista.get(n).getDistrito());
        idU = lista.get(n).getId();
        provincia.setVisible(true);
        distrito.setVisible(true);
        dir.setVisible(true);
        modificar.setEnabled(true);
        eliminar.setEnabled(true);
    }//GEN-LAST:event_tablaMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int YesOrNo = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la linea seleccionada?","Eliminar Proveedor", JOptionPane.YES_NO_OPTION);
        if(YesOrNo != 0){
            return;
        }
        try {
            // TODO add your handling code here:
            LogicaNegocio.eliminarServicio(idU);
            listarProveedores();
            //model.removeRow(tabla.getSelectedRow());
            eliminar.setEnabled(false);
            modificar.setEnabled(false);
            nombre.setText("");
            ruc.setText("");
            dir.setText("");
            email.setText("");
            tlf.setText("");
            dia.setSelectedItem(dia.getItemAt(0));
            departamento.setSelectedItem(departamento.getItemAt(0));
            provincia.setVisible(false);
            distrito.setVisible(false);
            dir.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProv.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarActionPerformed
    
    ventanaLogin ventanaHome;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int YesOrNo = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?","Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0){
            ventanaHome.regresar();
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoActionPerformed
        try {
            // TODO add your handling code here:
            Departamento d = (Departamento) departamento.getSelectedItem();
            ArrayList<Provincia> prov = LogicaNegocio.listarProvincias(d.getIdDep());
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            int n = prov.size();
            for(int i=0; i<n; i++){
                modelo.addElement(prov.get(i));
            }
            provincia.setModel(modelo);
            provincia.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProv.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_departamentoActionPerformed

    private void provinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciaActionPerformed
        try {
            // TODO add your handling code here:
            Provincia p = (Provincia) provincia.getSelectedItem();
            ArrayList<Distrito> dist = LogicaNegocio.listarDistritos(p.getIdProv());
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            int n = dist.size();
            for(int i=0; i<n; i++){
                modelo.addElement(dist.get(i));
            }
            distrito.setModel(modelo);
            distrito.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProv.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_provinciaActionPerformed

    private void distritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distritoActionPerformed
        // TODO add your handling code here:
        dir.setVisible(true);
    }//GEN-LAST:event_distritoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> departamento;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JTextField dir;
    private javax.swing.JComboBox<String> distrito;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> provincia;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField ruc;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tlf;
    // End of variables declaration//GEN-END:variables
}
