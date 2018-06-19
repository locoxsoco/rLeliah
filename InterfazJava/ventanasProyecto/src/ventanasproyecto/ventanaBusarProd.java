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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres
 */
    public class ventanaBusarProd extends javax.swing.JFrame {

    /**
     * Creates new form ventanaBusarProd
     */
    public ventanaCompra ventanaAnterior;
    private ProductoBL LogicaNegocio;
    private ArrayList<Producto> list;
    public ventanaBusarProd() {
        addWindowListener(new java.awt.event.WindowAdapter(){
            
            public void windowClosing(java.awt.event.WindowEvent evt){
                cerrar();
            }
        });
        initComponents();
        seleccionar.setEnabled(false);
        LogicaNegocio = new ProductoBL();
        list = new ArrayList<Producto>();
        inicializarCon();
        buscar.doClick();
    }
    private void cerrar(){
        ventanaAnterior.setEnabled(true);
        this.dispose();
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
        consum = new javax.swing.JRadioButton();
        no_consum = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        buscar = new javax.swing.JButton();
        seleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Buscar Producto");
        setPreferredSize(new java.awt.Dimension(420, 560));
        getContentPane().setLayout(null);

        jLabel1.setText("Consumible:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 26, 90, 14);

        consum.setText("Consumible");
        consum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consumActionPerformed(evt);
            }
        });
        getContentPane().add(consum);
        consum.setBounds(101, 22, 110, 23);

        no_consum.setText("No Consumible");
        no_consum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_consumActionPerformed(evt);
            }
        });
        getContentPane().add(no_consum);
        no_consum.setBounds(214, 22, 140, 23);

        jLabel2.setText("Categoria:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 59, 51, 14);

        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });
        getContentPane().add(categoria);
        categoria.setBounds(101, 56, 170, 20);

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 99, 41, 14);

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        getContentPane().add(nombre);
        nombre.setBounds(101, 96, 230, 20);

        jLabel4.setText("Marca:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 139, 33, 14);

        marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marcaKeyTyped(evt);
            }
        });
        getContentPane().add(marca);
        marca.setBounds(101, 136, 194, 20);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Marca", "Consumible", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 375, 280);

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(120, 170, 100, 29);

        seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seleccionar.png"))); // NOI18N
        seleccionar.setText("Seleccionar");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(seleccionar);
        seleccionar.setBounds(250, 170, 130, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
                        // TODO add your handling code here:
        int cons;
        if (consum.isSelected()) cons = 1;
        else if (no_consum.isSelected()) cons =0;
        else cons = -1;
        
        try {
            list = LogicaNegocio.buscarProductos(nombre.getText(), marca.getText(), categoria.getSelectedItem().toString(), cons);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaManProd.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (javax.swing.table.DefaultTableModel)tabla.getModel();
        int n = list.size();
        int r = model.getRowCount();
        for (int j=0; j<r; j++){
            model.removeRow(0);
        }
        for (int i=0; i<n; i++){
            String con = "";
            String cat = "";
            if(list.get(i) instanceof Consumible){
                con = "Si";
                cat = ((Consumible) list.get(i)).getCategoria().toString();
            }else if(list.get(i) instanceof NoConsumible){
                con = "No";
                cat = ((NoConsumible) list.get(i)).getCategoria().toString();
            }
            Object o[] = {list.get(i).getNombre(), list.get(i).getMarca(), con, cat,list.get(i).getIdProducto(),  list.get(i).getPrecio()};
            model.addRow(o);
        }
    }//GEN-LAST:event_buscarActionPerformed

    
    
    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        // TODO add your handling code here:
        int n = tabla.getSelectedRow();
        //this.ventanaAnterior.prov = lista.get(n);
        ventanaAnterior.nombreProd.setText(list.get(n).getNombre());
        ventanaAnterior.idProd = list.get(n).getIdProducto();
        ventanaAnterior.setEnabled(true);
        ventanaAnterior.prod= list.get(n);
        if(list.get(n).getEsConsumible()==1){
            ventanaAnterior.fecha.setEnabled(true);
            ventanaAnterior.fecha.setVisible(true);
            ventanaAnterior.jLabel4.setVisible(true);
        }else{
            ventanaAnterior.fecha.setEnabled(false);
            ventanaAnterior.fecha.setVisible(false);
            ventanaAnterior.jLabel4.setVisible(false);
        }
        ventanaAnterior.pu.setEnabled(true);
        ventanaAnterior.cant.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_seleccionarActionPerformed
    
    
    private void consumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consumActionPerformed
        // TODO add your handling code here:
        if (consum.isSelected()==true){
            no_consum.setSelected(false);
            inicializarComboCon(1);
        }
    }//GEN-LAST:event_consumActionPerformed

    private void no_consumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_consumActionPerformed
        // TODO add your handling code here:
        if (no_consum.isSelected()==true){
            consum.setSelected(false);
            inicializarComboCon(2);
        }
    }//GEN-LAST:event_no_consumActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        seleccionar.setEnabled(true);
    }//GEN-LAST:event_tablaMouseClicked

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!((c<='Z' && c>='A')||(c<='z' && c>='a')|| c == 'ñ' || c == 'Ñ' || c==' ' || c == '-' || (c>='0' && c<='9'))) evt.consume();
        if(nombre.getText().length()>=45) evt.consume();
    }//GEN-LAST:event_nombreKeyTyped

    private void marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marcaKeyTyped
        // TODO add your handling code here:
        if(marca.getText().length()>=45) evt.consume();
    }//GEN-LAST:event_marcaKeyTyped

    private void inicializarCon(){
        ArrayList<String> s = new ArrayList<String>();
        s.add("Todos");
        int n = s.size();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(int i=0; i<n; i++){
            modelo.addElement(s.get(i));
        }
        categoria.setModel(modelo);
    }
    
    private void inicializarComboCon(int tipo){
        ArrayList<String> s = new ArrayList<String>();
        if(tipo == 1){
            s.add("Todos");
            s.add(Categoria_Consumible.Bebida.toString());
            s.add(Categoria_Consumible.Caramelo.toString());
            s.add(Categoria_Consumible.Helado.toString());
            s.add(Categoria_Consumible.Postre.toString());
            s.add(Categoria_Consumible.Snack.toString());
        }else if(tipo == 2){
            s.add("Todos");
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JRadioButton consum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marca;
    private javax.swing.JRadioButton no_consum;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton seleccionar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
