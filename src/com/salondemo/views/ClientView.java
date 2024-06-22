package com.salondemo.views;

import javax.swing.*;
import java.awt.*;

public class ClientView extends JPanel {
    private JTextField nameField;
    private JTextField phoneNumberField;
    private JButton saveButton;

    public ClientView() {
        setLayout(new GridLayout(3, 2));

        // Adiciona os componentes ao painel
        add(new JLabel("Nome:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Telefone:"));
        phoneNumberField = new JTextField();
        add(phoneNumberField);

        saveButton = new JButton("Salvar");
        add(saveButton);
    }

    public String getName() {
        return nameField.getText();
    }

    public String getPhoneNumber() {
        return phoneNumberField.getText();
    }

    public JButton getSaveButton() {
        return saveButton;
    }
}
