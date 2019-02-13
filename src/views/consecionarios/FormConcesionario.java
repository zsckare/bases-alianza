/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.consecionarios;

import helpers.Comun;
import helpers.ConectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 *
 * @author zsckare
 */
public class FormConcesionario extends javax.swing.JFrame {

    /**
     * Creates new form FormTitular
     */
    public FormConcesionario() {
        initComponents();
        Vector vector = new Vector();
        for (int i = 0; i < Comun.vehiculos.size(); i++) {
            System.out.println(Comun.vehiculos.get(i).getNumerotaxi());
            vector.add(Comun.vehiculos.get(i).getNumerotaxi());            
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
        selectTaxi.setModel(model);
        if(Comun.isEditing){
            btnAction.setText("Guardar Cambios");
            labelTitle.setText("Editar Titular");
            jTextField1.setText(Comun.selectedTitular.getNombre());
            jTextField2.setText(Comun.selectedTitular.getApellido());
            jTextField3.setText(Comun.selectedTitular.getDireccion());
            jTextField4.setText(Comun.selectedTitular.getTelefono());
            
        }else{
            btnAction.setText("Guardar");
            labelTitle.setText("Nuevo Titular");
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        btnAction = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        selectTaxi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitle.setText("Agregar Titular");

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Direccion");

        jLabel4.setText("Telefono");

        jLabel5.setText("Tipo de Socio");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "ADHERENTE", "HONORARIO" }));

        jLabel6.setText("Clave Sindical");

        btnAction.setText("btnAction");
        btnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionActionPerformed(evt);
            }
        });

        jLabel7.setText("Vehiculo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAction)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelTitle)
                                .addComponent(jLabel1)
                                .addComponent(jTextField1)
                                .addComponent(jLabel2)
                                .addComponent(jTextField2)
                                .addComponent(jLabel3)
                                .addComponent(jTextField3)
                                .addComponent(jLabel4)
                                .addComponent(jTextField4)
                                .addComponent(jLabel5)
                                .addComponent(jComboBox1, 0, 151, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addComponent(jTextField5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(selectTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 239, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnAction)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionActionPerformed
        // TODO add your handling code here:
          ConectionDB cDB = new ConectionDB();
        Connection cn = cDB.connect();
        if(cn == null){
            System.out.println("Fallo Conexion");
            JOptionPane.showMessageDialog(this, "Ha Ocurrido un error al conectarse a la base de datos,\n verifique que el servidor este activo", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            System.out.println("Conexion Exitosa");
            if(Comun.isEditing){
            
            }else{
                String index_taxi = selectTaxi.getSelectedItem().toString();
                int id_taxi = returnIdTaxi(index_taxi);
                System.out.println("IDTAXI---->"+ id_taxi);
                String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
        + " values (?, ?, ?, ?, ?)";
                String goodQuery = "INSERT INTO duenocarro (nombre,apellido,direccion,telefono,idtipo,idtaxi,clavesindical) "
                        + "VALUES (?,?,?,?,?,?,?)";
      // create the mysql insert preparedstatement
                PreparedStatement preparedStmt;
                try {
                    preparedStmt = cn.prepareStatement(goodQuery);
                    preparedStmt.setString(1, jTextField1.getText().toString().toUpperCase());
                    preparedStmt.setString(2, jTextField2.getText().toString().toUpperCase());
                    String direccionn = jTextField3.getText().toString().toUpperCase();
                    System.out.print(direccionn);
                    preparedStmt.setString(3, direccionn);
                    preparedStmt.setString(4, jTextField4.getText().toString().toUpperCase());
                    preparedStmt.setInt(5, 1);
                    preparedStmt.setInt(6,id_taxi);
                    preparedStmt.setString(7, jTextField5.getText().toString().toUpperCase());


                    // execute the preparedstatement
                    preparedStmt.execute();
                    JOptionPane.showMessageDialog(this, "Se ha Guardado Correctamente");
                    this.dispose();
                    cDB.getTitulares();
                    new HomeConcesionario().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormConcesionario.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        
    }//GEN-LAST:event_btnActionActionPerformed

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
            java.util.logging.Logger.getLogger(FormConcesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConcesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConcesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConcesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConcesionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAction;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JComboBox<String> selectTaxi;
    // End of variables declaration//GEN-END:variables

    public int returnIdTaxi(String index_taxi) {
        System.out.println("ENTRa A estemetodo");
        System.out.println(index_taxi);
        int id = 0;
        
        for (int i = 0; i < Comun.vehiculos.size(); i++) {
            System.out.println("For"+i);
            if(Comun.vehiculos.get(i).getNumerotaxi().compareToIgnoreCase(index_taxi)==0){
                
                System.out.println("IDMAMALON =====>"+Comun.vehiculos.get(i).getIdtaxi());
                id = Comun.vehiculos.get(i).getIdtaxi();   
                 System.out.print(id);
                return Comun.vehiculos.get(i).getIdtaxi();
            }            
        }   
        System.out.print(id);
        return id;
    }

   
}
