/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

import LogicaNegocio.ProductoBL;
import clases.Categoria_Consumible;
import clases.Categoria_NoConsumible;
import clases.Consumible;
import clases.NoConsumible;
import clases.Producto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author alulab14
 */
public class ventanaManProd extends javax.swing.JFrame {

    /**
     * Creates new form ventanaManProd
     */
    
    private ProductoBL LogicaNegocio;
    private int idMod;
    public ventanaManProd() throws ClassNotFoundException, SQLException {
        this.setTitle("Mantener Productos");
        this.setLocationRelativeTo(null);
        
        initComponents();
        list = new ArrayList<Producto>();
        tabla.getColumnModel().getColumn(0).setPreferredWidth(30);
        LogicaNegocio = new ProductoBL();
        listarProductos();
        registrar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        
        idU =0;
    }
    ventanaAdmin ventanaAnterior;
    int idU;
    private ArrayList<Producto> list;

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
        nombre = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        cantMin = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        registrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        consum = new javax.swing.JRadioButton();
        no_consum = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        desc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        moneda = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mantener Producto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 13, 175, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 51, 60, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 80, 60, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Cantidad Minima:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 109, 110, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Marca:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(12, 138, 50, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Tipo Producto:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(12, 196, 100, 16);

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre);
        nombre.setBounds(154, 48, 200, 22);
        getContentPane().add(precio);
        precio.setBounds(154, 77, 200, 22);
        getContentPane().add(cantMin);
        cantMin.setBounds(154, 106, 200, 22);
        getContentPane().add(marca);
        marca.setBounds(154, 135, 200, 22);

        tabla.setBackground(new java.awt.Color(255, 255, 204));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Marca", "Tipo", "Categoria"
            }
        ));
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 330, 520, 130);

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
        registrar.setBounds(12, 290, 100, 30);

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
        modificar.setBounds(262, 290, 100, 30);

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
        eliminar.setBounds(387, 290, 100, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout.png"))); // NOI18N
        jButton4.setText("Cerrar Sesión");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(390, 480, 140, 29);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(260, 480, 110, 29);

        consum.setText("Consumible");
        consum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consumActionPerformed(evt);
            }
        });
        getContentPane().add(consum);
        consum.setBounds(150, 193, 95, 25);

        no_consum.setText("No Consumible");
        no_consum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_consumActionPerformed(evt);
            }
        });
        getContentPane().add(no_consum);
        no_consum.setBounds(250, 193, 120, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Descripción:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(12, 167, 130, 16);
        getContentPane().add(desc);
        desc.setBounds(154, 164, 200, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Categoria:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(12, 225, 110, 16);

        getContentPane().add(categoria);
        categoria.setBounds(154, 222, 200, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Tipo Moneda:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(12, 254, 100, 16);

        moneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja..", "Soles", "Dólares" }));
        moneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedaActionPerformed(evt);
            }
        });
        getContentPane().add(moneda);
        moneda.setBounds(154, 251, 100, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setMargin(new java.awt.Insets(2, 4, 2, 4));
        getContentPane().add(jButton1);
        jButton1.setBounds(137, 290, 100, 29);

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
        s = this.precio.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        if(!isDouble(s)){
            JOptionPane.showMessageDialog(null, "Precio debe ser un valor real", "Error Sueldo", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        s = this.cantMin.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        for (int i=0; i<s.length(); i++){
            if(!(s.charAt(i)>='0' && s.charAt(i)<='9')){
                JOptionPane.showMessageDialog(null, "la cantidad debe ser un entero", "Error Numerico", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
        }
        s = this.marca.getText();
        if((s).equals("")){
            JOptionPane.showMessageDialog(null, "No puede dejar campos activos vacios", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        
        if(!consum.isSelected() && !no_consum.isSelected()){
            JOptionPane.showMessageDialog(null, "No puede dejar campos sin seleccionar", "Error Null", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        
        
        
    
        
                          
        return true;
    }
    
    private void listarProductos() throws ClassNotFoundException, SQLException{
        list = LogicaNegocio.listarProductos();
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        int n = list.size();
        int r = model.getRowCount();
        for (int j=0; j<r; j++){
            model.removeRow(0);
        }
        for (int i=0; i<n; i++){
            String con = "";
            String cat = "";
            if(list.get(i) instanceof Consumible){
                con = "Consumible";
                cat = ((Consumible) list.get(i)).getCategoria().toString();
            }else if(list.get(i) instanceof NoConsumible){
                con = "No Consumible";
                cat = ((NoConsumible) list.get(i)).getCategoria().toString();
            }
            Object o[] = {list.get(i).getIdProducto(), list.get(i).getNombre(), list.get(i).getPrecio(), list.get(i).getMarca(), con, cat};
            model.addRow(o);
        }
    }
    
    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed
    javax.swing.table.DefaultTableModel model;
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        boolean a = validarInput();
        if (!a) return;
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        //idU++;
        //String tipo = "";
        Producto p = null;
        if(consum.isSelected()){
            p = new Consumible();
            Categoria_Consumible c = Categoria_Consumible.valueOf(categoria.getSelectedItem().toString());
            ((Consumible) p).setCategoria(Categoria_Consumible.Snack);
            //tipo = "Consumible";
        }else if(no_consum.isSelected()){
            p = new NoConsumible();
            Categoria_NoConsumible c = Categoria_NoConsumible.valueOf(categoria.getSelectedItem().toString());
            ((NoConsumible) p).setCategoria(c);
            //tipo = "No Consumible";
        }
        p.setNombre(nombre.getText());
        p.setPrecio(Double.parseDouble(precio.getText()));
        p.setCantMinima(Integer.parseInt(cantMin.getText()));
        p.setMarca(marca.getText());
        p.setDescripcion(desc.getText());
        p.setMoneda(moneda.getSelectedItem().toString());
        
        
        try {
            LogicaNegocio.registrarProducto(p);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            listarProductos();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        }

        nombre.setText("");
        precio.setText("");
        cantMin.setText("");
        marca.setText("");
        desc.setText("");
        categoria.setSelectedItem(categoria.getItemAt(0));
        consum.setSelected(false);
        no_consum.setSelected(false);
        
    }//GEN-LAST:event_registrarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        boolean a = validarInput();
        if(!a) return;
        Producto p = null;
        if(consum.isSelected()){
            p = new Consumible();
            Categoria_Consumible c = Categoria_Consumible.valueOf(categoria.getSelectedItem().toString());
            ((Consumible) p).setCategoria(Categoria_Consumible.valueOf(categoria.getSelectedItem().toString()));
            //tipo = "Consumible";
        }else if(no_consum.isSelected()){
            p = new NoConsumible();
            Categoria_NoConsumible c = Categoria_NoConsumible.valueOf(categoria.getSelectedItem().toString());
            ((NoConsumible) p).setCategoria(c);
            //tipo = "No Consumible";
        }
        p.setIdProducto(idMod);
        p.setNombre(nombre.getText());
        p.setPrecio(Double.parseDouble(precio.getText()));
        p.setCantMinima(Integer.parseInt(cantMin.getText()));
        p.setMarca(marca.getText());
        p.setDescripcion(desc.getText());
        p.setMoneda(moneda.getSelectedItem().toString());
        
        try {
            LogicaNegocio.modificarProducto(p);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            listarProductos();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        nombre.setText("");
        precio.setText("");
        cantMin.setText("");
        marca.setText("");
        desc.setText("");
        consum.setSelected(true);
        no_consum.setSelected(false);
        categoria.removeAllItems();
        moneda.setSelectedItem(moneda.getItemAt(0));
    }//GEN-LAST:event_modificarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int YesOrNo = JOptionPane.showConfirmDialog(null, "¿Desea volver a la ventana anterior?","Volver", JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0){
            ventanaAnterior.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        nombre.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 1)));
        precio.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 2)));
        cantMin.setText(String.valueOf(list.get(tabla.getSelectedRow()).getCantMinima()));
        marca.setText(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 3)));
        String s = String.valueOf(model.getValueAt(tabla.getSelectedRow(), 4));
        if( s == "Consumible"){
            consum.setSelected(true);
            no_consum.setSelected(false);
            inicializarComboCon(1);
        }else if(s == "No Consumible"){
            consum.setSelected(false);
            no_consum.setSelected(true);
            inicializarComboCon(2);
        }
        idMod = list.get(tabla.getSelectedRow()).getIdProducto();
        //System.out.println(idMod);
        categoria.setSelectedItem(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 5)));
        moneda.setSelectedItem(list.get(tabla.getSelectedRow()).getMoneda());
        desc.setText(list.get(tabla.getSelectedRow()).getDescripcion());
        
        registrar.setEnabled(true);
        modificar.setEnabled(true);
        eliminar.setEnabled(true);
        return;
    }//GEN-LAST:event_tablaMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try {
            // TODO add your handling code here:
            LogicaNegocio.eliminarProducto(idMod);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            listarProductos();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        eliminar.setEnabled(false);
        modificar.setEnabled(false);
        nombre.setText("");
        precio.setText("");
        cantMin.setText("");
        marca.setText("");
        no_consum.setSelected(false);
        consum.setSelected(false);
        
    }//GEN-LAST:event_eliminarActionPerformed
    ventanaLogin ventanaHome;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int YesOrNo = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?","Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0){
            ventanaHome.regresar();
            this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void inicializarComboCon(int tipo){
        ArrayList<String> s = new ArrayList<String>();
        if(tipo == 1){
            s.add(Categoria_Consumible.Bebida.toString());
            s.add(Categoria_Consumible.Caramelo.toString());
            s.add(Categoria_Consumible.Helado.toString());
            s.add(Categoria_Consumible.Postre.toString());
            s.add(Categoria_Consumible.Snack.toString());
        }else if(tipo == 2){
            s.add(Categoria_NoConsumible.Adorno.toString());
            s.add(Categoria_NoConsumible.Juguete.toString());
            s.add(Categoria_NoConsumible.UtilOficina.toString());
        }
        int n = s.size();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(int i=0; i<n; i++){
            modelo.addElement(s.get(i));
        }
        categoria.setModel(modelo);
    }
    
    private void consumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consumActionPerformed
        // TODO add your handling code here:
        if (consum.isSelected()==true){
            no_consum.setSelected(false);
            inicializarComboCon(1);
            registrar.setEnabled(true);
        }
    }//GEN-LAST:event_consumActionPerformed

    private void no_consumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_consumActionPerformed
        // TODO add your handling code here:
        if (no_consum.isSelected()==true){
            consum.setSelected(false);
            inicializarComboCon(2);
            registrar.setEnabled(true);
        }
    }//GEN-LAST:event_no_consumActionPerformed

    private void monedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedaActionPerformed
        // TODO add your handling code here:
        if (moneda.getSelectedItem().equals(moneda.getItemAt(0))){
            registrar.setEnabled(false);
            modificar.setEnabled(false);
            eliminar.setEnabled(false);
        }
    }//GEN-LAST:event_monedaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantMin;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JRadioButton consum;
    private javax.swing.JTextField desc;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marca;
    private javax.swing.JButton modificar;
    private javax.swing.JComboBox<String> moneda;
    private javax.swing.JRadioButton no_consum;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
