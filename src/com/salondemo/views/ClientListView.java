package com.salondemo.views;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import com.salondemo.models.Client;

public class ClientListView extends JPanel {
    private JList<String> clientJList;
    private DefaultListModel<String> listModel;

    public ClientListView() {
        setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        clientJList = new JList<>(listModel);
        add(new JScrollPane(clientJList), BorderLayout.CENTER);
    }

    public void updateClientList(List<Client> clients) {
        listModel.clear();
        for (Client client : clients) {
            listModel.addElement(client.getName() + " - " + client.getPhoneNumber() + " - " + client.getDate() + " - " + client.getTime() + " - " + client.getServiceType());
        }
    }
}
