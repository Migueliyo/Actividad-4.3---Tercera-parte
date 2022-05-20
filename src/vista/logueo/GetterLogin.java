package vista.logueo;

import javax.swing.*;

public interface GetterLogin {
    JFrame getVentanaLogin();

    JButton getBotonSalir();

    JLabel getLabelError();

    JTextField getTextEmail();

    JPasswordField getTextPassword();

    JButton getBotonLoguear();
}
