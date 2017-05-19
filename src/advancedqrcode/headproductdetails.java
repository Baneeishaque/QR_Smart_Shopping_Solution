/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedqrcode;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author junais
 */
public class headproductdetails extends javax.swing.JFrame {

    /**
     * Creates new form headproductdetails
     */
    String itemselected;
    public headproductdetails() {
        
       
            initComponents();
            
            shows();
            
            DefaultComboBoxModel ditem=new DefaultComboBoxModel();
            DefaultComboBoxModel dparty=new DefaultComboBoxModel();
            
            qrdb qdd=new qrdb();
    try {         
            Connection connect=qdd.getc();
            
            Statement stitem=connect.createStatement();
            
            String itemshow="SELECT `name`,`party` FROM `product`";
            
            ResultSet rsitem=stitem.executeQuery(itemshow);
            
            while(rsitem.next())
            {
                ditem.addElement(rsitem.getString(1));
                dparty.addElement(rsitem.getString(2));
            }
            itemvise.setModel(ditem);
            partyvise.setModel(dparty);

            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(headproductdetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(headproductdetails.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        partyvise = new javax.swing.JComboBox<>();
        itemvise = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        datatable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));

        partyvise.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        partyvise.setForeground(new java.awt.Color(51, 0, 51));
        partyvise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PARTY WISE" }));
        partyvise.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                partyviseItemStateChanged(evt);
            }
        });

        itemvise.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        itemvise.setForeground(new java.awt.Color(51, 0, 51));
        itemvise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ITEM WISE" }));
        itemvise.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemviseItemStateChanged(evt);
            }
        });

        datatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(datatable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(itemvise, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 737, Short.MAX_VALUE)
                        .addComponent(partyvise, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(partyvise, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(itemvise))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("PRODUCT DETAILS");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 0));
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 0));
        jButton2.setText("<<");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 0));
        jButton3.setText(">>");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 0));
        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(128, 128, 128)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(287, 287, 287))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Login().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            new headhome().setVisible(true);
            this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemviseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemviseItemStateChanged
        
            // TODO add your handling code here:
            nameshowsonly();
        
    }//GEN-LAST:event_itemviseItemStateChanged

    private void partyviseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_partyviseItemStateChanged
                
            partyshow();

            // TODO add your handling code here:
    }//GEN-LAST:event_partyviseItemStateChanged

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
            java.util.logging.Logger.getLogger(headproductdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(headproductdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(headproductdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(headproductdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new headproductdetails().setVisible(true);
            }
        });
        
       
    }
     private void shows(){
        
            qrdb qdb=new qrdb();
        try {    
            Connection cnn=qdb.getc();
            Statement stmt=cnn.createStatement();
            String strn="SELECT `ProductID`, `name`, `purchaseamount`, `mrp`, `brand`, `manufacturedate`, `expdate`,`taxamount`, `description`, `otherexpence`, `billnumber`, `billdate`, `party` FROM `product`";
            ResultSet rstt=stmt.executeQuery(strn);
            
            
            DefaultTableModel dtm=new DefaultTableModel(null, new String[]{"ProductID", "name", "purchaseamount","mrp","brand", "manufacturedate", "expdate", "taxamount", "description","otherexpence","billnumber", "billdate", "party"});
            while(rstt.next()){
                dtm.addRow(new String[]{rstt.getString(1),rstt.getString(2),rstt.getString(3),rstt.getString(4),rstt.getString(5),rstt.getString(6),rstt.getString(7),rstt.getString(8),rstt.getString(9),rstt.getString(10),rstt.getString(11),rstt.getString(12),rstt.getString(13)});
            }
            datatable.setModel(dtm);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(headproductdetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(headproductdetails.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    private void nameshowsonly()
    {
        
        
            
            
            String itemselected=itemvise.getSelectedItem().toString();
            
            qrdb qdb=new qrdb();
    try {        
            Connection con=qdb.getc();
            Statement sti=con.createStatement();
            String shwitem="SELECT `ProductID`, `name`, `purchaseamount`, `mrp`, `brand`, `manufacturedate`, `expdate`,`taxamount`, `description`, `otherexpence`, `billnumber`, `billdate`, `party` FROM `product` WHERE `name`='"+itemselected+"' ";
            
            ResultSet rsshw=sti.executeQuery(shwitem);
            DefaultTableModel dtname=new DefaultTableModel(null, new String[]{"ProductID", "name", "purchaseamount","mrp","brand", "manufacturedate", "expdate", "taxamount", "description","otherexpence","billnumber", "billdate", "party"});
            while(rsshw.next())
            {
                
                dtname.addRow(new String[]{rsshw.getString(1),rsshw.getString(2),rsshw.getString(3),rsshw.getString(4),rsshw.getString(5),rsshw.getString(6),rsshw.getString(7),rsshw.getString(8),rsshw.getString(9),rsshw.getString(10),rsshw.getString(11),rsshw.getString(12),rsshw.getString(13)});
                
                
                
            }
            datatable.setModel(dtname);

            /* look*/
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(headproductdetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(headproductdetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void partyshow(){
        
        
            String itselected=partyvise.getSelectedItem().toString();
            
            qrdb qdb=new qrdb();
        try {   
            Connection con=qdb.getc();
            Statement sti=con.createStatement();
            String shwitem="SELECT `ProductID`, `name`, `purchaseamount`, `mrp`, `brand`, `manufacturedate`, `expdate`,`taxamount`, `description`, `otherexpence`, `billnumber`, `billdate`, `party` FROM `product` WHERE `party`='"+itselected+"' ";
            //System.out.println(shwitem);
            
            ResultSet rsshw=sti.executeQuery(shwitem);
            DefaultTableModel dtname=new DefaultTableModel(null, new String[]{"ProductID", "name", "purchaseamount","mrp","brand", "manufacturedate", "expdate", "taxamount", "description","otherexpence","billnumber", "billdate", "party"});
            while(rsshw.next())
            {
                
                dtname.addRow(new String[]{rsshw.getString(1),rsshw.getString(2),rsshw.getString(3),rsshw.getString(4),rsshw.getString(5),rsshw.getString(6),rsshw.getString(7),rsshw.getString(8),rsshw.getString(9),rsshw.getString(10),rsshw.getString(11),rsshw.getString(12),rsshw.getString(13)});
                //System.out.println(dtname);
                
            }
            datatable.setModel(dtname);
            
        } catch (ClassNotFoundException ex) 
        {
            
            Logger.getLogger(headproductdetails.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } catch (SQLException ex) 
        {
            Logger.getLogger(headproductdetails.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable datatable;
    private javax.swing.JComboBox<String> itemvise;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> partyvise;
    // End of variables declaration//GEN-END:variables
}
