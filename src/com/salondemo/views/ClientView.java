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
    private JComboBox<String> serviceTypeComboBox;
    private JButton saveButton;

    private JTextArea observartionsField;

    public ClientView() {
        setLayout(new GridLayout(7, 2,5,5));

        // Adiciona os componentes ao painel
        add(new JLabel("Nome:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Telefone:"));
        phoneNumberField = new JTextField();
        add(phoneNumberField);

        add(new JLabel("Data:"));
        dateSpinner = new JSpinner(new SpinnerDateModel());
        dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, "dd-MM-yy"));
        add(dateSpinner);

        add(new JLabel("Horário:"));
        timeSpinner = new JSpinner(new SpinnerDateModel());
        timeSpinner.setEditor(new JSpinner.DateEditor(timeSpinner, "HH:mm"));
        add(timeSpinner);

        add(new JLabel("Tipo de Serviço:"));
        serviceTypeComboBox = new JComboBox<>(new String[]{"Corte de Cabelo", "Manicure", "Pedicure", "Massagem", "Outros"});
        add(serviceTypeComboBox);

        add(new JLabel("Observações"));
        observartionsField =  new JTextArea();
        add(observartionsField);

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

    public String getServiceType() {
        return (String) serviceTypeComboBox.getSelectedItem();
    }

    public String getObservations() {
        return observartionsField.getText();
    }

    public JButton getSaveButton() {
        return saveButton;
    }
}
