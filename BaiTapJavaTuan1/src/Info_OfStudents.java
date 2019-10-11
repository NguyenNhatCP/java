
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Info_OfStudents extends javax.swing.JFrame {

    /**
     * Creates new form Info_OfStudents
     */
    public Info_OfStudents() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lb_Name = new javax.swing.JLabel();
        lb_address = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        lb_sex = new javax.swing.JLabel();
        rd_btn_m = new javax.swing.JRadioButton();
        rd_btn_f = new javax.swing.JRadioButton();
        btn_send = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        lb_level = new javax.swing.JLabel();
        lb_fav = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        pn_fav = new javax.swing.JPanel();
        cb_dance = new javax.swing.JCheckBox();
        cb_sing = new javax.swing.JCheckBox();
        cb_read = new javax.swing.JCheckBox();
        cbox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Information Of Students");

        lb_Name.setText("Name");

        lb_address.setText("Address");

        lb_sex.setText("Sex");

        rd_btn_m.setText("Male");
        rd_btn_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_btn_mActionPerformed(evt);
            }
        });

        rd_btn_f.setText("Female");
        rd_btn_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_btn_fActionPerformed(evt);
            }
        });

        btn_send.setText("Send");
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        lb_level.setText("Level");

        lb_fav.setText("Favorite");

        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        cb_dance.setText("Dance");

        cb_sing.setText("Sing");

        cb_read.setText("Read Book");

        javax.swing.GroupLayout pn_favLayout = new javax.swing.GroupLayout(pn_fav);
        pn_fav.setLayout(pn_favLayout);
        pn_favLayout.setHorizontalGroup(
            pn_favLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_favLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_favLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_read, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(cb_sing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_dance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pn_favLayout.setVerticalGroup(
            pn_favLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_favLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_read)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_sing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_dance)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Year", "Sencond Year", "Thrid Year", "Four Year", "Alumni", "Graduated" }));
        cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(lb_sex, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rd_btn_m)
                                        .addGap(18, 18, 18)
                                        .addComponent(rd_btn_f)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lb_fav, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_fav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_address, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_address)))
                        .addGap(59, 59, 59)
                        .addComponent(lb_level, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox, 0, 91, Short.MAX_VALUE)
                        .addGap(13, 13, 13)))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_level, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lb_address, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_fav, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(pn_fav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_sex, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_btn_m)
                    .addComponent(rd_btn_f))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_send)
                    .addComponent(btn_reset)
                    .addComponent(btn_exit))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rd_btn_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_btn_mActionPerformed
        // TODO add your handling code here:
        
        if(rd_btn_m.isSelected())
            rd_btn_f.setSelected(false);
    }//GEN-LAST:event_rd_btn_mActionPerformed

    private void rd_btn_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_btn_fActionPerformed
        // TODO add your handling code here:
        
        if (rd_btn_f.isSelected())
            rd_btn_m.setSelected(false);
    }//GEN-LAST:event_rd_btn_fActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        txt_Name.setText("");
        txt_address.setText("");
        cb_dance.setSelected(false);
        cb_read.setSelected(false);
        cb_sing.setSelected(false);
        rd_btn_f.setSelected(false);
        rd_btn_m.setSelected(false);
        cbox.setSelectedItem("First Year");
        txt_Name.requestFocus();
        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        // TODO add your handling code here:
        
       if(txt_Name.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "You not yet fill your name");
           
            txt_Name.requestFocus();
            
            return;
        }
        else 
       {
           String sex="", level="", fv="";
        
        if (rd_btn_f.isSelected())
            sex = rd_btn_f.getText();
        else if(rd_btn_m.isSelected())
                sex = rd_btn_m.getText();
        level = cbox.getSelectedItem().toString();
        if(cb_dance.isSelected())
            fv=cb_dance.getText();
        if(cb_read.isSelected())
            fv= fv +" "+ cb_read.getText();
        if(cb_sing.isSelected())
            fv= fv + " " + cb_sing.getText();
        JOptionPane.showMessageDialog(this, "Name: " + txt_Name.getText() + "\nAddress: " + txt_address.getText()+ "\nSex: "+ sex +"\nLevel: " +level + "\nFavorite: "+ fv);
           
       }
    }//GEN-LAST:event_btn_sendActionPerformed

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
            java.util.logging.Logger.getLogger(Info_OfStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info_OfStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info_OfStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info_OfStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info_OfStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_send;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_dance;
    private javax.swing.JCheckBox cb_read;
    private javax.swing.JCheckBox cb_sing;
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JLabel lb_Name;
    private javax.swing.JLabel lb_address;
    private javax.swing.JLabel lb_fav;
    private javax.swing.JLabel lb_level;
    private javax.swing.JLabel lb_sex;
    private javax.swing.JPanel pn_fav;
    private javax.swing.JRadioButton rd_btn_f;
    private javax.swing.JRadioButton rd_btn_m;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_address;
    // End of variables declaration//GEN-END:variables
}
