/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtmMVC.controler;

import AtmMVC.model.ATM;
import AtmMVC.model.AtmModel;
import AtmMVC.model.Card;
import AtmMVC.model.Customer;
import AtmMVC.model.IllegalBalanceException;
import AtmMVC.model.Observer;
import AtmMVC.model.QueryConnection;
import AtmMVC.view.LoginWindow;
import AtmMVC.view.OperationalWindow;
import AtmMVC.view.TransferJDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
class ControlerOperational implements ActionListener, ControlerInterface, Observer {

    private AtmModel model;
    private QueryConnection con;
    private Card card;
    private Customer customer;
    private OperationalWindow op;
    private ATM atm;
    private LoginWindow login;
    private TransferJDialog transfer;

    public ControlerOperational(AtmModel model, QueryConnection con, Customer customer, Card card, ATM atm) {
        this.model = model;
        this.con = con;
        this.customer = customer;
        this.card = card;
        this.atm = atm;
        this.op = new OperationalWindow();
        this.transfer = new TransferJDialog(op, true);
    }

    @Override
    public void init() {
        op.setVisible(true);
        op.btnExitOp.addActionListener(this);
        op.jbtnAceptClient.addActionListener(this);
        op.jbtnConfirmExtraction.addActionListener(this);
        op.jbtnDepositConfirm.addActionListener(this);
        op.jlbGreetins.setText(customer.getFirstName() + ", " + customer.getLastName());
        op.jlblBalance.setText("$" + String.valueOf(customer.getBalance()));
        transfer.setVisible(false);
    }

    @Override
    public void close() {
        op.setVisible(false);
        ControlerInterface login = new ControlerLogin(model, con, customer, card, atm);
        login.init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == op.btnExitOp) {
            close();
        }
        if (e.getSource() == op.jbtnDepositConfirm) {
            try {
                model.makeDeposit(Float.parseFloat(op.jlblDepositView.getText()), customer, con, atm);
                update();
                op.clearCounter();
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Debes ingresar primero el dinero", "Houston tenemos un problema", JOptionPane.OK_OPTION);
            }
        }

        if (e.getSource() == op.jbtnConfirmExtraction) {
            try {
                model.makeExtraction(Float.parseFloat(op.jtxtExtraction.getText()), customer, con, atm);
                update();
                op.jtxtExtraction.setText("");
            } catch (IllegalBalanceException IBE) {
                JOptionPane.showMessageDialog(null, IBE.infoError(), "Houston tenemos un problema", JOptionPane.OK_OPTION);
                op.jtxtExtraction.setText("");
            }
        }

        if (e.getSource() == op.jbtnAceptClient) {
            try {
                Customer custTemp = new Customer();
                con.getCustomer(Integer.parseInt(op.jTxtSearch.getText()), custTemp);
                if (custTemp.getCustomerId() == 0) {
                    op.clearTransfer();
                    throw new IllegalBalanceException("El cliente no existe/Factura no es válida");
                }
                op.jlblTransfer.setText(custTemp.getFirstName() + ", " + custTemp.getLastName());
                int buffer = JOptionPane.showConfirmDialog(op, "¿Confirmar?", "Transferencia", JOptionPane.YES_OPTION);
                if(buffer == JOptionPane.NO_OPTION){
                    throw new Exception();
                }
                transfer.setVisible(true);
                transfer.jbtnAceptTransfer.addActionListener(this);
                if (Integer.parseInt(transfer.jtxtAmount.getText()) != 0) {
                    model.makeTransferPayment(Integer.parseInt(transfer.jtxtAmount.getText()), customer, custTemp, con, atm);
                    update();
                    op.clearTransfer();
                    transfer.clearFields();
                } else {
                    throw new IllegalArgumentException("Introduce el valor a transferir/Pagar");
                }
            } catch (IllegalBalanceException ecust) {
                JOptionPane.showMessageDialog(null, ecust.infoError(), "Houston tenemos un problema", JOptionPane.OK_OPTION);
            } catch (IllegalArgumentException arg) {
                JOptionPane.showMessageDialog(null, arg.getMessage(), "Houston tenemos un problema", JOptionPane.OK_OPTION);
            }
            catch (Exception exp){
                op.clearTransfer();
                transfer.clearFields();
            }
        }
    }

    @Override
    public void update() {
        op.jlblBalance.setText("$" + String.valueOf(customer.getBalance()));
    }
}
