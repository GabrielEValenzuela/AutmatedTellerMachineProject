package AtmMVC.view;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public interface KeyboardATM {

    static void keyboard(char input, JTextField text) {
        StringBuilder str = new StringBuilder();
        str.append(text.getText());
        str.append(input);
        text.setText(str.toString());
    }

    static void keyboard(char input, JPasswordField password, int MAXLENGHT) {
        if (password.getPassword().length < MAXLENGHT) {
            StringBuilder str = new StringBuilder();
            str.append(password.getPassword());
            str.append(input);
            password.setText(str.toString());
        }
    }

}