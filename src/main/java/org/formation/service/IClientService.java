package org.formation.service;

import java.util.List;

import org.formation.model.Client;

public interface IClientService {

	public void createClient(Client c);

	public Client findById(String id);

	public List<Client> findAll();

	public void updateClient(Client c);

	public Client deleteClient(Client c);

}
