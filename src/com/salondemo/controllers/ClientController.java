package com.salondemo.controllers;

import com.salondemo.models.Client;
import com.salondemo.views.ClientView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientController {
    private Client model;
    private ClientView view;

    public ClientController(Client model, ClientView view) {
        this.model = model;
        this.view = view;

        // Adiciona listener ao botão de salvar
        this.view.getSaveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setName(view.getName());
                model.setPhoneNumber(view.getPhoneNumber());
                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
            }
        });
    }
}
