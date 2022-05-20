package vista.logueo;

import javax.swing.*;

public class Login implements GetterLogin {
    private JFrame ventanaLogin;
    private JPanel panelPrincipal;
    private JPanel panelSuperior;
    private JLabel labelTitulo;
    private JPanel panelInferior;
    private JLabel labelError;
    private JPanel panelCentral;
    private JTextField textEmail;
    private JPasswordField textPassword;
    private JButton botonLoguear;
    private JLabel labelLogin;
    private JLabel labelPassword;
    private JButton botonSalir;

    public Login () {
        ventanaLogin = new JFrame("Aplicación reservas");
        ventanaLogin.setContentPane(panelPrincipal);
        ventanaLogin.setSize(300,300);
        ventanaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaLogin.setLocationRelativeTo(null);
       // ventanaLogin.pack();
        ventanaLogin.setVisible(true);
    }

    @Override
    public JFrame getVentanaLogin() {
        return ventanaLogin;
    }

    @Override
    public JButton getBotonSalir() {
        return botonSalir;
    }

    @Override
    public JLabel getLabelError() {
        return labelError;
    }

    @Override
    public JTextField getTextEmail() {
        return textEmail;
    }

    @Override
    public JPasswordField getTextPassword() {
        return textPassword;
    }

    @Override
    public JButton getBotonLoguear() {
        return botonLoguear;
    }

    public static void main(String[] args) {
        new Login();
    }
}
