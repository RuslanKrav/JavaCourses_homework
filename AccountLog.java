package com.company.lection10.homework;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountLog extends JFrame implements ActionListener {
    private JButton apply;
    private JPanel root;
    private JLabel loginCheck;
    private JLabel passwordCheck;
    private JLabel confirmPasswordCheck;
    private JTextField login;
    private JTextField password;
    private JTextField confirmPassword;

    public AccountLog() {
        createLabels();
        createTextFields();
        createButton();
        createPanel();
        add(root, BorderLayout.CENTER);
        add(apply, BorderLayout.SOUTH);
        apply.addActionListener(this);
        createFrame();
    }

    private void createFrame() {
        setTitle("LOGIN FORM");
        setSize(350, 150);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createLabels() {
        loginCheck = new JLabel("  Login:");
        passwordCheck = new JLabel("  Password:");
        confirmPasswordCheck = new JLabel("  Confirm password:");
    }

    private void createTextFields() {
        login = new JTextField(15);
        password = new JPasswordField(15);
        confirmPassword = new JPasswordField(15);
        textFieldsAlignment(CENTER_ALIGNMENT, login, password, confirmPassword);
    }

    private void textFieldsAlignment(final float alignment, JTextField... fields) {
        for (JTextField field : fields) {
            field.setHorizontalAlignment((int) alignment);
        }
    }

    private void createButton() {
        apply = new JButton("submit");
    }

    private void createPanel() {
        root = new JPanel(new GridLayout(3, 1));
        root.add(loginCheck);
        root.add(login);
        root.add(passwordCheck);
        root.add(password);
        root.add(confirmPasswordCheck);
        root.add(confirmPassword);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            checkLogInInfo(login.getText(), password.getText(), confirmPassword.getText(), "[\\w]{1,20}");
            JOptionPane.showMessageDialog(this, "Login and password are correct!",
                    "User login&password confirmation", JOptionPane.PLAIN_MESSAGE);
        } catch (WrongLoginException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "UserException", JOptionPane.ERROR_MESSAGE);
        } catch (WrongPasswordException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "UserException", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean checkLogInInfo(String login, String password, String confirmPassword, String regex)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches(regex)) {
            throw new WrongLoginException("Incorrect login");
        } else if (!password.matches(regex) ||
                !confirmPassword.matches(regex) ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Incorrect password");
        }
        return true;
    }
}
