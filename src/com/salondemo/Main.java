package com.salondemo;

import com.salondemo.controllers.ClientController;
import com.salondemo.models.Client;
import com.salondemo.views.ClientView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Controle de Agendamentos - Salão");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        Client model = new Client("", "");
        ClientView view = new ClientView();
        new ClientController(model, view);

        frame.add(view);
        frame.setVisible(true);
    }
}
