/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nomor11;

/**
 *
 * @author LENOVO
 */
public class window extends javax.swing.JFrame {

    /**
     * Creates new form window
     */
    public window() {
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

        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textPlain = new javax.swing.JTextField();
        chiperText = new javax.swing.JTextField();
        caisarEncript = new javax.swing.JButton();
        caisatDecript = new javax.swing.JButton();
        caisarClear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        keyText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        vigenerePlain = new javax.swing.JTextField();
        vigenereChiper = new javax.swing.JTextField();
        vigenereKey = new javax.swing.JTextField();
        vigenereEncript = new javax.swing.JButton();
        vigenereDecript = new javax.swing.JButton();
        vigenereClear = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 300));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 40));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel1.setText("CAISAR CIPHER");
        jPanel3.add(jLabel1);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("PLAIN TEXT");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setText("CHIPER TEXT");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel4.add(textPlain, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 300, -1));
        jPanel4.add(chiperText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 300, -1));

        caisarEncript.setText("ENCRIPT ");
        caisarEncript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caisarEncriptActionPerformed(evt);
            }
        });
        jPanel4.add(caisarEncript, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        caisatDecript.setText("DECRIPT");
        caisatDecript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caisatDecriptActionPerformed(evt);
            }
        });
        jPanel4.add(caisatDecript, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        caisarClear.setText("CLEAR");
        caisarClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caisarClearActionPerformed(evt);
            }
        });
        jPanel4.add(caisarClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        jLabel4.setText("KEY");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPanel4.add(keyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 300, -1));

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(500, 40));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel6.setText("VIGENERE CHIPER");
        jPanel6.add(jLabel6);

        jPanel1.add(jPanel6, java.awt.BorderLayout.PAGE_START);
        jPanel1.add(jLabel7, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(255, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("PLAIN TEXT");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel9.setText("CHIPER TEXT");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel10.setText("KEY");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        jPanel7.add(vigenerePlain, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 270, -1));
        jPanel7.add(vigenereChiper, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 270, -1));
        jPanel7.add(vigenereKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 270, -1));

        vigenereEncript.setText("ENCRIPT");
        vigenereEncript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vigenereEncriptActionPerformed(evt);
            }
        });
        jPanel7.add(vigenereEncript, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        vigenereDecript.setText("DECRIPT");
        vigenereDecript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vigenereDecriptActionPerformed(evt);
            }
        });
        jPanel7.add(vigenereDecript, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        vigenereClear.setText("CLEAR");
        vigenereClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vigenereClearActionPerformed(evt);
            }
        });
        jPanel7.add(vigenereClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        jPanel1.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caisarEncriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caisarEncriptActionPerformed
        String plainText = textPlain.getText().toLowerCase();
        int key = Integer.parseInt(keyText.getText());
        String encript = caisarEncript(plainText, key);
        chiperText.setText(encript.toUpperCase());
    }//GEN-LAST:event_caisarEncriptActionPerformed

    private void caisatDecriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caisatDecriptActionPerformed
        String encript = chiperText.getText().toLowerCase();
        int key = Integer.parseInt(keyText.getText());
        String plainText = caisardecript(encript, key);
       textPlain.setText(plainText.toUpperCase());
    }//GEN-LAST:event_caisatDecriptActionPerformed

    private void caisarClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caisarClearActionPerformed
        textPlain.setText("");
        chiperText.setText("");
        keyText.setText("");
    }//GEN-LAST:event_caisarClearActionPerformed

    private void vigenereEncriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vigenereEncriptActionPerformed
        String plainText = vigenerePlain.getText().toLowerCase();
        String key = vigenereKey.getText().toLowerCase();
        String hasilEncript = vigenereEncript(plainText, key);
        vigenereChiper.setText(hasilEncript.toLowerCase());
    }//GEN-LAST:event_vigenereEncriptActionPerformed

    private void vigenereDecriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vigenereDecriptActionPerformed
        String encript = vigenereChiper.getText().toLowerCase();
        String key = vigenereKey.getText().toLowerCase();
        String plainText = viginereDecript(encript, key);
        
        vigenerePlain.setText(plainText.toUpperCase());
    }//GEN-LAST:event_vigenereDecriptActionPerformed
 
    private void vigenereClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vigenereClearActionPerformed
        vigenerePlain.setText("");
        vigenereChiper.setText("");
        vigenereKey.setText("");
    }//GEN-LAST:event_vigenereClearActionPerformed

    private static String vigenereEncript (String text, String shift) {
        StringBuffer sb = new StringBuffer();
        
        int panjang = text.length();
        for (int i = 0; i < panjang; i++) {
            int j = i % shift.length();
            int k = (int) shift.charAt(j) - 97;
            int p = text.charAt(i) - 97;
            int e = (p + k)% 26;
             
            char kembaliHuruf = (char)(e + 97);
            sb.append(kembaliHuruf);
        }
        return sb.toString();
    }
    
    private static String viginereDecript (String text, String shift) {
        StringBuffer sb = new StringBuffer();
        
        int panjang = text.length();
        for (int i = 0; i < panjang; i++) {
            int j = i % shift.length();
            int k = (int) shift.charAt(j) - 97;
            int p = text.charAt(i) - 97;
            int e = (p - k) % 26;
            if (e < 0 ) {
                e += 26;
            }
            
            char kembaliHuruf = (char)(e + 97);
            sb.append(kembaliHuruf);
        }
        return sb.toString();
    }
    /**
     * @param args the command line arguments
     */
    
    private static String caisarEncript(String text, int shift) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            int p = text.charAt(i) - 97;
            int e = (p + shift) % 26;
            
            char kembaliHuruf = (char) (e + 97);
            sb.append(kembaliHuruf);
        }
        return sb.toString();
    }
    
    private static String caisardecript (String text, int shift) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            int e = text.charAt(i) - 97;
            int p = (e - shift) % 26;   
            if (p < 0) {
                p += 26;
            }
            char kembaliAngka = (char)(p + 97);
            sb.append(kembaliAngka);
        }
        return sb.toString();
    }
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
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton caisarClear;
    private javax.swing.JButton caisarEncript;
    private javax.swing.JButton caisatDecript;
    private javax.swing.JTextField chiperText;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField keyText;
    private javax.swing.JTextField textPlain;
    private javax.swing.JTextField vigenereChiper;
    private javax.swing.JButton vigenereClear;
    private javax.swing.JButton vigenereDecript;
    private javax.swing.JButton vigenereEncript;
    private javax.swing.JTextField vigenereKey;
    private javax.swing.JTextField vigenerePlain;
    // End of variables declaration//GEN-END:variables
}
