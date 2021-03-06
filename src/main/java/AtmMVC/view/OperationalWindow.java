package AtmMVC.view;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OperationalWindow extends javax.swing.JFrame {

    public OperationalWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbGreetins = new javax.swing.JLabel();
        jlblBalance = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jbtnDepositConfirm = new javax.swing.JButton();
        jlblDepositView = new javax.swing.JLabel();
        textHelp1 = new javax.swing.JLabel();
        textHelp2 = new javax.swing.JLabel();
        textHelp3 = new javax.swing.JLabel();
        jbtnFifty = new javax.swing.JButton();
        jbtnOneHundred = new javax.swing.JButton();
        jbtnTwoHundred = new javax.swing.JButton();
        jbtnHalfThounsand = new javax.swing.JButton();
        jbtnOneThounsand = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnConfirmExtraction = new javax.swing.JButton();
        jbtnClearExtraction = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnExtractionAll = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtExtraction = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPaneSearch1 = new javax.swing.JPanel();
        search4 = new javax.swing.JLabel();
        search5 = new javax.swing.JLabel();
        search6 = new javax.swing.JLabel();
        jTxtSearch = new javax.swing.JTextField();
        jlblTransfer = new javax.swing.JLabel();
        jbtnAceptClient = new javax.swing.JButton();
        jbtnClearTransfer = new javax.swing.JButton();
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
        jPanel4 = new javax.swing.JPanel();
        jbtnChangePIN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jbtnPrint = new javax.swing.JButton();
        jbtnPrint2 = new javax.swing.JButton();
        jbtnPrint3 = new javax.swing.JButton();
        jbtnPrint4 = new javax.swing.JButton();
        btnExitOp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jlbGreetins.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jlbGreetins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbGreetins.setBorder(javax.swing.BorderFactory.createTitledBorder("¡ Hola !"));

        jlblBalance.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblBalance.setBorder(javax.swing.BorderFactory.createTitledBorder("Tu saldo actual es:"));

        jbtnDepositConfirm.setText("Confirmar");
        jbtnDepositConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDepositConfirmActionPerformed(evt);
            }
        });

        jlblDepositView.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jlblDepositView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDepositView.setBorder(javax.swing.BorderFactory.createTitledBorder("Dinero ingresado ($)"));

        textHelp1.setText("Ingresa el dinero que quieras depositar");

        textHelp2.setText("Recuerda que el cajero no te lo devolverá.");

        textHelp3.setText("Una vez que lo hayas hecho, presiona confirmar.");

        jbtnFifty.setText("$50");
        jbtnFifty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFiftyActionPerformed(evt);
            }
        });

        jbtnOneHundred.setText("$100");
        jbtnOneHundred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOneHundredActionPerformed(evt);
            }
        });

        jbtnTwoHundred.setText("$200");
        jbtnTwoHundred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTwoHundredActionPerformed(evt);
            }
        });

        jbtnHalfThounsand.setText("$500");
        jbtnHalfThounsand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHalfThounsandActionPerformed(evt);
            }
        });

        jbtnOneThounsand.setText("$1000");
        jbtnOneThounsand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOneThounsandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textHelp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textHelp3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textHelp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlblDepositView, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12))
                        .addComponent(jbtnDepositConfirm, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnFifty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnOneHundred)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnTwoHundred))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jbtnHalfThounsand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnOneThounsand)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textHelp1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textHelp2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textHelp3))
                    .addComponent(jlblDepositView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnFifty)
                    .addComponent(jbtnOneHundred)
                    .addComponent(jbtnTwoHundred))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnOneThounsand)
                    .addComponent(jbtnHalfThounsand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnDepositConfirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Depósito", jPanel1);

        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnConfirmExtraction.setText("Confirmar");
        jbtnConfirmExtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmExtractionActionPerformed(evt);
            }
        });

        jbtnClearExtraction.setText("Borrar");
        jbtnClearExtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearExtractionActionPerformed(evt);
            }
        });

        jLabel1.setText("$");

        jbtnExtractionAll.setText("Extraer todo");
        jbtnExtractionAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExtractionAllActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingresa el monto a extraer, luego presiona en confirmar. O extrae todo,");

        jLabel3.setText("hasta un límite de $10000.00.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtExtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jbtn1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtn2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtn3))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbtn0)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jbtn7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtn8)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtn9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbtnConfirmExtraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnExtractionAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbtn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnClearExtraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtExtraction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbtnConfirmExtraction)
                                .addGap(35, 35, 35)
                                .addComponent(jbtnExtractionAll))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtn1)
                                    .addComponent(jbtn2)
                                    .addComponent(jbtn3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtn4)
                                    .addComponent(jbtn5)
                                    .addComponent(jbtn6)
                                    .addComponent(jbtnClearExtraction))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtn7)
                                    .addComponent(jbtn8)
                                    .addComponent(jbtn9))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn0)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Extracción", jPanel2);

        search4.setText("Para hacer una trasnferencia, ingresa");

        search5.setText("el número de cuenta a transferir:");

        search6.setText("Cuenta:");

        jlblTransfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jbtnAceptClient.setText("Aceptar");
        jbtnAceptClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptClientActionPerformed(evt);
            }
        });

        jbtnClearTransfer.setText("Borrar");
        jbtnClearTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearTransferActionPerformed(evt);
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
                        .addComponent(jTxtSearch))
                    .addGroup(jPaneSearch1Layout.createSequentialGroup()
                        .addGroup(jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search4)
                            .addComponent(search5)
                            .addGroup(jPaneSearch1Layout.createSequentialGroup()
                                .addComponent(jbtnAceptClient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnClearTransfer)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPaneSearch1Layout.setVerticalGroup(
            jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneSearch1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search6)
                    .addComponent(jTxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAceptClient)
                    .addComponent(jbtnClearTransfer))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPnlKeyboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jTabbedPane1.addTab("Transferencia/Pagos", jPanel3);

        jbtnChangePIN.setText("Cambiar PIN");

        jLabel4.setText("Habilitar verificación de seguridad:");

        jToggleButton1.setText("Habilitar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnChangePIN)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnChangePIN)
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jToggleButton1))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Configuración", jPanel4);

        jbtnPrint.setText("Imprimir últimos movimientos");

        jbtnPrint2.setText("Imprimir comprobante");

        jbtnPrint3.setText("Imprimir resumen de sueldo");

        jbtnPrint4.setText("Ver últimos movimientos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbtnPrint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(jbtnPrint3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbtnPrint2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnPrint4)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPrint)
                    .addComponent(jbtnPrint3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPrint4)
                    .addComponent(jbtnPrint2))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comprobantes", jPanel5);

        btnExitOp.setText("Finalizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbGreetins, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExitOp)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExitOp)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlblBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlbGreetins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(29, 29, 29))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnHalfThounsandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHalfThounsandActionPerformed
        Counter(500);
        jlblDepositView.setText(String.valueOf(count));
    }//GEN-LAST:event_jbtnHalfThounsandActionPerformed

    private void jbtnFiftyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFiftyActionPerformed
        Counter(50);
        jlblDepositView.setText(String.valueOf(count));
    }//GEN-LAST:event_jbtnFiftyActionPerformed

    private void jbtnOneHundredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOneHundredActionPerformed
        Counter(100);
        jlblDepositView.setText(String.valueOf(count));
    }//GEN-LAST:event_jbtnOneHundredActionPerformed

    private void jbtnTwoHundredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTwoHundredActionPerformed
        Counter(200);
        jlblDepositView.setText(String.valueOf(count));
    }//GEN-LAST:event_jbtnTwoHundredActionPerformed

    private void jbtnOneThounsandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOneThounsandActionPerformed
        Counter(1000);
        jlblDepositView.setText(String.valueOf(count));
    }//GEN-LAST:event_jbtnOneThounsandActionPerformed

    private void jbtnDepositConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDepositConfirmActionPerformed

    }//GEN-LAST:event_jbtnDepositConfirmActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        KeyboardATM.keyboard('1', jtxtExtraction);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        KeyboardATM.keyboard('2', jtxtExtraction);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        KeyboardATM.keyboard('3', jtxtExtraction);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        KeyboardATM.keyboard('6', jtxtExtraction);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        KeyboardATM.keyboard('5', jtxtExtraction);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        KeyboardATM.keyboard('4', jtxtExtraction);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        KeyboardATM.keyboard('8', jtxtExtraction);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        KeyboardATM.keyboard('9', jtxtExtraction);
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        KeyboardATM.keyboard('0', jtxtExtraction);
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnConfirmExtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmExtractionActionPerformed

    }//GEN-LAST:event_jbtnConfirmExtractionActionPerformed

    private void jbtnClearExtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearExtractionActionPerformed
        jtxtExtraction.setText("");
    }//GEN-LAST:event_jbtnClearExtractionActionPerformed

    private void jbtnExtractionAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExtractionAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnExtractionAllActionPerformed

    private void jbtnClearTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearTransferActionPerformed
        jTxtSearch.setText("");
        jlblTransfer.setText("");
    }//GEN-LAST:event_jbtnClearTransferActionPerformed

    private void keytransfer01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer01ActionPerformed
        KeyboardATM.keyboard('1', jTxtSearch);
    }//GEN-LAST:event_keytransfer01ActionPerformed

    private void keytransfer02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer02ActionPerformed
        KeyboardATM.keyboard('2', jTxtSearch);
    }//GEN-LAST:event_keytransfer02ActionPerformed

    private void keytransfer03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer03ActionPerformed
        KeyboardATM.keyboard('3', jTxtSearch);
    }//GEN-LAST:event_keytransfer03ActionPerformed

    private void keytransfer06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer06ActionPerformed
        KeyboardATM.keyboard('6', jTxtSearch);
    }//GEN-LAST:event_keytransfer06ActionPerformed

    private void keytransfer05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer05ActionPerformed
        KeyboardATM.keyboard('5', jTxtSearch);
    }//GEN-LAST:event_keytransfer05ActionPerformed

    private void keytransfer04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer04ActionPerformed
        KeyboardATM.keyboard('4', jTxtSearch);
    }//GEN-LAST:event_keytransfer04ActionPerformed

    private void keytrasnfer00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytrasnfer00ActionPerformed
        KeyboardATM.keyboard('0', jTxtSearch);
    }//GEN-LAST:event_keytrasnfer00ActionPerformed

    private void jbtnAceptClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptClientActionPerformed

    }//GEN-LAST:event_jbtnAceptClientActionPerformed

    private void keytransfer08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer08ActionPerformed
        KeyboardATM.keyboard('8', jTxtSearch);
    }//GEN-LAST:event_keytransfer08ActionPerformed

    private void keytransfer09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer09ActionPerformed
        KeyboardATM.keyboard('9', jTxtSearch);
    }//GEN-LAST:event_keytransfer09ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        KeyboardATM.keyboard('7', jtxtExtraction);
    }//GEN-LAST:event_jbtn7ActionPerformed
    private int Counter(int sum) {
        return count += sum;
    }

    public void clearCounter() {
        jlblDepositView.setText(null);
        this.count = 0;
    }

    public void clearTransfer() {
        jTxtSearch.setText(null);
        jlblTransfer.setText(null);
    }

    private int count;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExitOp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPaneSearch1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPnlKeyboard;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JTextField jTxtSearch;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    public javax.swing.JButton jbtnAceptClient;
    public javax.swing.JButton jbtnChangePIN;
    private javax.swing.JButton jbtnClearExtraction;
    private javax.swing.JButton jbtnClearTransfer;
    public javax.swing.JButton jbtnConfirmExtraction;
    public javax.swing.JButton jbtnDepositConfirm;
    public javax.swing.JButton jbtnExtractionAll;
    private javax.swing.JButton jbtnFifty;
    private javax.swing.JButton jbtnHalfThounsand;
    private javax.swing.JButton jbtnOneHundred;
    private javax.swing.JButton jbtnOneThounsand;
    public javax.swing.JButton jbtnPrint;
    public javax.swing.JButton jbtnPrint2;
    public javax.swing.JButton jbtnPrint3;
    public javax.swing.JButton jbtnPrint4;
    private javax.swing.JButton jbtnTwoHundred;
    public javax.swing.JLabel jlbGreetins;
    public javax.swing.JLabel jlblBalance;
    public javax.swing.JLabel jlblDepositView;
    public javax.swing.JLabel jlblTransfer;
    public javax.swing.JTextField jtxtExtraction;
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
    private javax.swing.JLabel search4;
    private javax.swing.JLabel search5;
    private javax.swing.JLabel search6;
    private javax.swing.JLabel textHelp1;
    private javax.swing.JLabel textHelp2;
    private javax.swing.JLabel textHelp3;
    // End of variables declaration//GEN-END:variables

}
