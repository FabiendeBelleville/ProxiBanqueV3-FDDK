package org.formation.service;

import java.util.List;

import org.formation.model.Client;

/**
 * 
 * @author Fabien et Diea ; interface IClientService : ne concerne que les clients
 *         : c'est la déclaration des méthodes qui vont êtres implémentées dans
 *         les classes implémentations
 *
 */
public interface IClientService {

	public void createClient(Client c);

	public Client findById(String id);

	public List<Client> findAll();

	public void updateClient(Client c);

	public Client deleteClient(Client c);

}
