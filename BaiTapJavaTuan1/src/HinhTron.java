
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
public class HinhTron extends javax.swing.JFrame {

    /**
     * Creates new form HinhTron
     */
    public HinhTron() {
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

        lb_DT = new javax.swing.JLabel();
        lb_BanR = new javax.swing.JLabel();
        lb_CV1 = new javax.swing.JLabel();
        txt_CV = new javax.swing.JTextField();
        txt_NhapR = new javax.swing.JTextField();
        txt_DT = new javax.swing.JTextField();
        btn_Tinh = new javax.swing.JButton();
        btn_LamLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hình Tròn");

        lb_DT.setDisplayedMnemonic('D');
        lb_DT.setText("Diện Tích:");

        lb_BanR.setDisplayedMnemonic('R');
        lb_BanR.setText("Bán Kính R:");
        lb_BanR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lb_CV1.setDisplayedMnemonic('C');
        lb_CV1.setText("Chu Vi:");

        txt_CV.setToolTipText("");
        txt_CV.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_CV.setEnabled(false);
        txt_CV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CVActionPerformed(evt);
            }
        });

        txt_NhapR.setToolTipText("Hãy nhập Bán Kính R");
        txt_NhapR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NhapRActionPerformed(evt);
            }
        });

        txt_DT.setToolTipText("");
        txt_DT.setEnabled(false);
        txt_DT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DTActionPerformed(evt);
            }
        });

        btn_Tinh.setBackground(new java.awt.Color(51, 255, 204));
        btn_Tinh.setText("Tính CV, DT");
        btn_Tinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TinhActionPerformed(evt);
            }
        });

        btn_LamLai.setBackground(new java.awt.Color(204, 255, 51));
        btn_LamLai.setText("Làm Lại");
        btn_LamLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_CV1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txt_CV, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_BanR, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txt_NhapR, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_DT, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txt_DT, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Tinh, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_LamLai, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_BanR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NhapR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_CV1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_DT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Tinh)
                    .addComponent(btn_LamLai))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        lb_BanR.getAccessibleContext().setAccessibleDescription("u");
        txt_CV.getAccessibleContext().setAccessibleDescription("");
        txt_DT.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_CVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CVActionPerformed

    private void txt_NhapRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NhapRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NhapRActionPerformed

    private void txt_DTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DTActionPerformed

    private void btn_TinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TinhActionPerformed
        // TODO add your handling code here:
        if (txt_NhapR.getText().equals(""))
        {
            JOptionPane.showConfirmDialog(this, "Bạn chưa nhập bán kính R", "Thông Báo Lỗi", JOptionPane.ERROR_MESSAGE);
            txt_NhapR.requestFocus();
            return;
        
        }
        double R = 0;
        
        try {
            R = Double.parseDouble(txt_NhapR.getText());
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, "Bạn nhập sai dữ liệu số", "Thông Báo Lỗi", JOptionPane.ERROR_MESSAGE);
            txt_NhapR.requestFocus();
            return;
        }
        
        if (R<=0)
        {
            JOptionPane.showMessageDialog(this, "Bán Kính R phải >0", "Thông Báo Lỗi", JOptionPane.ERROR_MESSAGE);
            txt_NhapR.requestFocus();
            return;
        }
        
        double P = 2*Math.PI*R, S = Math.PI*R*R;
       txt_CV.setText(Double.toString(P));
       txt_DT.setText(Double.toString(S));
    }//GEN-LAST:event_btn_TinhActionPerformed

    private void btn_LamLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamLaiActionPerformed

          txt_CV.setText("");
          txt_DT.setText("");
          txt_NhapR.requestFocus();
          txt_NhapR.selectAll();
          
    }//GEN-LAST:event_btn_LamLaiActionPerformed
       
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
            java.util.logging.Logger.getLogger(HinhTron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HinhTron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HinhTron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HinhTron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HinhTron().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LamLai;
    private javax.swing.JButton btn_Tinh;
    private javax.swing.JLabel lb_BanR;
    private javax.swing.JLabel lb_CV1;
    private javax.swing.JLabel lb_DT;
    private javax.swing.JTextField txt_CV;
    private javax.swing.JTextField txt_DT;
    private javax.swing.JTextField txt_NhapR;
    // End of variables declaration//GEN-END:variables
}