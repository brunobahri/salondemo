package com.salondemo;

import com.salondemo.controllers.ClientController;
import com.salondemo.models.Client;
import com.salondemo.models.ClientList;
import com.salondemo.views.ClientView;
import com.salondemo.views.ClientListView;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Controle de Agendamentos - Salão");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        Client model = new Client("", "", null, null, "");
        ClientList clientList = new ClientList();

        ClientView clientView = new ClientView();
        ClientListView clientListView = new ClientListView();

        ClientController controller = new ClientController(model, clientView, clientListView, clientList);

        JPanel mainPanel = new JPanel(new CardLayout());
        mainPanel.add(clientView, "ClientView");
        mainPanel.add(clientListView, "ClientListView");

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opções");
        JMenuItem addClientMenuItem = new JMenuItem("Adicionar Cliente");
        JMenuItem viewClientsMenuItem = new JMenuItem("Ver Clientes");

        addClientMenuItem.addActionListener(e -> {
            CardLayout cl = (CardLayout) (mainPanel.getLayout());
            cl.show(mainPanel, "ClientView");
        });

        viewClientsMenuItem.addActionListener(e -> {
            CardLayout cl = (CardLayout) (mainPanel.getLayout());
            cl.show(mainPanel, "ClientListView");
        });

        menu.add(addClientMenuItem);
        menu.add(viewClientsMenuItem);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
