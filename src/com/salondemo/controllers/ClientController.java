package com.salondemo.controllers;

import com.salondemo.models.Client;
import com.salondemo.models.ClientList;
import com.salondemo.views.ClientView;
import com.salondemo.views.ClientListView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientController {
    private Client model;
    private ClientView clientView;
    private ClientListView clientListView;
    private ClientList clientList;

    public ClientController(Client model, ClientView clientView, ClientListView clientListView, ClientList clientList) {
        this.model = model;
        this.clientView = clientView;
        this.clientListView = clientListView;
        this.clientList = clientList;

        // Adiciona listener ao botão de salvar
        this.clientView.getSaveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setName(clientView.getName());
                model.setPhoneNumber(clientView.getPhoneNumber());
                clientList.addClient(new Client(model.getName(), model.getPhoneNumber()));
                clientListView.updateClientList(clientList.getClients());
                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
            }
        });
    }
}
