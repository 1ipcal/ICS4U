/*
 * Name: Calvin Ip
 * Date: April 16, 2021
 * Version: 1.0
 * Description: This program is a database app for Video Games
 *           
 */
package edu.hdsb.gwss.ics4u.u6;

import javax.swing.DefaultComboBoxModel;

/**
 * @author ICS4U-Calvin
 */
public class VideoGameMainApp extends javax.swing.JFrame {

    /**
     * Creates new form VideoGameMainApp
     */
    public VideoGameMainApp() {
        initComponents();
        
        populateDropDown();
    }
    
    /*
    * This Method Reads all availible objects in the RAF file
    * and poopulates the drop down box
    */
    public void populateDropDown(){
        //Open the RAF 
        VideoGameDB.open();
        
        //Declare Combobox Model Object
        DefaultComboBoxModel model = new javax.swing.DefaultComboBoxModel<>();
        
        //Get Number of Records Present
        int numRecords = VideoGameDB.getNumberOfRecords();
        
        //Retrieve Items from the file and add them to the ComboBoxModel
        for (int i = 1; i <= numRecords; i++) {
            VideoGameRecord vg = VideoGameDB.read(i);
            model.addElement( vg.getName().trim() );
        }
                
        //Set Combobox to have and display the Objects names
        jComboBox.setModel( model );
        
        //Close the RAF File
        VideoGameDB.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackgroundTop = new javax.swing.JPanel();
        jButtonAddVideoGame = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jPanelBackgroundBottom = new javax.swing.JPanel();
        jComboBox = new javax.swing.JComboBox<>();
        jButtonUpdateVideoGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanelBackgroundTop.setBackground(new java.awt.Color(153, 204, 255));

        jButtonAddVideoGame.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAddVideoGame.setText("Add Video Game");
        jButtonAddVideoGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddVideoGameActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabelTitle.setText("Video Game Database");

        javax.swing.GroupLayout jPanelBackgroundTopLayout = new javax.swing.GroupLayout(jPanelBackgroundTop);
        jPanelBackgroundTop.setLayout(jPanelBackgroundTopLayout);
        jPanelBackgroundTopLayout.setHorizontalGroup(
            jPanelBackgroundTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundTopLayout.createSequentialGroup()
                .addGroup(jPanelBackgroundTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundTopLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButtonAddVideoGame, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundTopLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBackgroundTopLayout.setVerticalGroup(
            jPanelBackgroundTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundTopLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButtonAddVideoGame, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanelBackgroundBottom.setBackground(new java.awt.Color(153, 255, 204));

        jComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jButtonUpdateVideoGame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdateVideoGame.setText("Update");
        jButtonUpdateVideoGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateVideoGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundBottomLayout = new javax.swing.GroupLayout(jPanelBackgroundBottom);
        jPanelBackgroundBottom.setLayout(jPanelBackgroundBottomLayout);
        jPanelBackgroundBottomLayout.setHorizontalGroup(
            jPanelBackgroundBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonUpdateVideoGame, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanelBackgroundBottomLayout.setVerticalGroup(
            jPanelBackgroundBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundBottomLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanelBackgroundBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdateVideoGame, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelBackgroundBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBackgroundTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBackgroundTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBackgroundBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddVideoGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddVideoGameActionPerformed

        //Open the AddVideoGame Window
        AddVideoGame avg = new AddVideoGame(this);
        avg.setVisible(true);
        
        
        //Hide Main Window
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonAddVideoGameActionPerformed

    private void jButtonUpdateVideoGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateVideoGameActionPerformed

        //Open the AddVideoGame Window
        AddVideoGame avg = new AddVideoGame(this, jComboBox.getSelectedIndex() + 1);
        avg.setVisible(true);

        
        //Hide Main Window
        this.setVisible(false);
    }//GEN-LAST:event_jButtonUpdateVideoGameActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(VideoGameMainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoGameMainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoGameMainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoGameMainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoGameMainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddVideoGame;
    private javax.swing.JButton jButtonUpdateVideoGame;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelBackgroundBottom;
    private javax.swing.JPanel jPanelBackgroundTop;
    // End of variables declaration//GEN-END:variables
}
