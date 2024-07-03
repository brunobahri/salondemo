package com.salondemo.views;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class ClientView extends JPanel {
    private JTextField nameField;
    private JTextField phoneNumberField;
    private JSpinner dateSpinner;
    private JSpinner timeSpinner;
    private JButton saveButton;

    public ClientView() {
        setLayout(new GridLayout(5, 2));

        // Adiciona os componentes ao painel
        add(new JLabel("Nome:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Telefone:"));
        phoneNumberField = new JTextField();
        add(phoneNumberField);

        add(new JLabel("Data:"));
        dateSpinner = new JSpinner(new SpinnerDateModel());
        dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, "yyyy-MM-dd"));
        add(dateSpinner);

        add(new JLabel("Horário:"));
        timeSpinner = new JSpinner(new SpinnerDateModel());
        timeSpinner.setEditor(new JSpinner.DateEditor(timeSpinner, "HH:mm"));
        add(timeSpinner);

        saveButton = new JButton("Salvar");
        add(saveButton);
    }

    public String getName() {
        return nameField.getText();
    }

    public String getPhoneNumber() {
        return phoneNumberField.getText();
    }

    public LocalDate getDate() {
        return ((SpinnerDateModel) dateSpinner.getModel()).getDate().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    }

    public LocalTime getTime() {
        return ((SpinnerDateModel) timeSpinner.getModel()).getDate().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalTime();
    }

    public JButton getSaveButton() {
        return saveButton;
    }
}
