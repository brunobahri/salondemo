package com.salondemo.models;

import java.util.ArrayList;
import java.util.List;

public class ClientList {
    private List<Client> clients;

    public ClientList() {
        clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public List<Client> getClients() {
        return clients;
    }
}
