package AtmMVC.view;

import javax.swing.JTextField;

public class TransferJDialog extends javax.swing.JDialog {

    public TransferJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPaneSearch1 = new javax.swing.JPanel();
        search6 = new javax.swing.JLabel();
        jtxtAmount = new javax.swing.JTextField();
        jlblTransfer = new javax.swing.JLabel();
        jbtnAceptTransfer = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtnCancel = new javax.swing.JButton();
        jPnlKeyboard = new javax.swing.JPanel();
        keytrasnfer00 = new javax.swing.JButton();
        keytransfer03 = new javax.swing.JButton();
        keytransfer01 = new javax.swing.JButton();
        keytransfer02 = new javax.swing.JButton();
        keytransfer09 = new javax.swing.JButton();
        keytransfer07 = new javax.swing.JButton();
        keytransfer06 = new javax.swing.JButton();
        keytransfer05 = new javax.swing.JButton();
        keytransfer08 = new javax.swing.JButton();
        keytransfer04 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmar monto");
        setUndecorated(true);

        search6.setText("Monto $:");

        jlblTransfer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTransfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Comisión"));

        jbtnAceptTransfer.setText("Aceptar");
        jbtnAceptTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptTransferActionPerformed(evt);
            }
        });

        jbtnClear.setText("Borrar");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });

        jbtnCancel.setText("Cancelar");
        jbtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneSearch1Layout = new javax.swing.GroupLayout(jPaneSearch1);
        jPaneSearch1.setLayout(jPaneSearch1Layout);
        jPaneSearch1Layout.setHorizontalGroup(
            jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneSearch1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPaneSearch1Layout.createSequentialGroup()
                        .addComponent(search6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtAmount))
                    .addGroup(jPaneSearch1Layout.createSequentialGroup()
                        .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnAceptTransfer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPaneSearch1Layout.setVerticalGroup(
            jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneSearch1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search6)
                    .addComponent(jtxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnAceptTransfer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnClear)
                    .addComponent(jbtnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnlKeyboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        keytrasnfer00.setText("0");
        keytrasnfer00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytrasnfer00ActionPerformed(evt);
            }
        });

        keytransfer03.setText("3");
        keytransfer03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer03ActionPerformed(evt);
            }
        });

        keytransfer01.setText("1");
        keytransfer01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer01ActionPerformed(evt);
            }
        });

        keytransfer02.setText("2");
        keytransfer02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer02ActionPerformed(evt);
            }
        });

        keytransfer09.setText("9");
        keytransfer09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer09ActionPerformed(evt);
            }
        });

        keytransfer07.setText("7");

        keytransfer06.setText("6");
        keytransfer06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer06ActionPerformed(evt);
            }
        });

        keytransfer05.setText("5");
        keytransfer05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer05ActionPerformed(evt);
            }
        });

        keytransfer08.setText("8");
        keytransfer08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer08ActionPerformed(evt);
            }
        });

        keytransfer04.setText("4");
        keytransfer04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer04ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlKeyboardLayout = new javax.swing.GroupLayout(jPnlKeyboard);
        jPnlKeyboard.setLayout(jPnlKeyboardLayout);
        jPnlKeyboardLayout.setHorizontalGroup(
            jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlKeyboardLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlKeyboardLayout.createSequentialGroup()
                        .addComponent(keytransfer04)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keytransfer05)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keytransfer06))
                    .addGroup(jPnlKeyboardLayout.createSequentialGroup()
                        .addComponent(keytransfer07)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keytrasnfer00)
                            .addGroup(jPnlKeyboardLayout.createSequentialGroup()
                                .addComponent(keytransfer08)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(keytransfer09))))
                    .addGroup(jPnlKeyboardLayout.createSequentialGroup()
                        .addComponent(keytransfer01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keytransfer02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keytransfer03)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPnlKeyboardLayout.setVerticalGroup(
            jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlKeyboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keytransfer01)
                    .addComponent(keytransfer02)
                    .addComponent(keytransfer03))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keytransfer06)
                    .addComponent(keytransfer05)
                    .addComponent(keytransfer04))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keytransfer07)
                    .addComponent(keytransfer08)
                    .addComponent(keytransfer09))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keytrasnfer00)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPaneSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnlKeyboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPaneSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPnlKeyboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 2, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jtxtAmount.setText(null);
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void keytrasnfer00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytrasnfer00ActionPerformed
        keyboard('0', jtxtAmount);
    }//GEN-LAST:event_keytrasnfer00ActionPerformed

    private void keytransfer03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer03ActionPerformed
        keyboard('3', jtxtAmount);
    }//GEN-LAST:event_keytransfer03ActionPerformed

    private void keytransfer01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer01ActionPerformed
        keyboard('1', jtxtAmount);
    }//GEN-LAST:event_keytransfer01ActionPerformed

    private void keytransfer02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer02ActionPerformed
        keyboard('2', jtxtAmount);
    }//GEN-LAST:event_keytransfer02ActionPerformed

    private void keytransfer09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer09ActionPerformed
        keyboard('9', jtxtAmount);
    }//GEN-LAST:event_keytransfer09ActionPerformed

    private void keytransfer06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer06ActionPerformed
        keyboard('6', jtxtAmount);
    }//GEN-LAST:event_keytransfer06ActionPerformed

    private void keytransfer05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer05ActionPerformed
        keyboard('5', jtxtAmount);
    }//GEN-LAST:event_keytransfer05ActionPerformed

    private void keytransfer08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer08ActionPerformed
        keyboard('8', jtxtAmount);
    }//GEN-LAST:event_keytransfer08ActionPerformed

    private void keytransfer04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer04ActionPerformed
        keyboard('4', jtxtAmount);
    }//GEN-LAST:event_keytransfer04ActionPerformed

    private void jbtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCancelActionPerformed

    private void jbtnAceptTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptTransferActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnAceptTransferActionPerformed

    public void clearFields() {
        jtxtAmount.setText(null);
    }

    private void keyboard(char input, JTextField text) {
        StringBuilder str = new StringBuilder();
        str.append(text.getText());
        str.append(input);
        text.setText(str.toString());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPaneSearch1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPnlKeyboard;
    public javax.swing.JButton jbtnAceptTransfer;
    private javax.swing.JButton jbtnCancel;
    private javax.swing.JButton jbtnClear;
    public javax.swing.JLabel jlblTransfer;
    public javax.swing.JTextField jtxtAmount;
    private javax.swing.JButton keytransfer01;
    private javax.swing.JButton keytransfer02;
    private javax.swing.JButton keytransfer03;
    private javax.swing.JButton keytransfer04;
    private javax.swing.JButton keytransfer05;
    private javax.swing.JButton keytransfer06;
    private javax.swing.JButton keytransfer07;
    private javax.swing.JButton keytransfer08;
    private javax.swing.JButton keytransfer09;
    private javax.swing.JButton keytrasnfer00;
    private javax.swing.JLabel search6;
    // End of variables declaration//GEN-END:variables
}
